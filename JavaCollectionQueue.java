package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class JavaCollectionQueue {
	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("Nagesh");
		queue.add("Mahesh");
		queue.add("Rahul");
		queue.add("Ramesh");
		System.out.println("Queue" +queue);
		queue.remove();
		System.out.println("Queue" +queue);
		queue.poll();		
		System.out.println("Queue" +queue);
	}
}
