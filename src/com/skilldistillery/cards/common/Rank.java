package com.skilldistillery.cards.common;

public enum Rank {
	TWO("Two", 2), THREE("Three", 3), FOUR("Four", 4), FIVE("Five", 5), SIX("Six", 6), SEVEN("Seven", 7),
	EIGHT("Eight", 8), NINE("Nine", 9), TEN("Ten", 10), JACK("Ten", 10), QUEEN("Ten", 10), KING("Ten", 10),
	ACE("Eleven", 11);

	Rank(String ranks, int value) {
		name = ranks;
		this.value = value;
	}

	private int value;
	private String name;

	public String getName() {
		return name;

	}

	public int getValue() {
		return value;
	}
}
