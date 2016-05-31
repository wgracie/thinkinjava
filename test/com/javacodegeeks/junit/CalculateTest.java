package com.javacodegeeks.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculateTest {
	
	private int expected;
    private int first;
    private int second;
    
    public CalculateTest(int expected, int first, int second) {
    	this.expected = expected;
    	this.first = first;
    	this.second = second;
    }
    
    @Parameters
    public static Collection addedNumbers() {
    	return Arrays.asList(new Integer[][] {{ 3, 1, 2}, {5, 3, 2}, {7, 3, 4}});
    	
    }
    

	@Test
	public void sum() {
		Calculate add = new Calculate();
		System.out.println("Addition with parameters: " + first + " and " + second);
		assertEquals(expected, add.sum(first, second));

	}

}
