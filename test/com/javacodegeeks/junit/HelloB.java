package com.javacodegeeks.junit;

public class HelloB extends HelloA {
	
	public HelloB() {
		System.out.println("HelloB");
	}

	{
		System.out.println("I'm B class");
	}

	static {
		System.out.println("static B");
	}

	
}
