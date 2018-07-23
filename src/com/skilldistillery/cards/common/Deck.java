package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//------------------------------------------------------------
	// Create cardDeck ArrayList object to hold card objects
	List<Card> cardDeck = new ArrayList<>();
//------------------------------------------------------------
	// createDeck and initialize with all 52 cards
	public void createDeck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		for (int i = 0; i < ranks.length; i++) {
			Rank r = ranks[i];
			for (int j = 0; j < suits.length; j++) {
				Suit s = suits[j];
				Card c = new Card(r, s);
				cardDeck.add(c);
			}
		}
	}
//-------------------------------------------------------------
//Add a method checkDeckSize which returns the number of cards
//in the deck.
	public int checkDeckSize() {
		int deckSize = cardDeck.size();
//		System.out.println(deckSize);

		return deckSize;
	}
//-------------------------------------------------------------
//	Add a method dealCard that removes a Card from the deck.
	public Card dealCard() {
		Card dealtCard = cardDeck.remove(0);
		return dealtCard;
	}
//-------------------------------------------------------------
//	Add a method shuffle to shuffle the deck.
	public void shuffle() {
		Collections.shuffle(cardDeck);
	}

}