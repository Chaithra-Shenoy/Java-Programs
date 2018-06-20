/**
 * 
 */
package com.bridgelabz.objectOrientedProgram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Write a Program DeckOfCards.java , to initialize deck of cards having
 * suit ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5",
 * "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards
 * using Random method and then distribute 9 Cards to 4 Players and Print the
 * Cards the received by the 4 Players using 2D Array...
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class DeckOfCards {
	static String[] SUIT = { "club", "diamond", "heart", "spades" };
	static String[] RANK = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };
	static String[][] deck = new String[SUIT.length][RANK.length];

	public static void main(String[] args) {
		deck = Utility.cardInitialize(deck, RANK, SUIT);
		deck = Utility.shuffleCards(deck, SUIT.length, RANK.length);
		Utility.printCards(deck);
	}
}
