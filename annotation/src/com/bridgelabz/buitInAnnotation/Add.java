/**
 * 
 */
package com.bridgelabz.buitInAnnotation;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class Add {
	// this method is not required make this as deprecated method
	@Deprecated
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
//takes 0 to n values
	public int sum(int... nums) {
		int sum = 0;
		for (int i : nums) {
			sum = sum + i;
		}
		return sum;
	}
}
