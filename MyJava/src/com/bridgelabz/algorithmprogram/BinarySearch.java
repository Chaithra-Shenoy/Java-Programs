/**
 * 
 */
package com.bridgelabz.algorithmprogram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Read in a list of words from wordlist. Then prompt the user to enter
 * a word to search the list. The program reports if the search word is found in
 * the list.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class BinarySearch {
	public static void main(String[] args) throws IOException {
		String element = null;
		BinarySearch bss = new BinarySearch();
		bss.fileWriter();
		String[] stringArray = bss.fileReader();
		System.out.println("Sorting the String first");
		String[] array1 = Utility.bubbleSort(stringArray);
		for (int i = 0; i < array1.length; i++)
			System.out.println(array1[i]);
		System.out.println("Enter the word you want to search");
		element = Utility.scanner(element);

		Utility.binarySearch(array1, element);

	}

	public void fileWriter() throws IOException {
		Utility utility = new Utility();
		FileWriter fileWriter = new FileWriter("/home/administrator/Java/MyJava/files/text");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		;
		System.out.println("Enter string you want to insert into a file:");
		String string = null;
		string = Utility.scanner(string);
		bufferedWriter.write(string);
		bufferedWriter.flush();
		bufferedWriter.close();
		System.out.println("The file is written successfuly");
	}

	public String[] fileReader() throws IOException {

		FileReader fileReader = new FileReader("/home/administrator/Java/MyJava/files/text");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str = bufferedReader.readLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',' && str.charAt(i + 1) != ',') {
				count++;
			}
		}
		String arr[] = new String[count + 1];
		int j = 0;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ',') {
				temp += str.charAt(i);
			} else {
				arr[j] = temp;
				temp = "";
				j++;
			}
		}
		arr[j] = temp;
		bufferedReader.close();

		return arr;
	}

}
