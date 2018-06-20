package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class CouponNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int num = sc.nextInt();
		int ar[] = new int[num];
		Utility.random(num, ar);
		Utility.distinct(ar);
	}
}
