/**
 * 
 */
package com.bridgelabz.objectOrientedProgram;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.ldap.SortControl;

import com.bridgelabz.QueueProgram.QueueUsingLinkedlist;
import com.bridgelabz.Utility.Utility;

/**
 * purpose create a Player Object having Deck of Cards, and having ability to
 * Sort by Rank and maintain the cards in a Queue implemented using Linked List.
 * Do not use any Collection Library. Further the Player are also arranged in
 * Queue. Finally Print the Player and the Cards received by each Player.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class DeckCardsQueue {
	static String[] SUIT = { "club", "diamond", "heart", "spades" };
	static String[] RANK = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };
	static int index = 0;

	public static void main(String[] args) {
		QueueUsingLinkedlist[] cards = new QueueUsingLinkedlist[52];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new QueueUsingLinkedlist();
		}
		for (int i = 0; i < SUIT.length; i++) {
			for (int j = 0; j < RANK.length; j++) {
				cards[index++].insert(RANK[j] + " " + SUIT[i]);
			}
		}
		String[][] player = Utility.shuffleCards(cards, SUIT.length, RANK.length);
		QueueUsingLinkedlist[] queue = Utility.distribute(player);
		Utility.sortPlayer(queue);

	}

}
