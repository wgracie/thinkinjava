package arraylist;

public class UniqueIpTester {
	public static void main(String[] args) {
		LogAnalyser la = new LogAnalyser();
		la.readFile("weblog-short_log");
		la.printAll();
		System.out.println(la.countUniqueIPs());
	}

}
