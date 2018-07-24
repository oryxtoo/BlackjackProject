## Card Game - Blackjack

* Skill Distillery Week 3 Homework

A program that simulates a blackjack game. Classes include two enums and several classes that are part of the "Cards.Common" package. These classes were created to be used in various card games beyond the blackjack implementation. The other classes are part of the "Cards.Blackjack" package, which are blackjack specific classes.

### Description
1) Classes

These classes are part of the "blackjack specific package":

New Dealer - Acts as the main application. Includes the main method, several local fields, and instantiation of objects for Scanner, BlackjackHands for dealer and player, a Deck of Cards, and calls to methods to create a deck of an array list of cards, as well as a method to shuffle that list. Also includes the logic for the game and user input prompts for Stand and Hit. Includes several While loops and if/else if/else statements to carry out the game.

BlackjackHand - EXTENDS Hand - An empty constructor to create objects of type Hand to interact with other objects within the game. Includes methods for checking for dealer/player blackjack, bust, and retrieving the hand value.
------------------------------------------------------------
These classes are part of the separate "common card game" package:

Hand - Includes the instantiation of an array list of Card type, and several methods, including: clearHand(), addCard(), getCards(), and various other methods that interact with the arrays of cards.

Deck - Instantiates an array list of Cards, and defines the methods to create a deck of cards, check the deck size, deal cards, and shuffle the deck.

Card - IMPLEMENTS the ENUMS Rank & Suit - The constructor for the card objects used in the game. Includes methods to get the rank, suit and value of the card objects, which are defined within the enums Rank and Suit.

Rank - ENUM IMPLEMENTED by Cards - Defines the ranks and values of the cards, as well as defines several methods to interact with those values.

Suit - ENUM IMPLEMENTED by Cards - Defines the suit/name of the cards, and provides methods to interact with those values.
------------------------------------------------------------
2) WISH LIST
Ideas I was unable to implement included:

Multiple Players/Hands

Betting

Doubling Down/Splitting

Larger Decks

1 vs 11 Ace Rules

The occasional waitress asking for drink orders.

Politely ignoring the occasional waitress because soda is free.
------------------------------------------------------------
### Technologies Used
* Java
* Java operators, especially enums, methods, and lots and lots of loops!
------------------------------------------------------------
### Lessons Learned
I have watched my husband play blackjack many times, but never fully understood the rule. Writing this program gave me a better understanding of the game. It also helped me understand object-oriented programming more. I enjoyed building this program, and am looking forward to implementing the base card classes to build other card games.
