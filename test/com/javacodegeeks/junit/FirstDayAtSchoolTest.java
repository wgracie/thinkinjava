package com.javacodegeeks.junit;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class FirstDayAtSchoolTest {
	
	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag1 = { "Books", "NoteBooks", "Pens" };
	String[] bag2 = { "Books", "NoteBooks", "Pens", "Pencils" };

	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMybag()");
		assertArrayEquals(bag1, school.prepareMyBag());
	}
	
	@Ignore
	@Test
	public void testAddPencils() {
		System.out.println("Inside AddPencilsTest()");
		assertArrayEquals(bag2, school.addPencils());
	}

}
