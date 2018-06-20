/**
 * 
 */
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Write a program WindChill.java that takes two double command­line
 * arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute
 * ab.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class WindChill {
	public static void main(String[] args) {
		double temp = Double.parseDouble(args[0]);
		double speed = Double.parseDouble(args[1]);
		if (temp > 50 || speed > 120 || speed < 3)
			System.out.println("invalid range");
		else
			Utility.findTemperature(temp, speed);
	}
}
