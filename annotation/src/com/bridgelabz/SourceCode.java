/**
 * 
 */
package com.bridgelabz;

import java.lang.reflect.Method;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class SourceCode {
@NewAnnotation(age=22)
public void methodOne() {
	System.out.println("MethodOne is running....");
}
@NewAnnotation(name="aruna", age=24)
public void methodTwo() {
	System.out.println("MethodTwo is running ....");
}
public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	System.out.println("Welome to Annotation...");
	Method methods=new SourceCode().getClass().getMethod("methodTwo");
	NewAnnotation annotation=methods.getAnnotation(NewAnnotation.class);
	System.out.println(annotation.name()+" "+annotation.age());
}
}
