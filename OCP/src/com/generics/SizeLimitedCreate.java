package com.generics;

public class SizeLimitedCreate<T,U> {

	private T contents;
	private U sizeLimit;
	
	public SizeLimitedCreate(T contents,U sizeLimit){
		this.contents=contents;
		this.sizeLimit=sizeLimit;
	}
	
	public  void printValue(){
		System.out.println(contents + " " + sizeLimit);
	}
	

}
