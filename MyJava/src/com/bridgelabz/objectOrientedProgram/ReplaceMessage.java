package com.bridgelabz.objectOrientedProgram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Read in the following message: Hello <<name>>, We have your full name
 * as <<full name>> in our system. your contact number is 91­xxxxxxxxxx.
 * Please,let us know in case of any clarification Thank you BridgeLabz
 * 01/01/2016. Use Regex to replace name, full name, Mobile#, and Date with
 * proper value.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class ReplaceMessage {
	static String string = "Hello <<name>>, We have your full name as <<fullname>> in our"
			+ " system. your contact number is 91­xxxxxxxxxx."
			+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	static String name = "", fullname = "", number = "", date = "";

	public static void main(String[] args) {

		/* Enter user details */
		userDetails();

		/* Regex patterns */
		String regex = "<<name>>";
		String regex_fullname = "<<fullname>>";
		String regex_number = "xxxxxxxxxx";
		String regex_date = "01/01/2016";

		ReplaceMessage pr = new ReplaceMessage();
		string = pr.replaceName(string, regex, name);
		string = pr.replaceName(string, regex_fullname, fullname);
		string = pr.replaceName(string, regex_number, number);
		string = pr.replaceName(string, regex_date, date);
		System.out.println(string);
	}

	/**
	 * @param value
	 * @param regex
	 * @param replace
	 * @return String
	 */
	public String replaceName(String value, String regex, String replace) {
		Pattern pat = Pattern.compile(regex);
		Matcher match = pat.matcher(value);
		return value = match.replaceAll(replace);
	}

	public static void userDetails() {
		System.out.println("Enter your name");
		name = Utility.scanner(name);
		System.out.println("Enter your fullname");
		fullname = Utility.scanner(fullname);
		System.out.println("Enter your number");
		number = Utility.scanner(number);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		Date datenew = new Date();
		date = (String) dateFormat.format(datenew);
	}
}
