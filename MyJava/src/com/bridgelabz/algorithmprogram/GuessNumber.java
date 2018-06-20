/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose takes a command­line argument n, asks you to think of a number
 * between 0 and N­1, where N = 2^n, and always guesses the answer with n
 * questions.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class GuessNumber {
	static int number = 0;

	public static void main(String[] args) {
		number = Integer.parseInt(args[0]);
		int n = (int) Math.pow(2, number);
		System.out.println("guess a number" + 0 + "to" + (n - 1));
		search(0, n);
	}

	/**
	 * @param i
	 * @param n
	 */
	private static void search(int low, int high) {
		String string = null;
		int mid = low + (high - low) / 2;
		if (low < high) {
			System.out.println("enter 'y' if number is greater than mid" + mid);
			string = Utility.scanner(string);
			if (string.charAt(0) == 'y')
				search(mid + 1, high);
			else
				search(low, mid);
		} else
			System.out.println(low);
	}
}
