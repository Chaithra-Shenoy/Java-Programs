/**
 * 
 */
package com.bridgelabz.creationalDesignPattern.SingletonPattern;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	/**
	 * private constructor
	 */
	private EagerSingleton() {

	}

	/**
	 * @return EagerSingleton
	 */
	public static EagerSingleton getInstance() {

		return instance;
	}
}
