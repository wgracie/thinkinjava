package arrays;

import java.util.Arrays;
import java.util.Random;

public class IceCream {
	private static Random rand = new Random(47);
	static final String[] FLAVOURS = {
			"Chocalate", "Strawberry", "Vanilla Fudge Swirl",
			"Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
			"Praline Cream", "Mud Pie"
	};
	
	public static String[] flavorSet(int n) {
		if(n > FLAVOURS.length) {
			throw new IllegalArgumentException("Set too big");
		}
		String[] results = new String[n];
		boolean[] picked = new boolean[FLAVOURS.length];
		for(int i = 0; i < n; i++) {
			int t;
			do
				t = rand.nextInt(FLAVOURS.length);
			while(picked[t]);
			results[i] = FLAVOURS[t];
			picked[t] = true;
		}
		return results;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(flavorSet(3)));
			System.out.println(flavorSet(3));		
	}
	}

}
