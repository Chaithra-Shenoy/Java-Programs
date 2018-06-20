package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

/**
 * purpose to find power of 2
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class PowerOf2 {
	public static void main(String[] args) {
		int res = 1;
		int number = Integer.parseInt(args[0]);
		for (int i = 0; i <= number; i++) {
			res = Utility.pow(2, i);
			System.out.println("2 ^" + i + "=" + res);
		}
	}
}
