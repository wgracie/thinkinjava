package strings;

import java.util.Scanner;

public class BetterRead {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(SimpleRead.input);
		System.out.println("What is your name?");
		String name = stdin.nextLine();
		System.out.println(name);
		System.out.println("How old are you? What is your favourite double?");
		System.out.println("(input: <age> <double>)");
		int age = stdin.nextInt();
		double favourite = stdin.nextDouble();
		System.out.println(age);
		System.out.println(favourite);
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 year you will be %d.\n", age + 5);
		System.out.format("My favourite double is %f.\n", favourite / 2);
	}

}
