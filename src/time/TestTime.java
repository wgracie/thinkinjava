package time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author at wgy Nov 23, 2016 2:33:51 PM
 */
public class TestTime {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(start);
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		df.setTimeZone(tz);
		System.out.println(new Date());
		String iso = df.format(new Date());
		System.out.println(iso);
		
		System.err.println(ZonedDateTime.now());
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT));
	}

}
