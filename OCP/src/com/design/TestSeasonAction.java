package com.design;

public class TestSeasonAction {

	public static void main(String[] args) {
		for(SeasonAction seasonAction:SeasonAction.values()){
			System.out.print(seasonAction.name() +" "+seasonAction.ordinal()+" ");
			seasonAction.printHours();
		}
   }
}