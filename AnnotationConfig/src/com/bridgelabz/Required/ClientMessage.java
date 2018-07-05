/**
 * 
 */
package com.bridgelabz.Required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * purpose test class to test required annotation.
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class ClientMessage {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Required.xml");
		Message msg = ctx.getBean("message", Message.class);
		msg.display();
	}
}
