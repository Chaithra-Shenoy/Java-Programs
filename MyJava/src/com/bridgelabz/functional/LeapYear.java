/**
 * 
 */
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Print the year is a Leap Year or not.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();

		Utility.findLeapYear(year);

	}
}
