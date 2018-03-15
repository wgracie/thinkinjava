package arraylist;

import java.util.Date;
import java.util.TimeZone;

public class LogEntry {
	private String ipAddress;
	public String getIpAddress() {
		return ipAddress;
	}

	public Date getAccessTime() {
		return accessTime;
	}

	public String getRequest() {
		return request;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public int getBytesReturned() {
		return bytesReturned;
	}

	private Date accessTime;
	private String request;
	private int statusCode;
	private int bytesReturned;
	
	public LogEntry(String ip, Date time, String req, int status, int bytes) {
		ipAddress = ip;
		accessTime = time;
		request = req;
		statusCode = status;
		bytesReturned = bytes;
	}
	
	public String toString() {
		return ipAddress + " " + accessTime + " " + request + " " + statusCode + " " + bytesReturned;		
	}


}
