/**
 * 
 */
package com.bridgelabz.functional;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Write static functions to return all permutation of a String using
 * iterative method and Recursion method. Check if the arrays returned by two
 * string functions are equal.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class StringPermutation {
	public static void main(String[] args) {

		String st = null;
		st = Utility.scanner(st);
		int a = st.length();

		Utility.permutation(st, 0, a - 1);
	}
}
