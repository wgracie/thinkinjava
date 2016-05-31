package concurrency;

import java.util.concurrent.Callable;

public class Fibonacci implements Callable<String> {
	private int count  = 0;
	public Fibonacci(int count) {
		this.count = count;
	}
	public Integer next() { return fib(count++);}
	private int fib(int n) {
		if(n < 2) return 1;
		return fib(n-2) + fib(n-1);
	}
	
	public int sum(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = sum + fib(i);
		}
		return sum;
	}
	public String call() {
		return "the sum of " + count + " fibonacci numbers is " + sum(count);
		
	}
}
