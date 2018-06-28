/**
 * 
 */
package com.bridgelabz.AutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class ClientTest {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("AutoWired.xml");
	DemoBean db=ctx.getBean("demoBean", DemoBean.class);
	System.out.println(db.toString());
	Auto au=db.getAuto();
	if(au!=null)
	System.out.println(au.toString());
	else
		System.out.println("no pancard available");
	
}
}
