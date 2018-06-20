/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
 * returned by Vending Machine. Write a Program to calculate the minimum number
 * of Notes as well as the Notes to be returned by the Vending Machine as a
 * Change
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class VendingMachine {
	static int[] MONEY = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
	static int amount = 0;

	public static void main(String[] args) {
		System.out.println("Enter the amount ");
		amount = Utility.scanner(amount);
		while (amount > 0) {
			int rem, res = 0;
			for (int j = 0; j < MONEY.length; j++) {
				int note = amount / MONEY[j];
				rem = amount % MONEY[j];
				amount = rem;
				res = res + note;
				System.out.println("notes of:" + MONEY[j] + "---> " + note);
				System.out.println("remaining amount left in vending machine is" + amount);
			}
		}
		System.out.println();
	}
}
