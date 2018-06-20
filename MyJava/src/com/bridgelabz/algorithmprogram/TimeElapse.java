/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Create Utility Class having following static methods
 *  i. binarySearch method for integer 
 *  ii. binarySearch method for String
 *  iii. insertionSort method for integer 
 *  iv. insertionSort method for String 
 *  v.bubbleSort method for integer 
 *  vi.bubbleSort method for String 
 *  b. I/P ­> Write main function to call the utility function 
 *  c. Logic ­> Check using Stopwatch the Elapsed Time
 * for every method call d. O/P ­> Output the Search and Sorted List. More
 * importantly print elapsed time performance in descending order
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class TimeElapse {
	static int NUMBER = 0, choice = 0, value = 0, key = 0;

	public static void main(String[] args) {

		String string = null, valuenew = null;
		System.out.println("Enter the array size");
		NUMBER = Utility.scanner(NUMBER);
		Integer[] array = new Integer[NUMBER];
		String[] arraynew = new String[NUMBER];
		System.out.println("Enter the following option to search and sort elements");
		System.out.println("option 1 - Binary search of integer element");
		System.out.println("option 2 - Binary search of string element");
		System.out.println("option 3 - Bubble sort of integer array");
		System.out.println("option 4 - Bubble sort of string array");
		System.out.println("option 5 - insertion sort of integer array");
		System.out.println("option 6 - insertion sort of string array");
		choice = Utility.scanner(choice);
		switch (choice) {
		case 1:
			long start = System.currentTimeMillis();
			System.out.println("Enter the array elements");
			for (int i = 0; i < NUMBER; i++)
				array[i] = Utility.scanner(value);
			System.out.println("enter the element to be searched");
			key = Utility.scanner(key);
			for (int i = 0; i < NUMBER; i++)
				Utility.bubbleSort(array);
			Utility.binarySearch(array, key);
			long end = System.currentTimeMillis();
			System.out.println("Time elapsed is" + (end - start) / 1000 + "sec");
			break;
		case 2:
			long start1 = System.currentTimeMillis();
			System.out.println("enter the character");
			for (int i = 0; i < NUMBER; i++)
				arraynew[i] = Utility.scanner(string);
			System.out.println("enter the element to be searched");
			valuenew = Utility.scanner(valuenew);
			for (int i = 0; i < NUMBER; i++)
				Utility.bubbleSort(arraynew);
			Utility.binarySearch(arraynew, valuenew);
			long end1 = System.currentTimeMillis();
			System.out.println("Time elapsed is" + (end1 - start1) / 1000 + "sec");
			break;
		case 3:
			long start2 = System.currentTimeMillis();
			System.out.println("enter the elements to be sorted");
			for (int i = 0; i < NUMBER; i++)
				array[i] = Utility.scanner(value);
			System.out.println("sorted order is");
			for (int i = 0; i < NUMBER; i++) {
				Utility.bubbleSort(array);
				System.out.print(array[i] + " ");
			}
			long end2 = System.currentTimeMillis();
			System.out.println("Time elapsed is" + (end2 - start2) / 1000 + "sec");
			break;
		case 4:
			long start3 = System.currentTimeMillis();
			System.out.println("enter the characters to be sorted");
			for (int i = 0; i < NUMBER; i++)
				arraynew[i] = Utility.scanner(string);
			System.out.println("sorted order is");
			for (int i = 0; i < NUMBER; i++) {
				Utility.bubbleSort(arraynew);
				System.out.print(arraynew[i] + " ");
			}
			long end3 = System.currentTimeMillis();
			System.out.println("Time elapsed is" + (end3 - start3) / 1000 + "sec");
			break;
		case 5:
			long start4 = System.currentTimeMillis();
			System.out.println("enter the elements to be sorted");
			for (int i = 0; i < NUMBER; i++)
				array[i] = Utility.scanner(value);
			System.out.println("sorted order is");
			for (int i = 0; i < NUMBER; i++) {
				Utility.insersionSort(array);
				System.out.print(array[i] + " ");
			}
			long end4 = System.currentTimeMillis();
			System.out.println("Time elapsed is" + (end4 - start4) / 1000 + "sec");
			break;
		case 6:
			long start5 = System.currentTimeMillis();
			System.out.println("enter the characters to be sorted");
			for (int i = 0; i < NUMBER; i++)
				arraynew[i] = Utility.scanner(string);
			System.out.println("sorted order is");
			for (int i = 0; i < NUMBER; i++) {
				Utility.insersionSort(arraynew);
				System.out.print(arraynew[i] + " ");
			}
			long end5 = System.currentTimeMillis();
			System.out.println("Time elapsed is" + (end5 - start5) / 1000 + "sec");
			break;
		case 7:
			System.out.println("invalid input");
			break;
		}
	}
}
