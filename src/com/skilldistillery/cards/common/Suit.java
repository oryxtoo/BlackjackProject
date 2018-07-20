package com.skilldistillery.cards.common;

public enum Suit {

	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	Suit(String suits) {
		name = suits;
	}

	final private String name;

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}
}
