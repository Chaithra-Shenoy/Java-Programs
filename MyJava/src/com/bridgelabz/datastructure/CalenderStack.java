/**
 * 
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.Utility.Utility;

/**
 * purpose To print Calender using stack.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class CalenderStack {
	static String[] MONTHS = { " ", "january", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };
	static int[] DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		WeekDays weekDay = new WeekDays();
		StackUsingLinkedlist stack1 = new StackUsingLinkedlist();
		StackUsingLinkedlist stack2 = new StackUsingLinkedlist();
		for (int i = weekDay.day.length - 1; i >= 0; i--) {
			stack1.push(weekDay.day[i]);
		}
		for (int i = weekDay.date.length - 1; i >= 0; i--) {
			stack2.push(weekDay.date[i]);
		}
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		if (Utility.leap(year))
			DAYS[2] = 29;
		System.out.println("   " + MONTHS[month] + " " + year);
		stack1.display();

		// To find starting day
		int startingDay = Utility.week(month, (int) stack2.top.data, year);

		// print the calendar
		for (int i = 0; i < startingDay; i++) {
			System.out.print("  ");
		}
		for (int i = 1; i <= DAYS[month]; i++) {
			if (i < 10)
				System.out.print("  " + i);
			else
				System.out.print(" " + i);
			if (((i + startingDay) % 7 == 0) || (i == DAYS[month]))
				System.out.println();

		}
	}

}
