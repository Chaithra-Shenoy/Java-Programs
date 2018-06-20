/**
 * 
 */
package com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.HelperClass;

import java.util.Scanner;

/**
 * purpose
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
