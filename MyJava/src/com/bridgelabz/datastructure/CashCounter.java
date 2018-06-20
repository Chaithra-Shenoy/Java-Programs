
package com.bridgelabz.datastructure;

import java.util.Scanner;

import javax.management.modelmbean.DescriptorSupport;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Create a Program which creates Banking Cash Counter where people come
 * in to deposit Cash and withdraw Cash. Have an input panel to add people to
 * Queue to either deposit or withdraw money and dequeue the people. Maintain
 * the Cash Balance.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class CashCounter {
	static Queue q = new Queue(5);
	static double AMOUNT = 0;

	public static void main(String[] args) {
		int choice = 0;

		System.out.println("Enter minimum balance to be maintained");
		AMOUNT = Utility.scanner(AMOUNT);
		System.out.println("Amount in bank  :" + AMOUNT);
		double totalAmount = AMOUNT;
		for (int i = 0; i < q.size(); i++) {

			q.enqueue(i);
		}
		for (int i = 0; i < q.size(); i++) {
			System.out.println("Enter the following option");
			System.out.println("enter 1 for deposit");
			System.out.println("enter 2 for withdraw");
			choice = Utility.scanner(choice);

			double cash = 0;
			switch (choice) {
			case 1:
				System.out.println("enter the amount to be deposit");
				cash = Utility.scanner(cash);
				totalAmount = deposit(cash, totalAmount);
				System.out.println(totalAmount);
				break;
			case 2:
				System.out.println("enter the amount to be withdraw");
				cash = Utility.scanner(cash);
				totalAmount = withdraw(cash, totalAmount);
				System.out.println(totalAmount);
				break;
			}
		}
	}

	public static double deposit(double cash, double amount) {
		amount = amount + cash;
		q.dequeue();
		System.out.println(amount);
		return amount;
	}

	public static double withdraw(double cash2, Double amount) {
		if (cash2 < amount) {
			amount = amount - cash2;
			q.dequeue();
			return amount;
		}
		return amount;
	}
}
