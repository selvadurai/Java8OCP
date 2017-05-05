package com.advanceDesign;

public class HayStorage {

 private int quantity = 0;
 private HayStorage() {}
 
 private static HayStorage instance;
 
 //Lazy Instantiation
 public static synchronized HayStorage getInstance() {
	if(instance==null){
	   instance = new HayStorage();
	}
    return instance;
 }
 
 public synchronized void addHay(int amount){
	 quantity+=amount;
 }

 public  synchronized int getHayQuantity(){
	 return quantity;
 }
 
 public synchronized boolean removeHay(int amount){
	 if(quantity < amount) return false;
	 quantity -=amount;
	 return true;
 }



}
