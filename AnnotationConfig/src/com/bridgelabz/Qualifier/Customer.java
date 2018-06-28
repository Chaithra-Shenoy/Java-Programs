/**
 * 
 */
package com.bridgelabz.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class Customer {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Qualifier.xml");
	Vehicle veh=ctx.getBean("vehicle", Vehicle.class);
	System.out.println(veh.toString());
	Car car=veh.getCar();
	System.out.println(car.toString());
}
}
