/**
 * 
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Add the Prime Numbers that are Anagram in the Range of 0 ­ 1000 in a
 * Queue using the Linked List and Print the Anagrams from the Queue.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Prime2DQueue {
	public static void main(String[] args) {
		LinkedList[][] array = new LinkedList[100][];
		QueueUsingLinkedlist qlist = new QueueUsingLinkedlist();
		for (int i = 0; i < 10; i++) {
			array[i] = new LinkedList[100];
			for (int j = 0; j < 100; j++) {
				array[i][j] = new LinkedList();
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 100 * i; j < 100 * (i + 1) - 1; j++) {
				int k = 0;

				for (int m = j + 1; m < 100 * (i + 1); m++) {
					if (Utility.findPrime(j) == true && Utility.findPrime(m) == true) {
						if (Utility.isAnagram(("" + j), ("" + m)) == true) {
							qlist.insert(m);
							qlist.insert(j);
						}
					}
				}
			}

		}
		qlist.display();
	}
}