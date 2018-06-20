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
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instancenew;

	private ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instancenew == null) {
			instancenew = new ThreadSafeSingleton();
			System.out.println(instancenew.hashCode());
		} else
			System.out.println(instancenew.hashCode());
		return instancenew;
	}
}
