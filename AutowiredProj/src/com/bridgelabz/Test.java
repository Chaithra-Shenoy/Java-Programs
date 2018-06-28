/**
 * 
 */
package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class Test {
public static void main(String[] args) {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
	((AbstractApplicationContext) ctx).registerShutdownHook();
	Employee emp=ctx.getBean("employee", Employee.class);
	emp.getMsg();
	Pancard pan=emp.getPancard();
	if(pan!=null)
	pan.getMsg();
}
}
