package com.generics;

import java.util.ArrayDeque;

public class Stack {

	public static void main(String [] args){
	   ArrayDeque<Integer> stack = new ArrayDeque();
	   stack.push(10);
	   stack.push(20);
	   stack.push(30);
	   stack.push(40);
	   stack.push(50);
	   stack.push(60);
	   stack.push(70);
	   
	   
	   System.out.println("Peek "+stack.peek());
	   System.out.println("Poll "+stack.poll());
	   System.out.println("Poll "+stack.poll());
	   System.out.println("Peek "+stack.peek());
	   
	   
	
	}


}
