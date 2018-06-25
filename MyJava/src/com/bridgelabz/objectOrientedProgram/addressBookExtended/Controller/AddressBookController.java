
package com.bridgelabz.objectOrientedProgram.addressBookExtended.Controller;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.objectOrientedProgram.addressBookExtended.Utility.AddressUtility;
import com.bridgelabz.objectOrientedProgram.addressBookExtended.service.AddressBookJDBCImpl;


/**
 * @author bridgelabz
 *
 */
public class AddressBookController {


	/**
	 * @param args
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws SQLException
	 * @throws PropertyVetoException
	 * @throws SecurityException
	 * @throws ParseException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, SQLException, PropertyVetoException, SecurityException, ParseException, InterruptedException {
		System.out.println("Enter in which u need to save json/JDBC");
		String Type =AddressUtility.userInputString();
		AddressBookJDBCImpl addressBookManagerImpl = new AddressBookJDBCImpl();
		System.out.println("WELCOME TO ADDRESS BOOK APPLICATION...!!! ");
		boolean keepOn=true;
		while(keepOn) {
		System.out.println("Enter your choice");

		System.out.println("1] Create new adressbook \n 2] view given adressbook \n 3] Open existing addressBook \n 4] view all adressbook \n 5] Delete addressbook \n 6] Quit ");

		int choice = AddressUtility.userInputInteger();
		switch (choice) {

		case 1:
            System.out.println("Enter addressbook name you want to create");
            String addressBookName=AddressUtility.userInputString();
			addressBookManagerImpl.createAddressBook(Type,addressBookName);
			System.out.println("add persons on your new address book..!!!");
			System.out.println("(1)- ADD A PERSON TO ADDRESSBOOK");
			System.out.println("(2)- QUIT ADDRESSBOOK");
			int choice1 = AddressUtility.userInputInteger();
			switch (choice1) {
			case 1:
			
				addressBookManagerImpl.addPerson(Type,addressBookName);
				break;

			default:
				System.out.println("Exiting address book..!! ThankYou");
			}

			break;

		case 2:
			addressBookManagerImpl.openExistingAdBook(Type);
			break;

		case 3:
			System.out.println("Enter the name of address book you want to open ");
			String addressBookName1 = AddressUtility.userInputString();

			System.out.println("You may perform following operations on existing address book ");
			System.out.println("1] add person \n 2] delete person \n 3] edit person \n 4] Quit");

			int option = AddressUtility.userInputInteger();
			switch (option) {

			case 1:
				addressBookManagerImpl.addPerson(Type,addressBookName1);
				break;

			case 2:
				addressBookManagerImpl.removePerson(Type,addressBookName1);
				break;

			case 3:
				addressBookManagerImpl.updatePerson(Type,addressBookName1);
				break;

			default:
				System.out.println("Exiting address book");

			}
			break;

		case 4:

			break;

		case 5:
			addressBookManagerImpl.deleteAddressBook(Type);
			break;
		default:keepOn=false;
		System.out.println("Exiting addressbook");
		}
		
		}
	}

}
