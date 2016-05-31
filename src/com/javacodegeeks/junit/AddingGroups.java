package com.javacodegeeks.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGroups {

	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = {6, 7 , 8, 9, 10};
		collection.addAll(Arrays.asList(moreInts));
		System.out.println(collection);
		
		Collections.addAll(collection, 11,12,13);
		System.out.println(collection);
		Collections.addAll(collection, moreInts);
		System.out.println(collection);

	}

}
