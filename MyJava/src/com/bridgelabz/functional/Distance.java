/**
 * 
 */
package com.bridgelabz.functional;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Write a program Distance.java that takes two integer command­line
 * arguments x and y and prints the Euclidean distance from the point (x, y) to
 * the origin (0, 0).
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Distance {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		double dist1 = Utility.pow(x, 2);
		double dist2 = Utility.pow(y, 2);
		double dist = Utility.sqrt(dist1 + dist2);
		System.out.println("distance=" + dist);

	}
}
