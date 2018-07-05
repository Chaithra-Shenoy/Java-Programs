/**
 * 
 */
package com.bridgelabz;

/**
 * purpose Autowired byName
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

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the pancard
	 */
	public Pancard getPancard() {
		return pancard;
	}

	/**
	 * @param pancard
	 *            the pancard to set
	 */
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	public void getMsg() {
		System.out.println("Employee details : \n Employee name:" + name + " Employee id :" + id);
	}

	public void init() {
		System.out.println("Bean lifecycle is initiated... WELCOME!");
	}

	public void destroy() {
		System.out.println("Bean lifecycle destroyed... BYE!");
	}
}
