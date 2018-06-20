/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.Utility.Utility;

/**
 * purpose To the Util Class add temperaturConversion static function, given the
 * temperature in fahrenheit as input outputs the temperature in Celsius or
 * viceversa
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class TemperatureConversion {
	static double celtemp = 0;
	static double fahtemp = 0;

	public static void main(String[] args) {
		System.out.println("Enter the temperature in celsius");
		celtemp = Utility.scanner(celtemp);
		System.out.println("Enter the temperature in fahrenheit");
		fahtemp = Utility.scanner(fahtemp);
		Utility.celToFah(celtemp);
		Utility.fahToCel(fahtemp);
	}
}
