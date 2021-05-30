package com.collection;

import java.util.List;
import java.util.LinkedList;


public class JavaCollectionDemo {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("Nagesh");
		list.add("Mahesh");
		list.add("Rahul");
		list.add("Ramesh");
		
		list.addAll(list);			
		System.out.println("List" +list);
	}
}
