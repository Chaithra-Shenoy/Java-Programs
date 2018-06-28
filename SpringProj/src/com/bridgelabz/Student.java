/**
 * 
 */
package com.bridgelabz;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class Student {
	private String message;
	private int id;

	/**
	 * @param message
	 *                the messege to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 *  to print student name and id
	 */
	public void getMessage() {
		System.out.println("Your Name : " + message);
		System.out.println(" student id: "+id);
	}
	public void init() {
		System.out.println("Bean lifecycle is initiated... WELCOME!");
	}
	public void destroy() {
		System.out.println("Bean lifecycle destroyed... BYE!");
	}
}
