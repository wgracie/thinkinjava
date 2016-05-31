package com.javacodegeeks.junit;

enum Shrubbery { GROUND, CRAWLING, HANGING }

public class EnumClass {
	public static void main(String[] args) {
		for (Shrubbery s : Shrubbery.values()) {
			System.out.println(s + " ordinal: " + s.ordinal());
			System.out.println(s.getDeclaringClass());
			System.out.println(s.name());
		}
	}
	

}
