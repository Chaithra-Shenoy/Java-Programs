/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose dayOfWeek function that takes a date as input and prints the day of
 * the week that date falls on. Your program should take three command­line
 * arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for
 * February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for
 * Tuesday, and so forth.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class DaysOfWeek {
	static int INDEX = 0;

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		if (month < 0 && month > 12)
			System.out.println("Invalid month");
		if (day < 0 && day > 31)
			System.out.println("Invalid day");
		if (year > 9999 && year < 0)
			System.out.println("Invalid year");
		else
			INDEX = Utility.week(month, day, year);
		System.out.println(days[INDEX]);
	}
}
