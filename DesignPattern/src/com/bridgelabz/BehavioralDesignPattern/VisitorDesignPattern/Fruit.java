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
public class Fruit implements ItemElement {
	private int pricePerKG;
	private int weight;
	private String name;

	/**
	 * @return the pricePerKG
	 */
	public int getPricePerKG() {
		return pricePerKG;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
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

	/**
	 * @param pricePerKG
	 * @param weight
	 * @param name
	 */
	public Fruit(int pricePerKG, int weight, String name) {
		super();
		this.pricePerKG = pricePerKG;
		this.weight = weight;
		this.name = name;
	}

}
