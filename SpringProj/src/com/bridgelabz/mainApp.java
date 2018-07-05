/**
 * 
 */
package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * purpose Autowire Bysetters
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name mainApp
 * 
 */
public class mainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		((AbstractApplicationContext) ctx).registerShutdownHook();// to close application context!!
		Student stu1 = (Student) ctx.getBean("chaithra");
		stu1.getMessage();
		Student stu2 = (Student) ctx.getBean("aruna");
		stu2.getMessage();
		Student stu3 = (Student) ctx.getBean("priya");
		stu3.getMessage();
	}
}
