package arraylist;

import java.util.Locale;

public class Tester {
	public static void main(String[] args) {		
//		LogAnalyser la = new LogAnalyser();
//		la.readFile("short-test_log");
//		System.out.println(la.countUniqueIPsInRange(200, 299));
//		System.out.println(la.countUniqueIPsInRange(300, 399));
		System.setProperty("user.timezone","UTC");
		LogAnalyser la2 = new LogAnalyser();
		la2.readFile("weblog1_log");
		la2.printAll();
		System.out.println(la2.uniqueIPVisitsOnDay("Mar 17").size());
	}

}
