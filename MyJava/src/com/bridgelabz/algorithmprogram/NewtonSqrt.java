/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose To find squareroot of a number using Newton formula
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class NewtonSqrt {
	static double c = 0;

	public static void main(String[] args) {
		System.out.println("Enter the number to calculate its squareroot");
		c = Utility.scanner(c);
		if (c < 0)
			System.out.println("number should be non negative");
		else {
			double t = c;
			double epsilon = 1e-15;
			while (Math.abs(t - c / t) > epsilon * t) {
				t = (c / t + t) / 2.0;
			}
			System.out.println("the squareroot of given number is=" + " " + t);
		}
	}
}
