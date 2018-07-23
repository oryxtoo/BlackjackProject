package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;

//public abstract class Hand extends Deck {
public abstract class Hand{
//	 private List<Card> handCards = new ArrayList<>();
	private List<Card> hand;
	public Hand() {
		hand = new ArrayList<Card>();
	}
	
//---------METHODS--------------------------------------------------------------------------------------------------------------------
//get total value of cards dealt to player
	public int getHandValue(){
		int sum = 0;
		for(int i =0; i<hand.size(); i++) {
			Card card = hand.get(i);
			int value = card.getValue();
			sum = sum + value;
		}
		return sum;		
	}

	public void addCard(Card card) { 
		hand.add(card);
		
	}
//	clear cards from hand
	public void clearHand(){
		hand.clear();
	}
	
	public int numCards() {
		return hand.size();
	}
	
	public List<Card> getCards() {
		return hand;
	}
	

	@Override
	public String toString() {
		return "Hand [handCards=" + hand + "]";
	}

}

