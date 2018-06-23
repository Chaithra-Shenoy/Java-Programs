/**
 * 
 */
package com.bridgelabz;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class ReflectionImpl implements ReflectionInterface {
private int num=10;
private int num2=20;
@SuppressWarnings("unused")
private String id=null;

/**
 * @param id
 */
public ReflectionImpl(String id) {
	
	this.id = id;
}

public String getPrivate() {
	return "How do get this";
}

/* (non-Javadoc)
 * @see com.bridgelabz.ReflectionInterface#add()
 */
@Override
public void add() {
	int res=num+num2;
	System.out.println("sum of two numbers"+res);
}

/**
 * 
 */
public ReflectionImpl(int number,String msg) {
	 	System.out.println("you entered  "+number+" "+msg);
}

}
