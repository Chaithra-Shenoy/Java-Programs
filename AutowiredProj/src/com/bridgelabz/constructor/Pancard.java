/**
 * 
 */
package com.bridgelabz.constructor;

/**
 * purpose Pancard bean class
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class Pancard {
	private String panName;
	private int number;

	/**
	 * @return the panName
	 */
	public String getPanName() {
		return panName;
	}

	/**
	 * @param panName
	 *            the panName to set
	 */
	public void setPanName(String panName) {
		this.panName = panName;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	public void getMsg() {
		System.out.println("Pancard details : \n Pan name:" + panName + " pan number :" + number);
	}
}
