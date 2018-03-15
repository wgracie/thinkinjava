package arraylist;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogAnalyserTest {	
	private LogAnalyser la = new LogAnalyser();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("user.timezone","UTC");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCountUniqueIPs() {
		la.readFile("weblog2_log");
		assertEquals(la.countUniqueIPs(), 45);
	}

	@Test
	public void testUniqueIPVisitsOnDay() {
		la.readFile("weblog-short_log");
		assertEquals(la.uniqueIPVisitsOnDay("Sep 14").size(), 2);
		assertEquals(la.uniqueIPVisitsOnDay("Sep 30").size(), 3);
		la.readFile("weblog2_log");
		assertEquals(la.uniqueIPVisitsOnDay("Sep 27").size(), 8);
	}

	@Test
	public void testCountUniqueIPsInRange() {
		la.readFile("short-test_log");
		assertEquals(la.countUniqueIPsInRange(200, 299), 4);
		assertEquals(la.countUniqueIPsInRange(300, 399), 2);
		la.readFile("weblog2_log");
		assertEquals(la.countUniqueIPsInRange(200, 299), 40);
	}

	@Test
	public void testMostNumberVisitsByIP() {
		la.readFile("weblog3-short_log");
		assertEquals(la.mostNumberVisitsByIP(la.countVisitsPerIP()), 3);
		la.readFile("weblog1_log");
		assertEquals(la.mostNumberVisitsByIP(la.countVisitsPerIP()), 133);
		la.readFile("weblog2_log");
		assertEquals(la.mostNumberVisitsByIP(la.countVisitsPerIP()), 63);
	}
	
	@Test
	public void testIPsMostVisits() {
		la.readFile("weblog3-short_log");
		assertEquals(la.iPsMostVisits(), new ArrayList<String>(Arrays.asList("61.15.121.171", "84.133.195.161")));
		la.readFile("weblog1_log");
		assertEquals(la.iPsMostVisits(), new ArrayList<String>(Arrays.asList("84.190.182.222")));
		la.readFile("weblog2_log");
		assertEquals(la.iPsMostVisits(), new ArrayList<String>(Arrays.asList("188.162.84.63")));
		
	}
	
	@Test
	public void testIPsForDays() {
		la.readFile("weblog3-short_log");
		assertEquals(la.iPsForDays().get("Sep 14").size(), 1);
		assertEquals(la.iPsForDays().get("Sep 21").size(), 4);
		assertEquals(la.iPsForDays().get("Sep 30").size(), 5);
	}
	
	@Test
	public void testDayWithMostIPVisits() {
		la.readFile("weblog3-short_log");
		assertEquals(la.dayWithMostIPVisits(la.iPsForDays()), "Sep 30");
		la.readFile("weblog1_log");
		assertEquals(la.dayWithMostIPVisits(la.iPsForDays()), "Mar 19");
		la.readFile("weblog2_log");
		assertEquals(la.dayWithMostIPVisits(la.iPsForDays()), "Sep 29");
	}
	
	@Test
	public void testIPsWithMostVisitsOnDay() {
		la.readFile("weblog3-short_log");
		assertEquals(la.iPsWithMostVisitsOnDay(la.iPsForDays(), "Sep 30"), 
				new ArrayList<String>(Arrays.asList("61.15.121.171", "177.4.40.87")));
		la.readFile("weblog1_log");
		assertEquals(la.iPsWithMostVisitsOnDay(la.iPsForDays(), "Mar 17"), 
				new ArrayList<String>(Arrays.asList("200.129.163.70")));
		la.readFile("weblog2_log");
		assertEquals(la.iPsWithMostVisitsOnDay(la.iPsForDays(), "Sep 29"), 
				new ArrayList<String>(Arrays.asList("212.128.74.248")));
	}

}
