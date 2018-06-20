/**
 * 
 */
package com.bridgelabz.creationalDesignPattern.PrototypeDesignPattern;

import java.util.List;

/**
 * purpose
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class EmployeePrototype {
public static void main(String[] args) {
	Employee employee=new Employee();
	employee.addList();
	Employee empOne=(Employee) employee.clone();
	Employee empTwo=(Employee) employee.clone();
	List<String> list=empOne.getList();
	list.add("Arpitha");
	list.add("Aishu");
	List<String> list1=empTwo.getList();
	list1.remove("Saurav Manchanda");
	list1.remove("Aruna");
	System.out.println("Original list"+employee.getList());
	System.out.println("Employee one list"+empOne.getList());
	System.out.println("Employee two list"+empTwo.getList());
}
}
