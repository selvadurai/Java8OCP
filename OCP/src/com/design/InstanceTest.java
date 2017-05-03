package com.design;

public class InstanceTest {

	public static void main(String[] args) {
		AnimalModel hippo = new HipoModel();
		
		boolean b1 = hippo instanceof HipoModel;    //true
		boolean b2 = hippo instanceof AnimalModel;  //true
		boolean b3 = hippo instanceof ElephantModel;//false
       
		System.out.println("hippo instanceof HipoModel     "+b1);
		System.out.println("hippo instanceof AnimalModel   "+b2);
    	System.out.println("hippo instanceof ElephantModel "+b3);	
	}

}
