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
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.BehavioralDesignPattern.VisitorDesignPattern.
	 * ShoppingCartVisitor#visit(com.bridgelabz.BehavioralDesignPattern.
	 * VisitorDesignPattern.Book)
	 */
	@Override
	public int visit(Book book) {
		int cost;
			cost = book.getPrice();
		System.out.println("Book ISBN::" + book.getIsdNumber() + " cost =" + cost);
		return cost;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.BehavioralDesignPattern.VisitorDesignPattern.
	 * ShoppingCartVisitor#visit(com.bridgelabz.BehavioralDesignPattern.
	 * VisitorDesignPattern.Fruit)
	 */
	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKG() * fruit.getWeight();
		System.out.println(fruit.getName() + " cost = " + cost);
		return cost;
	}

}
