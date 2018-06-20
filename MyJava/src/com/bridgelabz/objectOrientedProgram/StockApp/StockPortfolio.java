/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.StockApp;

import java.util.ArrayList;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class StockPortfolio {
	ArrayList<Stock> stockList = new ArrayList<Stock>();

	public ArrayList<Stock> getStockList() {
		return stockList;
	}

	public void setStock(ArrayList<Stock> stockList) {
		this.stockList = stockList;
	}
}
