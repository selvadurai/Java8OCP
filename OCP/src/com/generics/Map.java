package com.generics;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<String,PersonModel> map = new HashMap<>();
		
		for(int id=1;id<100_000_00;id++){
		
			map.put(Integer.toBinaryString(id),new PersonModel(id,"brick",232));
		}
		
	    for(String key: map.keySet()){
	    	System.out.println(key + ", " +map.size());
	    }	
    
		
	}

}
