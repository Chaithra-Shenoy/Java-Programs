/**
 * 
 */
package com.bridgelabz.datastructure;

import java.util.Scanner;

/**
 * purpose ­> Take an Arithmetic Expression such as
 * (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
 * performance of operations. Ensure parentheses must appear in a balanced
 * fashion.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class BalancedParentheses {
	public static void main(String[] args) {
		String string = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the expression");
		string = scanner.nextLine();
		StackUsingLinkedlist s = new StackUsingLinkedlist();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '(') {
				s.push(i);
				count++;
				s.getSize();
			} else if (string.charAt(i) == ')') {
				if (s.isEmpty() == true)
					count--;
				else {
					s.pop();
					count--;
					s.getSize();
				}
			}
		}
		if (count == 0)
			System.out.println("given expression is balanced");
		else
			System.out.println("Given expression is not balanced");
	}
}
