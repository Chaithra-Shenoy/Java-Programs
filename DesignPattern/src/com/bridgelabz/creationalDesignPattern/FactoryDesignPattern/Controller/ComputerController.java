/**
 * 
 */
package com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.Controller;

import com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.AbstractClass.Computer;
import com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.HelperClass.FactoryHelper;
import com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.HelperClass.Utility;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class ComputerController {
	public static void main(String[] args) {
		System.out.println("Enter the type of computer u need");
		String type = Utility.getString();
		Computer pc = FactoryHelper.getComputer(type, "4GB", "500GB", "2GHz");
		System.out.println(type + " " + "Configurations - " + pc);
		
		// Computer pc = FactoryHelper.getComputer("pc", "4GB", "500GB", "2GHz");
		// Computer server = FactoryHelper.getComputer("server", "40GB", "2TB",
		// "20GHz");
		// System.out.println("SERVER Configurations - " + server);
		// Computer laptop = FactoryHelper.getComputer("LAPTOP", "8GB", "1TB", "4GHz");
		// System.out.println("LAPTOP Configurations - " + laptop);

	}
}
