package com.javacodegeeks.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RotateArrayTest {
	RotateArray ra = new RotateArray();

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[] nums = {1, 2, 3, 4, 5};
		int k = 3;
		int[] expected = {3, 4, 5, 1, 2};
		ra.rotate(nums,k);
		System.out.print(Arrays.toString(nums));
		assertArrayEquals(nums, expected);
	}

}
