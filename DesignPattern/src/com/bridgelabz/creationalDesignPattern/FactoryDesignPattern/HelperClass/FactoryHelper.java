/**
 * 
 */
package com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.HelperClass;

import com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.AbstractClass.Computer;
import com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.ImplementationClass.Laptop;
import com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.ImplementationClass.PC;
import com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.ImplementationClass.Server;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class FactoryHelper {
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type)) {
			System.out.println("PC Type COMPUTER");
			return new PC(ram, hdd, cpu);
		} else if ("Server".equalsIgnoreCase(type)) {
			System.out.println("SERVER Type COMPUTER");
			return new Server(ram, hdd, cpu);
		} else if ("Laptop".equalsIgnoreCase(type)) {
			System.out.println("LAPTOP Type COMPUTER");
			return new Laptop(ram, hdd, cpu);
		} else
			System.out.println("No computer found");
		return null;
	}
}
