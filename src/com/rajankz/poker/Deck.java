package com.rajankz.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	private List<Card> oneDeck;
	
	public Deck(){
		initDeck();
	}
	
	private void initDeck(){
		oneDeck = new ArrayList<Card>();
		for(EnumCardSuite suite : EnumCardSuite.values()){
			for(EnumCardFace face : EnumCardFace.values()){
				oneDeck.add(new Card(suite, face));
			}
		}
	}
	
	public int getSize(){
		return oneDeck == null ? 0 : oneDeck.size();
	}
	
	/**
	 * Shuffles a desck of cards using Fisher Yates shuffle
	 * @see: http://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
	 */
	public void shuffle(){
		Random rand = new Random();
		int size = getSize();
		Card tempCard;
		int random;
		for(int i = size - 1; i > 0; i--){
			random = rand.nextInt(i);
			tempCard = oneDeck.get(random);
			oneDeck.set(random, oneDeck.get(i));
			oneDeck.set(i, tempCard);
		}
	}
	
	public void dealOneCard(){
		//remove from end to avoid array copy
		Card card = getSize() > 0 ? oneDeck.remove(getSize() - 1) : null;
		if(card == null){
			System.out.println("No more cards to deal");
		}else{
			System.out.println(card.toString());
		}
	}
	
}
