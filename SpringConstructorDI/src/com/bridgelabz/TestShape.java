/**
 * 
 */
package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * purpose Main class 
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class TestShape {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("construct.xml");
		Shape shape = (Shape) context.getBean("shape");
		shape.getMessage();
	}
}
