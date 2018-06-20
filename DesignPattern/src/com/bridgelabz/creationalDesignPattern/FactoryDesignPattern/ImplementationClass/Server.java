/**
 * 
 */
package com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.ImplementationClass;

import com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.AbstractClass.Computer;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Server extends Computer {
	private String ram;
	private String hdd;
	private String cpu;

	/**
	 * @param ram
	 * @param hdd
	 * @param cpu
	 */
	public Server(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.AbstractClass.
	 * Computer#getRAM()
	 */
	@Override
	public String getRAM() {
		return this.ram;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.AbstractClass.
	 * Computer#getHDD()
	 */
	@Override
	public String getHDD() {
		return this.hdd;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bridgelabz.creationalDesignPattern.FactoryDesignPattern.AbstractClass.
	 * Computer#getCPU()
	 */
	@Override
	public String getCPU() {
		return this.cpu;
	}

}
