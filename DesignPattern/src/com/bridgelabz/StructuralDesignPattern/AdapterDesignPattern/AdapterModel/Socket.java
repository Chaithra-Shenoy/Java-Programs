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
public class Socket {
	/**
	 * @return Volt
	 */
	public Volt getVolt() {
		return new Volt(120);

	}
}
