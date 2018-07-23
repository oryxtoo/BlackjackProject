package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Deck;

public class NewDealer {

	public static void main(String[] args) {
		//OMG I CAN'T BELIEVE IT WORKS! =P
		boolean pBust = false;
		boolean dBust = false;
		String response = "";
		Scanner sc = new Scanner(System.in);
		Deck deck = new Deck();
		BlackjackHand dealerHand = new BlackjackHand();
		BlackjackHand playerHand = new BlackjackHand();

		deck.createDeck();
		deck.shuffle();

		while (!response.equalsIgnoreCase("Q")) {

			playerHand.addCard(deck.dealCard());
			dealerHand.addCard(deck.dealCard());
			playerHand.addCard(deck.dealCard());
			dealerHand.addCard(deck.dealCard());
			System.out.println("Dealer has " + dealerHand.getHandValue());
			System.out.println("Player has " + playerHand.getHandValue());

			if (playerHand.isBlackjack() && dealerHand.isBlackjack()) {
				System.out.println("PUSH");
			} else if (dealerHand.isBlackjack()) {
				System.out.println("Dealer BLACKJACK!");
			} else if (playerHand.isBlackjack()) {
				System.out.println("Player BLACKJACK!");
			} else {

				System.out.println("Do you want to HIT (H), STAND (S), or Quit(Q)? >> ");
				response = sc.next();

				while (response.equalsIgnoreCase("H") && !playerHand.playerBust()) {
					playerHand.addCard(deck.dealCard());
					System.out.println("Player has " + playerHand.getHandValue());
					if (playerHand.playerBust()) {
						System.out.println("Player BUST");
						pBust = true;
						break;
					}
				}

				while (dealerHand.getHandValue() < 17 && pBust == false) {
					dealerHand.addCard(deck.dealCard());
					System.out.println("Dealer has " + dealerHand.getHandValue());
					if (dealerHand.playerBust()) {
						System.out.println("Dealer BUST");
						dBust = true;
						break;
					}
				}

				if (dealerHand.getHandValue() == playerHand.getHandValue() && (!dealerHand.playerBust() || !playerHand.playerBust())) {
					System.out.println("PUSH!");
				}else if (dealerHand.getHandValue() > playerHand.getHandValue() && (!dealerHand.playerBust() || !playerHand.playerBust())) {
					System.out.println("Dealer WINS!");				
				} else if (!dealerHand.playerBust() || !playerHand.playerBust()){
					System.out.println("Player WINS!");
				}
				
				if (deck.checkDeckSize() < 12) {
					deck.createDeck();
					System.out.println("New shoe. Please wait.");
				}
					dealerHand.clearHand();
					playerHand.clearHand();
			}
		}
		sc.close();
	}
}
