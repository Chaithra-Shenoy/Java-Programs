/**
 * 
 */
package com.bridgelabz.creationalDesignPattern.SingletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class SerializedSingletonExample {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = (SerializedSingleton) SerializedSingletonExample.readResolve();
		ObjectOutput out = new ObjectOutputStream(
				new FileOutputStream("/home/administrator/Documents/SerializedSingleton.ser/"));
		out.writeObject(instanceOne);
		out.close();

		ObjectInput in = new ObjectInputStream(
				new FileInputStream("/home/administrator/Documents/SerializedSingleton.ser/"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		
	}

	public static Object readResolve() {

		return SerializedSingleton.getInstance();
	}

}
