/**
 * 
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Take a range of 0 ­ 1000 Numbers and find the Prime numbers in that
 * range. Store the prime numbers in a 2D Array, the first dimension represents
 * the range 0­100, 100­200, and so on.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Prime2D {
	public static <T extends Comparable<T>> void main(String[] args) {
		LinkedList[][] array = new LinkedList[11][];
		for (int i = 0; i < 10; i++) {
			array[i] = new LinkedList[100];
			for (int j = 0; j < 100; j++) {
				array[i][j] = new LinkedList();
			}
		}
		for (int i = 0; i < 10; i++) {
			int k = 0;
			for (int j = 100 * i; j < 100 * (i + 1); j++) {
				if (Utility.findPrime(j)) {
					array[i][k].add(j);
					k++;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("");
			System.out.print(i + " " + "|");
			for (int j = 0; j < 100; j++) {
				array[i][j].display();
			}
		}
	}
}
