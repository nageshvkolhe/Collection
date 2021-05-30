package com.collection;

import java.util.Stack;

public class JavaCollectionStack {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Nagesh");
		stack.push("Mahesh");
		stack.push("Rahul");
		stack.push("Ramesh");
		
		stack.pop();
					
		System.out.println("Stack" +stack);
	}
}
