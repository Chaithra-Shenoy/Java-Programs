/**
 * 
 */
package com.bridgelabz.datastructure;

/**
 * purpose A palindrome is a string that reads the same forward and backward,
 * for example, radar, toot, and madam. We would like to construct an algorithm
 * to input a string of characters and check whether it is a palindrome.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class StringPalindrome {
	static String STRING = "radar";

	public static void main(String[] args) {
		int count = 0;
		char[] ch = STRING.toCharArray();
		Deque<String> deque = new Deque<>();
		for (int i = 0; i < ch.length; i++) {
			deque.addFront(ch[i]);
			deque.display();
			count++;
		}
		System.out.println(count);
		int remcount = 0;
		int size = deque.size() / 2;
		for (int i = 0; i < size; i++) {
			if (!deque.removeFront().equals(deque.removeRear())) {
				remcount++;
				System.out.println("not palidrome");
				break;
			} else
				System.out.println("palindrome");
			break;
		}

	}
}
