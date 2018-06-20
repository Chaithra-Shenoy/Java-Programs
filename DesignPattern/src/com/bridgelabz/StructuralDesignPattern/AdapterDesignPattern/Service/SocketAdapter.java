/**
 * 
 */
package com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.Service;

import com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.AdapterModel.Volt;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public interface SocketAdapter {
	public Volt get120volt();

	public Volt get12volt();

	public Volt get3volt();

}
