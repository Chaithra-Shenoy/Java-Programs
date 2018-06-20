/**
 * 
 */
package com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.AdapterControl;

import com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.AdapterModel.Volt;
import com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.Service.SocketAdapter;
import com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.ServiceImplementation.SocketAdapterImpl;
import com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.ServiceImplementation.SocketClassAdapterIm;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class AdapterController {
	public static void main(String[] args) {
		testSocketAdapter();
		testSocketClassAdapter();
	}

	/**
	 *  
	 */
	private static void testSocketClassAdapter() {
		SocketAdapter socketClass = new SocketClassAdapterIm();
		Volt v3 = socketClass.get3volt();
		System.out.println("3 volt -" + v3.getVolts());
		Volt v12 = socketClass.get12volt();
		System.out.println("12 volts --" + v12.getVolts());
		Volt v120 = socketClass.get120volt();
		System.out.println("120 volts --" + v120.getVolts());
	}

	/**
	 * 
	 */
	private static void testSocketAdapter() {
		SocketAdapterImpl socket = new SocketAdapterImpl();
		Volt v3 = socket.get3volt();
		System.out.println("3 VOLTS --" + v3.getVolts());
		Volt v12 = socket.get12volt();
		System.out.println("12 volts --" + v12.getVolts());
		Volt v120 = socket.get120volt();
		System.out.println("120 volts --" + v120.getVolts());
	}
}
