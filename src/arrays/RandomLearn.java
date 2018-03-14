package arrays;

import java.util.Random;

public class RandomLearn {
	public static void simpleSimulate(int rolls) {
		Random rand = new Random();
		int twos = 0;
		int twelves = 0;
		for(int k = 0; k < rolls; k++) {
			int d1 = rand.nextInt(6) + 1;
			int d2 = rand.nextInt(6) + 1;
			if(d1 + d2 == 2) {
				twos += 1;
			}
			else if (d1 + d2 == 12) {
				twelves +=1;
			}
		}
		System.out.println("2's=\t" + twos + "\t" + 100.0 * twos/rolls);
		System.out.println("12's=\t" + twelves + "\t" + 100.0 * twelves/rolls);
	}
		
		public static void main(String[] args) {
			simpleSimulate(10000);
		}


}
