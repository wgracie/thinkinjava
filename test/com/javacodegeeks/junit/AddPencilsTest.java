package com.javacodegeeks.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddPencilsTest {
	
	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag = { "Books", "NoteBooks", "Pens", "Pencils" };

	@Test
	public void test() {
		System.out.println("Inside AddPencilsTest()");
		assertArrayEquals(bag, school.addPencils());
	}

}
