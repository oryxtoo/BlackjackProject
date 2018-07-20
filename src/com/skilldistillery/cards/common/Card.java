package com.skilldistillery.cards.common;

public class Card {

//
//A card has a Suit and Rank. Set these in the constructor.
//Generate the methods hashCode and equals
//Add a toString which says rank + " of " + suit.
//Add a method getValue to return the card's numeric value.
	public Card(Rank r, Suit s){
		this.rank = r;
		this.suit = s;
		
	}
	
	Suit suit;
	Rank rank;
	int value;

	private int getValue() {

		return rank.getValue();
	}

	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return rank + " of " + suit;
	}


}
