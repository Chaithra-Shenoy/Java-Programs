/**
 * 
 */
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Simulates a gambler who start with $stake and place fair $1 bets
 * until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of
 * the number of times he/she wins and the number of bets he/she makes. Run the
 * experiment N times, averages the results, and prints them out.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Gambler {
	static int stake = 0;
	static int goal = 0;
	public static void main(String[] args) {
		int number = 0;

		System.out.println("Enter the stake value:");
		Utility.scanner(stake);
		System.out.println("Enter the goal value:");
		Utility.scanner(goal);
		System.out.println("Enter the number of times of bets:");
		Utility.scanner(number);
		Utility.winPercentage(number, stake, goal);
	}

}
