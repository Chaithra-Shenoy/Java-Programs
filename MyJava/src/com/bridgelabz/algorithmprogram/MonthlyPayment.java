/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Write a Util Static Function to calculate monthlyPayment that reads
 * in three command­line arguments P, Y, and R and calculates the monthly
 * payments you would have to make over Y years to pay off a P principal loan
 * amount at R per cent interest compounded monthly.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class MonthlyPayment {
	public static void main(String[] args) {
		double principle = Double.parseDouble(args[0]);
		double year = Double.parseDouble(args[1]);
		double Rate = Double.parseDouble(args[2]);
		Utility.monthlyPay(principle, year, Rate);
	}
}
