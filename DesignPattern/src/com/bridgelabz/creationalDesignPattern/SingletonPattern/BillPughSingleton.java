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
public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		System.out.println(SingletonHelper.INSTANCE.hashCode());
		return SingletonHelper.INSTANCE;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		BillPughSingleton obj1 = new BillPughSingleton();
		obj1.getInstance();
		BillPughSingleton obj2 = new BillPughSingleton();
		obj2.getInstance();
	}
}
