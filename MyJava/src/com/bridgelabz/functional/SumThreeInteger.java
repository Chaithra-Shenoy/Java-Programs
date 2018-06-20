/**
 * 
 */
package com.bridgelabz.functional;

import com.bridgelabz.Utility.Utility;

/**
 * purpose ­A program with cubic running time. Read in N integers and counts the
 * number of triples that sum to exactly 0.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class SumThreeInteger {
	public static void main(String[] args) {
		int number = 0;
		System.out.println("Enter the number");
		number = Utility.scanner(number);
		int[] a = new int[number];
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = Utility.scanner(number);
		}
		int x = a.length;
		Utility.Print(a, x);
	}
}
