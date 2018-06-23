/**
 * 
 */
package com.bridgelabz;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface MyAnnotation {
int value();
}
 class Chaithra{
	 @MyAnnotation(value=10)
	 public void greeting() {
		 System.out.println("Hello");
	 }
 }
 class Final{
	 public static void main(String[] args) {
		
		try {
			Method m=Chaithra.class.getMethod("greeting");
			System.out.println(m.getName());
			MyAnnotation my=m.getAnnotation(MyAnnotation.class);
			System.out.println(my.value());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
 }