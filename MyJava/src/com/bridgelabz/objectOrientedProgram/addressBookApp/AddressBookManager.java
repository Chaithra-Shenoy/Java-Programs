package com.bridgelabz.objectOrientedProgram.addressBookApp;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

/**
 * purpose Create AddressBoook class to add Person details to it and also sort
 * person based on last name and zipcode.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class AddressBookManager {
	static Scanner scanner = new Scanner(System.in);
	static AddressBook addressBook = new AddressBook();

	/**
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 */
	public static void option() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("Enter the operation to be done to AddressBook According to the options");
		System.out.println(
				"\n 1] Create New File \n 2] AddPerson \n 3] EditPerson \n 4] DeletePerson \n 5] sort by last name \n 6] sort by zipcode"
						+ "\n 7] Search Person \n 8] print details \n 9] quit addressbook");
		int choice = scanner.nextInt();
		performOperation(choice);
	}

	/**
	 * @param choice
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 */
	public static void performOperation(int choice)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		switch (choice) {
		case 1:
			addressBook.createNewFile();
			break;
		case 2:
			addressBook.add();
			break;
		case 3:

			addressBook.edit();
			break;
		case 4:
			addressBook.delete();
			break;
		case 5:
			addressBook.sortByLastName();
			break;
		case 6:
			addressBook.sortByZipCode();
			break;
		case 7:
			addressBook.search();
			break;
		case 8:
			addressBook.printEntries();
			break;
		case 9:
			addressBook.quit();
			break;
		}
	}

	public static void main(String[] args)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("Welcome!! Please create new file first Click 1 ");
		option();

	}

}