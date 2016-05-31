package com.javacodegeeks.junit;

public enum EnumSpaceShip {
	SCOUN,  CARGO, TRANSPORT,CRUISER,BATTLESHIP,MOTHERSHIP;
	public String toString() {
		String id = name();
		String lower = id.substring(1).toLowerCase();
		return id.charAt(0) + lower;
	}


	public static void main(String[] args) {
		for (EnumSpaceShip s: values()) {
			System.out.println(s);
		}

	}

}
