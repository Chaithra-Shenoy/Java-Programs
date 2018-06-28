/**
 * 
 */
package com.bridgelabz;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class Shape {
private String type;
private int area;
private int circum;
/**
 * @param type
 * @param area
 */
public Shape(String type, int area) {
	this.type = type;
	this.area = area;
}
/**
 * @param type
 */
public Shape(String type) {
	this.type = type;
}
/**
 * @param area
 */

public void getMessage() {
	System.out.println(type+" with area "+area+" and circumference is "+circum);
}
/**
 * @param type
 * @param area
 * @param circum
 */
public Shape(String type, int area, int circum) {
	super();
	this.type = type;
	this.area = area;
	this.circum = circum;
}
/**
 * @param circum
 */
public Shape(int circum) {
	super();
	this.circum = circum;
}

}
