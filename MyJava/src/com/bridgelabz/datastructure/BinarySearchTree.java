/**
 * 
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.Utility.Utility;

/**
 * purpose You are given N nodes, each having unique value ranging from [1, N],
 * how many different binary search tree can be created using all of them.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class BinarySearchTree {
	static int N = 0;

	public static void main(String[] args) {

		System.out.println("Enter number of test cases");
		N = Utility.scanner(N);
		int count=(int)Math.pow(2, N)-N;
		System.out.println("Possible Binary tree"+count);
		//System.out.println("no of binary trees possible" + " " + treeCount(N));
	}

	/*public static int treeCount(int number) {
		int intsum = 0;
		if (number == 0 || number == 1) {
			return 1;
		} else if (number == 2) {
			return 2;
		} else {
			for (int i = 0; i < number; i++) {
				intsum = intsum + treeCount(i) * treeCount(number - i - 1);
			}
			return intsum;
		}
	}*/
}
