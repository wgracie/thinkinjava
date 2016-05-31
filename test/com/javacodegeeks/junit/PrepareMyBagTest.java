package com.javacodegeeks.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrepareMyBagTest {
	
	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag = { "Books", "NoteBooks", "Pens" };

	@Test
	public void test() {
		System.out.println("Inside testPrepareMybag()");
		assertArrayEquals(bag, school.prepareMyBag());
	}

}
