package com.javacodegeeks.junit;

public class HelloA {
	public HelloA() {
		System.out.println("HelloA");
	}

	{
		System.out.println("I'm A class");
	}

	static {
		System.out.println("static A");
	}
	public static void main(String[] args){
		
		
		new HelloA();
	}
}