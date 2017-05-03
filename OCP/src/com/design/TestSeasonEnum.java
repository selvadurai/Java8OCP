package com.design;

public class TestSeasonEnum {

	public static void main(String[] args) {
		for(Season season:Season.values()){
			System.out.println(season.name() +" "+season.ordinal() );
		}

	}

}
