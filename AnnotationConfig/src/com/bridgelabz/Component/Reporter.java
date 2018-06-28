/**
 * 
 */
package com.bridgelabz.Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class Reporter {
public static void main(String[] args) {
ApplicationContext ctx=new ClassPathXmlApplicationContext("Component.xml");
MassMedia mass=ctx.getBean("massMedia", MassMedia.class);
System.out.println(mass.toString());
System.out.println(mass.getNewsPaper().toString());
}
}
