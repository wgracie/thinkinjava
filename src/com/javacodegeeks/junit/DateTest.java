package com.javacodegeeks.junit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String format = "yyyyMMddHHmmssSSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse("20150504083001000");
		System.out.println(date.getTime());

	}

}
