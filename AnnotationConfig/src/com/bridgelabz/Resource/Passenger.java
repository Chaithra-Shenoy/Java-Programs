/**
 * 
 */
package com.bridgelabz.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * purpose test class to test resource annotation.
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class Passenger {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Resource.xml");
		Transport trans = ctx.getBean("transport", Transport.class);
		System.out.println(trans.toString());
		System.out.println(trans.getTrain().toString());
	}
}
