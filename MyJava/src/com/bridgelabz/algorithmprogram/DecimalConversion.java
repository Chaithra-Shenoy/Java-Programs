/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Write a static function toBinary that outputs the binary (base 2)
 * representation of the decimal number typed as the input. It is based on
 * decomposing the number into a sum of powers of 2.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class DecimalConversion {
	public static void main(String[] args) {
		System.out.println("Enter the interger number");
		int number = 0;
		number = Utility.scanner(number);
		String string = Utility.toBinary(number);
		System.out.println(string);
	}
}
