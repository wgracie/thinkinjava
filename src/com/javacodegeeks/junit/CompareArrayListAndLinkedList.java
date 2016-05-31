package com.javacodegeeks.junit;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareArrayListAndLinkedList {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		int size = 100000;
		
		// ArrayList add
		long startTime = System.nanoTime();
		
		for (int i = 0; i < size; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("ArrayList add: " + duration);
		
		// LinkedList add
		startTime = System.nanoTime();
		for (int i = 0; i < size; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList add: " + duration);
		
		// ArrayList get
		startTime = System.nanoTime();
		for (int i = 0; i < size; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList get: " + duration);
		
		// LinkedList get
		startTime = System.nanoTime();
		for (int i = 0; i < size; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList get: " + duration);
		
				// ArrayList remove
		startTime = System.nanoTime();
		for (int i = 99999; i >= 0; i--) {
			arrayList.remove(0);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList remove: " + duration);
		
		// LinkedList remove
		startTime = System.nanoTime();
		for (int i = 99999; i >= 0; i--) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList remove: " + duration);
		
		// ArrayList insert
		startTime = System.nanoTime();
		for (int i = 0; i < size; i++) {
			arrayList.add(0, i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList insert: " + duration);
		
		// LinkedList insert
		startTime = System.nanoTime();
		for (int i = 0; i < size; i++) {
			linkedList.add(0, i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList insert: " + duration);
		
		

	}

}
