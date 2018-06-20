/**
 * 
 */
package com.bridgelabz.BehavioralDesignPattern.VisitorDesignPattern;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Book implements ItemElement {
	private int price;
	private String isdNumber;

	/**
	 * @param price
	 * @param isdNumber
	 */
	public Book(int price, String isdNumber) {
		this.price = price;
		this.isdNumber = isdNumber;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @return the isdNumber
	 */
	public String getIsdNumber() {
		return isdNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.BehavioralDesignPattern.VisitorDesignPattern.ItemElement#
	 * accept(com.bridgelabz.BehavioralDesignPattern.VisitorDesignPattern.
	 * ShoppingCartVisitor)
	 */
	@Override
	public int accept(ShoppingCartVisitor visitor) {

		return visitor.visit(this);
	}

}
