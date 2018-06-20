/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Sorting two string using merge sort.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class MergeSort {
	public static void main(String[] args) {
		int number = 0;
		String string = null;

		System.out.println("Enter the array size");
		number = Utility.scanner(number);
		String[] value = new String[number];
		String[] value1 = new String[number];
		System.out.println("Enter the first array");
		for (int i = 0; i < number; i++) {
			value[i] = Utility.scanner(string);
		}
		System.out.println("Enter the second array");
		for (int i = 0; i < number; i++) {
			value1[i] = Utility.scanner(string);
		}
		String[] size = new String[value.length + value1.length];
		Utility.mergeSort(value);
		Utility.mergeSort(value1);
		Utility.merge(size, value, value1);
		Utility.mergeSort(size);
		System.out.println("Sorted names are:");
		for(int i=0;i<size.length;i++) {
			System.out.println(size[i]);
		}
	}
}
