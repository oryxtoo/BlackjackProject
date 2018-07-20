package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public static void main(String[] args) {
		Deck d = new Deck();
		d.createDeck();
	}
//	Create a class Deck. It will hold a List of Cards.
//	In the constructor, initialize the List with all 52 cards.
//	Add a method checkDeckSize which returns the number of cards still 
//	in the deck.
//	Add a method dealCard that removes a Card from the deck.
//	Add a method shuffle to shuffle the deck.
	List<Card> cardDeck = new ArrayList<>();
	
	public void createDeck() {
//		 Card card = new Card(Rank.QUEEN, Suit.DIAMONDS);
//         cardDeck.add(card); 
//         cardDeck.add(new Card(Rank.KING, Suit.DIAMONDS));
//         Rank.values();
		Rank[] ranks = Rank.values();
		for (int i = 0; i < 13; i++) {
			Rank r = ranks[i];
//         System.out.println(ranks.length);
//         System.out.println(ranks[0]);
//         System.out.println(ranks[1]);
         System.out.println(r);
         Card c = new Card(r, Suit.CLUBS);
         cardDeck.add(c);
         Card d = new Card(r, Suit.DIAMONDS);
         cardDeck.add(d);
         System.out.println(c);
         System.out.println(d);
         
		}
	}
	public int checkDeckSize(/*returns # cards still in deck*/){
		int deckSize = 0;
		return deckSize;
	}
	public Card dealCard(/*removes card from deck*/){
		Card dealtCard = null;
		return dealtCard;
	}
	public void shuffle() {
        Collections.shuffle(cardDeck);
    }

}