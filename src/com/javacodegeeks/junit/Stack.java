package com.javacodegeeks.junit;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v) { storage.addLast(v); }
	public T pop() { return storage.removeLast();}
	public T peek() { return storage.getFirst(); }
	public boolean empty() { return storage.isEmpty(); }
	public String toString() { return storage.toString(); }


	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("first");
		stack.push("second");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.push("fourth");
		System.out.println(stack);
		
		for (String s: "my dog has fleas".split(" "))
			stack.push(s);
		
		while(!stack.empty())
			System.out.print(stack.pop() + " ");

	}

}
