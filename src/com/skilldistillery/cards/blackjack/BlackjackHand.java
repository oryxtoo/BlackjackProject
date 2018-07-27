 package com.skilldistillery.cards.blackjack;

//import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;

public class BlackjackHand extends Hand { 
//	private List<Card> handCards = new ArrayList<>();
	
	public BlackjackHand() {
		
	}

	public boolean playerBust() {
		int handValue = getHandValue();
		if (handValue > 21) {
			clearHand();
			return true;		
		} else {
			return false;
		}
	}
	
	public boolean isBlackjack() {
		// 21 from 2 cards
		int blackjackValue = getHandValue();
		if (blackjackValue == 21) {
			if (numCards() == 2) {
				return true;
			}
		}	else {
			return false;
		}
		return false;
	}
//	public void addCard(List<Card> hand, Deck deck) {
//		hand.add(deck.dealCard());
//	}
	
	public int getHandValue(List<Card> hand){
		int sum = 0;
		for(int i =0; i<hand.size(); i++) {
			Card card = hand.get(i);
			int value = card.getValue();
			sum = sum + value;
			
		}
		return sum;		
	}
}


