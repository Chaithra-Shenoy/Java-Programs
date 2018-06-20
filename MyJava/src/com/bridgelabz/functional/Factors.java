/**
 * 
 */
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Computes the prime factorization of N using brute force.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Factors {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Pime factors are:");
		Utility.primeFactor(n);
	}
}
