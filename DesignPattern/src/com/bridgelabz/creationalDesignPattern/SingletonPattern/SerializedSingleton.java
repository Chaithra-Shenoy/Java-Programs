/**
 * 
 */
package com.bridgelabz.creationalDesignPattern.SingletonPattern;

import java.io.Serializable;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class SerializedSingleton implements Serializable {
	private static final long serialUID = -7604766930445L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	/**
	 * @return instance
	 */
	public static SerializedSingleton getInstance() {
//		System.out.println(SingletonHelper.instance.hashCode());
		return SingletonHelper.instance;
	}

	public static void main(String[] args) {
		SerializedSingleton one = new SerializedSingleton();
		one.getInstance();
		System.out.println(one.serialUID);
		SerializedSingleton two = new SerializedSingleton();
		two.getInstance();
		System.out.println(two.serialUID);
	}
}
