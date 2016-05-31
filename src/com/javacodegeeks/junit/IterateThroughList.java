package com.javacodegeeks.junit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateThroughList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("zhifubao");
		list.add("weixin");
		list.add("Amazon");
		list.add("JingDong");
		
		System.out.println("====Advanced For loop=====");
		for(String temp: list) {
			System.out.println(temp);
		}
		
		System.out.println("=====Iterator loop========");
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("===jdk1.8 collection stream util===");
		list.forEach((temp) -> {
			System.out.println(temp);
		}
		);
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.addAll(list);
		
		System.out.println("=====LinkedList=======");
		System.out.println(linkedlist.getFirst());
		System.out.println(linkedlist.element());
		System.out.println(linkedlist.removeFirst());
		System.out.println(linkedlist.peek());
		

	}

}
