package com.collection;

import java.util.HashMap;
import java.util.Map;


public class JavaCollectionMap {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "Nagesh");
		map.put(105, "Mahesh");
		map.put(108, "Rahul");
		map.put(110, "Ramesh");
		
		for (Map.Entry m : map.entrySet()) {			
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
