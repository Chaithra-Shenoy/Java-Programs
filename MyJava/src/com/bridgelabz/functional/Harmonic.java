/**
 * 
 */
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

/**
 * purpose to fint Nth harmonic
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Harmonic {
	public static void main(String[] args) {
		int n;

		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Utility.findHarmonic(n);
	}
}
