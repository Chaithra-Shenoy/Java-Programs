/**
 * 
 */
package com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.AdapterModel;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Volt {
	private int volts;

	public Volt(int volts) {
		this.volts = volts;
	}

	/**
	 * @return the volts
	 */
	public int getVolts() {
		return volts;
	}

	/**
	 * @param volts
	 *            the volts to set
	 */
	public void setVolts(int volts) {
		this.volts = volts;
	}
}
