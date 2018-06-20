/**
 * 
 */
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

/**
 * purpose to find the roots of the equation a*x*x + b*x + c.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Quadratic {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		System.out.println("Enter the values of a,b,c");

		a = Utility.scanner(a);
		b = Utility.scanner(b);
		c = Utility.scanner(c);
		double delta, root1, root2;
		delta = b * b - 4 * a * c;
		root1 = (-b + Math.sqrt(delta)) / (2 * a);
		root2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("root1 is " + root1);
		System.out.println("root2 is " + root2);
	}

}
