/*User Input and Replace String Template “Hello <<UserName>>, How are you?”
a. I/P ­> Take User Name as Input. Ensure UserName has min 3 char
b. Logic ­> Replace <<UserName>> with the proper name
c. O/P ­> Print the String with User Name*/
package com.bridgelabz.functional;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.Utility.Utility;

/**
 * purpose to replace user name in given string
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class ReplaceName {
	public String replaceString(String str,String replace) {
		Pattern pat=Pattern.compile("<<[^<<]*>>");
		Matcher match=pat.matcher(str);
		return match.replaceAll(replace);
	}
	public static void main(String[] args) {
		String str="Hello <<username>>, how are you?";
		ReplaceName pr=new ReplaceName();
		System.out.println(pr.replaceString(str, "chaithra"));
	}
}
