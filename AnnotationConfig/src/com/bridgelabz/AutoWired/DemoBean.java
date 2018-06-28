/**
 * 
 */
package com.bridgelabz.AutoWired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class DemoBean {
private int id;
private String name;


 private Auto auto;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
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
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the auto
 */

public Auto getAuto() {
	return auto;
}
/**
 * @param auto the auto to set
 */
@Autowired
public void setAuto(Auto auto) {
	this.auto = auto;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override

public String toString() {
	return "DemoBean [id=" + id + ", name=" + name +"]";
}
 
}
