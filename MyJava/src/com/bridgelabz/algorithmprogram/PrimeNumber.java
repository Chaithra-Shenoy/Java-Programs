/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Take a range of 0 ­ 1000 Numbers and find the Prime numbers in that
 * range.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class PrimeNumber {
	public static void main(String[] args) {
		int start = 0, end = 0;
		System.out.println("enter the starting range");

		start = Utility.scanner(start);

		System.out.println("enter the ending range");
		end = Utility.scanner(end);
		Utility.isPrime(start, end);
	}
}
