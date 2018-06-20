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
public interface ShoppingCartVisitor {
	public int visit(Book book);

	public int visit(Fruit fruit);
}
