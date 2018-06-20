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
public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;

	/**
	 * private constructor to restrict instantiation of the class from other classes
	 */
	private StaticBlockSingleton() {
	}

	/* static block initialization */
	static {
		instance = new StaticBlockSingleton();
	}

	/**
	 * @return instance of the class *
	 */
	public static StaticBlockSingleton getInstance() {
		System.out.println(instance.hashCode());
		return instance;
	}

	public static void main(String[] args) {
		StaticBlockSingleton reference1 = new StaticBlockSingleton();
		reference1.getInstance();
		StaticBlockSingleton reference2 = new StaticBlockSingleton();
		reference2.getInstance();
	}
}
