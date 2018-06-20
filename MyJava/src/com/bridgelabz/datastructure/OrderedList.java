/**
 * 
 */
package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Read .a List of Numbers from a file and arrange it ascending Order in
 * a Linked List. Take user input for a number, if found then pop the number out
 * of the list else insert the number in appropriate position
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @param <E>
 * @since 17-05-2018
 */
public class OrderedList {
	static int count = 0;

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.list();
		count = 0;
		File f = new File("/home/administrator/Java/MyJava/files/orderlist");
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fwriter = null;
		BufferedWriter bwriter = null;
		String[] str = new String[100];
		// Reading content from File.
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String word = br.readLine();
			while (word != null) {
				str = word.split(",");
				count++;
				break;
			}
			// Converting string array into Integer Array.
			Integer[] array = new Integer[str.length];
			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(str[i]);
			}
			// Sorting array
			Integer[] sorted = (Integer[]) Utility.bubbleSort(array);
			for (int i = 0; i < sorted.length; i++) {
				list.add(sorted[i]);
			}
			list.display();
			System.out.println("Enter the word to search in the linked list");
			int number = 0;
			number = Utility.scanner(number);
			int valueAt = list.search(number);
			if (valueAt == -1) {
				System.out.println("Adding name in the list");
				list.add(number);
				System.out.println("Name added Successfully");
				fwriter = new FileWriter("/home/administrator/Java/MyJava/files/orderlist");
				bwriter = new BufferedWriter(fwriter);
				bwriter.write(word + "," + number);
				bwriter.flush();
				list.display();
			} else {
				list.remove(valueAt);
				System.out.println("Word removed Successfully");
				list.display();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
