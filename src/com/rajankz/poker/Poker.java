package com.rajankz.poker;

public class Poker {

	public Poker(){
		
	}
	
	public static void main(String[] args){
		Deck deck = new Deck();
		deck.shuffle();
		for(int i=0;i<100;i++){
			deck.dealOneCard();
		}
	}
	
}
