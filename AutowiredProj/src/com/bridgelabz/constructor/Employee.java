/**
 * 
 */
package com.bridgelabz.constructor;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class Employee {
	private int id;
	private String name;

	private Pancard pancard;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	




	/**
	 * @param id
	 * @param name
	 */
	public Employee(int id, String name,Pancard pan) {
		this.id = id;
		this.name = name;
		this.pancard=pan;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the pancard
	 */
	public Pancard getPancard() {
		return pancard;
	}

}
