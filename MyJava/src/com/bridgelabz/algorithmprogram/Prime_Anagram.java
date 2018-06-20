
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose to find the prime numbers that are Anagram and Palindrome
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Prime_Anagram {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 1000; i++) {
			if (Utility.findPrime(i) == true)
				count++;
		}
		String arr[] = new String[count];
		int index = 0;
		for (int i = 0; i <= 1000; i++) {
			if (Utility.findPrime(i))
				arr[index++] = i + "";
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (Utility.isAnagram(arr[i], arr[j]))
					System.out.println("[" + arr[i] + "," + arr[j] + "]");
			}
		}
	}
}
