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
public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
