/**
 * 
 */
package com.bridgelabz.utility;

import java.util.Scanner;

import org.json.simple.JSONObject;

/**
 * purpose Utility class
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Utility {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @return integer
	 */
	public static int getInt() {
		return scanner.nextInt();
	}

	/**
	 * @return double
	 */
	public static double getDouble() {
		return scanner.nextDouble();
	}

	/**
	 * @return String
	 */
	public static String getString() {
		return scanner.next();
	}

	/**
	 * @return long
	 */
	public static long getLong() {
		return scanner.nextLong();
	}
	
}
