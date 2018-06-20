/**
 * 
 */
package com.bridgelabz.datastructure;

import java.util.ArrayList;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Add the Prime Numbers that are Anagram in the Range of 0 ­ 1000 in a
 * Stack using the Linked List and Print the Anagrams in the Reverse Order.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Prime2DReverse {

	public static void main(String[] args) {
		StackUsingLinkedlist s = new StackUsingLinkedlist();
		LinkedList[][] array = new LinkedList[100][];
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

							s.push(m);
							s.push(j);
						}
					}
				}
			}
		}
		s.display();
	}
}
