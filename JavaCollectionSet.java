package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class JavaCollectionSet {
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("Nagesh");
		set.add("Mahesh");
		set.add("Rahul");
		set.add("Ramesh");
		
		set.addAll(set);			
		System.out.println("Set" +set);
	}
}
