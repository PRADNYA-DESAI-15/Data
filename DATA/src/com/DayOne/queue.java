package com.DayOne;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Apple");
		queue.add("Banana");
		queue.add("cherry");
		
		System.out.println("Queue" +queue);
		
		String front =queue.remove();
		System.out.println("Removed Element:"+front);
		
		System.out.println("Updated Queue: "+queue);
		
		queue.add("date");
		
		String peeked =queue.peek();
		System.out.println("Peeked  Element: "+peeked);
		
		System.out.println("Updated peeked: "+queue);
		
	}

}
