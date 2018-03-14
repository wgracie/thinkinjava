package arraylist;

import java.util.ArrayList;

public class LogAnalyser {
	public int countUniqueIPs() {
		ArrayList<String> uniqueIps = new ArrayList<String>();
		for(LogEntry le : records) {
			String ipAddr = le.getIpAddress();
			if(!uniqueIps.contains(le)) {
				uniqueIps.add(ipAddr);
			}
		}
		return uniqueIps.size();
	}

}
