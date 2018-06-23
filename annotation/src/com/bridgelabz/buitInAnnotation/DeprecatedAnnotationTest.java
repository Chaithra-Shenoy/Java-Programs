/**
 * 
 */
package com.bridgelabz.buitInAnnotation;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class DeprecatedAnnotationTest {
public static void main(String[] args) {
	Add add=new Add();
	@SuppressWarnings("deprecation")
	int sum=add.sum(10, 20);
	System.out.println(sum);
	
	int array[]= {10,20,30,40,50};
	int sum2=add.sum(array);
	System.out.println(sum2);
}
}
