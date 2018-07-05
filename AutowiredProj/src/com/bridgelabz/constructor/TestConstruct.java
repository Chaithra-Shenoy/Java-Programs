/**
 * 
 */
package com.bridgelabz.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * purpose test class to test autowired by constructor.
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class TestConstruct {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Constructor.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp.toString());
		Pancard pan = emp.getPancard();
		pan.getMsg();
	}
}
