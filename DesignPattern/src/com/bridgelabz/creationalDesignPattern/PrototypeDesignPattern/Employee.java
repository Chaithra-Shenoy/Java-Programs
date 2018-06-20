/**
 * 
 */
package com.bridgelabz.creationalDesignPattern.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Employee implements Cloneable {
	private List<String> list;

	public Employee() {
		list = new ArrayList<String>();
	}

	public Employee(List<String> list) {
		this.list = list;
	}

	public void addList() {
		list.add("Chaithra Shenoy");
		list.add("Aruna");
		list.add("Lakshmi Priya");
		list.add("Saurav Manchanda");
		list.add("Ashwini Hegde");
	}

	/**
	 * @return list
	 */
	public List<String> getList() {
		return list;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {
		List<String> tempList = new ArrayList<String>();
		for (String string : this.getList()) {
			tempList.add(string);
		}
		return new Employee(tempList);
	}

}
