package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import edu.duke.FileResource;

public class LogAnalyser {
	private ArrayList<LogEntry> records;
	
	public LogAnalyser() {
		// complete constructor
		records = new ArrayList<LogEntry>();		
	}
	
	public void readFile(String filename) {
		records = new ArrayList<LogEntry>();
		FileResource fr = new FileResource(filename);		
		for(String line : fr.lines()) {
			LogEntry le = WebLogParser.parseEntry(line);
			records.add(le);
		}
	}
	
	public void readFileWithUniqueStatus(String filename) {
		records = new ArrayList<LogEntry>();
		FileResource fr = new FileResource(filename);		
		for(String line : fr.lines()) {			
			LogEntry le = WebLogParser.parseEntry(line);
			int status = le.getStatusCode();
			boolean existed = false;
			for(LogEntry record : records) {
				if(record.getStatusCode() == status) {
					existed = true;
					break;
				}
			}
			if(!existed) {
				records.add(le);
			}
			
		}
	}
	public int countUniqueIPs() {
		ArrayList<String> uniqueIps = new ArrayList<String>();
		for(LogEntry le : records) {
			String ipAddr = le.getIpAddress();
			if(!uniqueIps.contains(ipAddr)) {
				uniqueIps.add(ipAddr);
			}
		}
		return uniqueIps.size();
	}
	
	public void printAllHigherThanNum(int status) {
		for(LogEntry le : records) {
			if(le.getStatusCode() > status) {
				System.out.println(le.getStatusCode());
			}
		}
	}
	
	public ArrayList<String> uniqueIPVisitsOnDay(String someday) {
		ArrayList<String> uniqueIps = new ArrayList<String>();
		for(LogEntry le : records) {
			String ipAddr = le.getIpAddress();
			String date = le.getAccessTime().toString();			
			String day = date.substring(4, 10);
			if(someday.equals(day)) {
				if(!uniqueIps.contains(ipAddr)) {
					uniqueIps.add(ipAddr);
				}
			}
		}
		return uniqueIps;		
	}
	
	public int countUniqueIPsInRange(int low, int high) {
		ArrayList<String> uniqueIps = new ArrayList<String>();
		for(LogEntry le : records) {
			String ipAddr = le.getIpAddress();
			int status = le.getStatusCode();
			if(status >= low && status <= high) {
				if(!uniqueIps.contains(ipAddr)) {
					uniqueIps.add(ipAddr);
				}
			}
		}
		return uniqueIps.size();
	}
	
	public HashMap<String, Integer> countVisitsPerIP() {
		HashMap<String, Integer> visits = new HashMap<String, Integer>();
		for(LogEntry le : records) {
			String ip = le.getIpAddress();
			if(visits.containsKey(ip)) {
				visits.put(ip, visits.get(ip) + 1);
			}
			else {
				visits.put(ip, 1);
			}
			
		}
		return visits;
	}
	
	public int mostNumberVisitsByIP(HashMap<String, Integer> visits) {
		int max = 0;
		for(String ip : visits.keySet()) {
			if(visits.get(ip) > max) 
				max = visits.get(ip);
		}
		return max;
	}
	
	public ArrayList<String> iPsMostVisits() {
		HashMap<String, Integer> visits = countVisitsPerIP();
		ArrayList<String> mostIPs = new ArrayList<String>();
		int max = mostNumberVisitsByIP(visits);
		for(String ip : visits.keySet()) {
			if(visits.get(ip).equals(Integer.valueOf(max))) {
				mostIPs.add(ip);				
			}
		}
		return mostIPs;
	}
	
	public HashMap<String, ArrayList<String>> iPsForDays() {
		HashMap<String, ArrayList<String>> ipsForDays = new HashMap<String, ArrayList<String>>();
		for(LogEntry le : records) {
			String day = le.getAccessTime().toString().substring(4, 10);
			if(!ipsForDays.containsKey(day)) {
				ipsForDays.put(day, new ArrayList<String>(Arrays.asList(le.getIpAddress())));
			}
			else {
				ipsForDays.get(day).add(le.getIpAddress());
			}
		}
		return ipsForDays;
	}
	
	public String dayWithMostIPVisits(HashMap<String, ArrayList<String>> iPsForDays) {
		String mostDay = "";
		int max = 0;
		for(String day: iPsForDays.keySet()) {
			if(iPsForDays.get(day).size() > max) {
				mostDay = day;
			}
		}
		return mostDay;		
	}
	
	public ArrayList<String> iPsWithMostVisitsOnDay(HashMap<String, ArrayList<String>> ipsForDays, String day) {
		ArrayList<String> ips = ipsForDays.get(day);
		ArrayList<String> mostIps = new ArrayList<String>(); 
		HashMap<String, Integer> ipVisits = new HashMap<String, Integer>(); 
		for(String ip : ips) {
			if(!ipVisits.containsKey(ip)) {
				ipVisits.put(ip, 1);
			}
			else {
				ipVisits.put(ip, ipVisits.get(ip) + 1);
			}
		}
		int max = 0;
		for(String ip : ipVisits.keySet()) {
			if(ipVisits.get(ip) > max) {
				max = ipVisits.get(ip);
			}
		}
		for(String ip : ipVisits.keySet()) {
			if(max == ipVisits.get(ip)) {
				mostIps.add(ip);
			}
		}
		return mostIps;
	}
	
	
	
	public void printAll() {
		for (LogEntry le : records) {
			System.out.println(le);
		}
	}

}
