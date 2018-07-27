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
			System.out.println(playerHand.getCard(0).getRank() + " of " + playerHand.getCard(0).getSuit() + " is dealt to the Player.");
			dealerHand.addCard(deck.dealCard());//dealer is showing____.
			System.out.println("Dealer deals a card face down...");
			playerHand.addCard(deck.dealCard());//player has____.
			System.out.println(playerHand.getCard(1).getRank() + " of " + playerHand.getCard(1).getSuit() + " is dealt to the Player.");
			dealerHand.addCard(deck.dealCard());//do not show this card
			//hide second card/do not add value to hand value total
			System.out.println("Dealer deals a card face down and flips a " + dealerHand.getCard(0).getRank() + " of " + dealerHand.getCard(0).getSuit() + " over...");
			//put second card in seperate array and then put back in dealers hand?
//			System.out.println("Dealer has " + dealerHand.getHandValue() + " and a hidden card.");
//			System.out.println("Player has " + playerHand.getHandValue());
//			System.out.println("Dealer has " + dealerHand.getHandValue());

			if (playerHand.isBlackjack() && dealerHand.isBlackjack()) {
				System.out.println("PUSH");
			} else if (dealerHand.isBlackjack()) {
				System.out.println("Dealer BLACKJACK!");
			} else if (playerHand.isBlackjack()) {
				System.out.println("Player BLACKJACK!");
			} else {
				System.out.println("Player has " + playerHand.getHandValue());
				System.out.println("Dealer is showing " + dealerHand.getCard(0).getValue());
				System.out.println("Do you want to HIT (H), STAND (S), or Quit(Q)? >> ");
				response = sc.next();

				while (response.equalsIgnoreCase("H") && !playerHand.playerBust()) {
					playerHand.addCard(deck.dealCard());
					System.out.println(playerHand.getCard(0).getRank() + " of " + playerHand.getCard(0).getSuit() + " is dealt to the Player.");
					System.out.println("Player has " + playerHand.getHandValue());
					System.out.println("Dealer is showing " + dealerHand.getCard(0).getValue());
					if (playerHand.playerBust()) {
						System.out.println("Player BUST");
						pBust = true;
						break;
					}
					System.out.println("Do you want to HIT (H), STAND (S), or Quit(Q)? >> ");
					response = sc.next();
				}
				
				System.out.println("Dealer flips over a " + dealerHand.getCard(1).getRank() + " of " + dealerHand.getCard(1).getSuit());
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
			}

			System.out.println("Do you want to PLAY (P) or Quit(Q)? >> ");
			response = sc.next();
			dealerHand.clearHand();
			playerHand.clearHand();
			
		}
		sc.close();
	}
}
