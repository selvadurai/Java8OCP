package com.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArraySort {
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static void main(String[] args) {
		int [] array = new int[1_000_000];
		
		for(int i=0;i<1_000_000;i++){
			array[i]=getRandomNumberInRange(1, 1_000_000);
		}
	
		
	
		Arrays.sort(array);
	  	System.out.println(Arrays.binarySearch(array, 100));
	  	
	}

}
