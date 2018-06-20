/**
 * 
 */
package com.bridgelabz.functional;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Write a Stopwatch Program for measuring the time that elapses between
 * the start and end clicks
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class StopWatch {
	public static void main(String[] args) {
		System.out.println("Enter the start value:");
		int start = 0, end = 0;
		Utility.scanner(start);
		System.out.println("Enter the end value:");
		Utility.scanner(end);
		Utility.stopWatch(start, end);
	}

}
