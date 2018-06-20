/**
 * 
 */
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

/**
 * purpose FlipCoin and print percentage of heads and tails
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class FlipCoin {
	static int n = 0;
	static double HEAD = 0;
	static double TAIL = 0;

	public static void main(String[] args) {

		System.out.print("enter the number of times to flip coin");
		n = Utility.scanner(n);
		Utility.flipPercentage(HEAD, TAIL, n);

	}

}
