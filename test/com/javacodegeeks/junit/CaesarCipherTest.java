package com.javacodegeeks.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import strings.CaesarCipher;

public class CaesarCipherTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("BCD", new CaesarCipher(1).encrypt("ABC"));
	}

}
