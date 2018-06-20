/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.StockApp;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Stock {
	private String stockName;
	private int stockNumber;
	private int stockPrice;

	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * @param stockName
	 *            the stockName to set
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/**
	 * @return the stockNumber
	 */
	public int getStockNumber() {
		return stockNumber;
	}

	/**
	 * @param stockNumber
	 *            the stockNumber to set
	 */
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}

	/**
	 * @return the stockPrice
	 */
	public int getStockPrice() {
		return stockPrice;
	}

	/**
	 * @param stockPrice
	 *            the stockPrice to set
	 */
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
}
