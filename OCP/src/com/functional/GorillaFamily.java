package com.functional;

interface Gorilla { String move(); }

class GorillaFamily {
    String walk ="Walk";
    
    void everyonePlay(boolean baby){
    	String approach = "ambe";
    	play(()->walk);
    	play(() -> baby ?"Hitch a ride" : "run");
    	play(()-> approach);
    	
    }
    
    void play(Gorilla g){
    	System.out.println(g.move());
    }
   

    public static void main(String [] args){
    	GorillaFamily gorilla = new GorillaFamily();
    	gorilla.everyonePlay(true);
    	System.out.println(" ");
    	gorilla.everyonePlay(false);
    }

}
