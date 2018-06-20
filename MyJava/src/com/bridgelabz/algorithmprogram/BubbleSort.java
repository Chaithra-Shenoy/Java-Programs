/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Reads in integers prints them in sorted order using Bubble Sort
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class BubbleSort {
	public static void main(String[] args) {
		int number = 0;
		int string = 0;
		String st = null;
		System.out.println("enter the array size");
		number = Utility.scanner(number);
		Integer[] array = new Integer[number];
		String[] arrayone = new String[number];
		System.out.println("enter int values");
		for (int i = 0; i < number; i++) {
			array[i] = Utility.scanner(string);
		}
		System.out.println("Enter string");
		for (int i = 0; i <number; i++) {
			arrayone[i] = Utility.scanner(st);
		}
	
		for (int i = 0; i < number; i++) {
			Utility.bubbleSort(array);
			System.out.println(array[i] + " ");
		}
		
		for (int i = 0; i < number; i++) {
			Utility.bubbleSort(arrayone);
			System.out.println(arrayone[i] + " ");
		}

	}
}
