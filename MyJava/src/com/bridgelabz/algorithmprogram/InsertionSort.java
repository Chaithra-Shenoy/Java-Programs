/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Sorting the string value using insertion sort.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class InsertionSort {
	public static void main(String[] args) {
		int number = 0;
		String string = null;
		System.out.println("Enter the array size");
		number = Utility.scanner(number);
		int[] array = new int[number];
		String[] arraynew = new String[number];
		System.out.println("enter the characters to be sorted");
		for (int i = 0; i < array.length; i++)
			arraynew[i] = Utility.scanner(string);
		System.out.println("sorted order is");
		for (int i = 0; i < number; i++) {
			Utility.insersionSort(arraynew);
			System.out.print(arraynew[i] + " ");
		}
	}
}
