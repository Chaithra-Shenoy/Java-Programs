/**
 * 
 */
package com.bridgelabz.creationalDesignPattern.SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class ReflectionSingletonTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		EagerSingleton instanceOne = EagerSingleton.getInstance();
		EagerSingleton instanceTwo = null;

		
		Constructor[] constructor = EagerSingleton.class.getDeclaredConstructors();
		for (Constructor constructor2 : constructor) {
			constructor2.setAccessible(true);
			try {
				instanceTwo = (EagerSingleton) constructor2.newInstance();
				break;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
