/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

/**
 * purpose One string is an anagram of another if the second is simply a
 * rearrangement of the first.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first sentence:");
		String string1 = sc.nextLine();
		System.out.println("Enter second sentence:");
		String string2 = sc.nextLine();
		boolean res = Utility.isAnagram(string1, string2);
		if (res)
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
	}
}
