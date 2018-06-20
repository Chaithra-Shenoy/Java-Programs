/**
 * 
 */
package com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.ServiceImplementation;

import com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.AdapterModel.Socket;
import com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.AdapterModel.Volt;
import com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.Service.SocketAdapter;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class SocketAdapterImpl implements SocketAdapter {
	// Using Composition for adapter pattern
	private Socket socket = new Socket();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.Service.
	 * SocketAdapter#get120volt()
	 */
	@Override
	public Volt get120volt() {
		return socket.getVolt();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.Service.
	 * SocketAdapter#get12volt()
	 */
	@Override
	public Volt get12volt() {
		Volt volt = socket.getVolt();
		return converVolt(volt, 10);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.Service.
	 * SocketAdapter#get3volt()
	 */
	@Override
	public Volt get3volt() {
		Volt volt = socket.getVolt();
		return converVolt(volt, 4);
	}

	/**
	 * @param volt
	 * @param i
	 * @return converted volt
	 */
	private Volt converVolt(Volt volt, int i) {

		return new Volt(volt.getVolts() / i);
	}

}
