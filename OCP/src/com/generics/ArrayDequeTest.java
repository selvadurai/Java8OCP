package com.generics;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTest {

	public static void main(String[] args) {
	   Queue<Integer> queue = new ArrayDeque<>();
	   System.out.println(queue.offer(10));
	   System.out.println(queue.offer(4));
	   System.out.println(queue.peek());
	  
	   
	   System.out.println(queue.poll());
	   System.out.println(queue.poll());
	   
	   System.out.println(queue.offer(100));
	   System.out.println(queue.peek());
	   System.out.println(queue.poll());
	   
	}

}
