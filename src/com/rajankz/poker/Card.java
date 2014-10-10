package com.rajankz.poker;

public class Card {

	private EnumCardSuite suite;
	private EnumCardFace face;
	
	public Card(EnumCardSuite suiteValue, EnumCardFace faceValue){
		suite = suiteValue;
		face = faceValue;
	}
	
	public EnumCardSuite getCardSuite(){
		return suite;
	}
	
	public EnumCardFace getCardFace(){
		return face;
	}
	
	public String toString(){
		return face +" of "+ suite;
	}
}
