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
public enum EnumSingleton {
	Instance;
	public static void display() {
		System.out.println(Instance.hashCode());

	}

	public static void main(String[] args) {
		EnumSingleton.display();
	}
}
