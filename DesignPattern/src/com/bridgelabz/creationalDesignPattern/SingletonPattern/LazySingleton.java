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
public class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
			System.out.println(instance.hashCode());
		} else
			System.out.println(instance.hashCode());
		return instance;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		LazySingleton obj1 = new LazySingleton();
		obj1.getInstance();
		LazySingleton obj2 = new LazySingleton();
		obj2.getInstance();
	}

}
