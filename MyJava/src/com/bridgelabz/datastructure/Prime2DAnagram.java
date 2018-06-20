/**
 * 
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.algorithmprogram.PrimeNumber;

/**
 * purpose Prime Number Program and store only the numbers in that range that
 * are Anagrams. For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000
 * range.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Prime2DAnagram {
	public static void main(String[] args) {
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
							array[i][k].add(j);
							k++;
							System.out.println("[" + j + "," + m + "]");
						}
					}
				}
			}

			System.out.println();
		}
	}
}
