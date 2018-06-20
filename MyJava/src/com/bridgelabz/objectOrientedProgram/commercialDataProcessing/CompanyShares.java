/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.commercialDataProcessing;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class CompanyShares {
	private String symbol;
	private int numberOfShares;
	private double price;
    private String dateTime;
	/**
	 * @return the dateTime
	 */
	public String getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getValue() {
		return numberOfShares * price;
	}

	public String toString() {
		return "\nShare Details: \n" + symbol + ", " + numberOfShares + ", " + price;
	}
}
