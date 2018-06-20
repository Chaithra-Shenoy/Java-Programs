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
public class SocketClassAdapterIm extends Socket implements SocketAdapter {
	// using inheritance concept
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.Service.
	 * SocketAdapter#get120volt()
	 */
	@Override
	public Volt get120volt() {
		return getVolt();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.Service.
	 * SocketAdapter#get12volt()
	 */
	@Override
	public Volt get12volt() {
		Volt v = getVolt();
		return convertVolt(v, 10);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.StructuralDesignPattern.AdapterDesignPattern.Service.
	 * SocketAdapter#get3volt()
	 */
	@Override
	public Volt get3volt() {
		Volt v = getVolt();
		return convertVolt(v, 40);
	}

	/**
	 * @param v
	 * @param i
	 * @return
	 */
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}

}
