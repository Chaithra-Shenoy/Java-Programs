/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.MyAddressBook.Controller;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.objectOrientedProgram.MyAddressBook.Utility.Utility;
import com.bridgelabz.objectOrientedProgram.MyAddressBook.adressBookFactory.AddressBookFactory;
import com.bridgelabz.objectOrientedProgram.MyAddressBook.adressBookFactory.DataService;
import com.bridgelabz.objectOrientedProgram.MyAddressBook.model.Person;
import com.bridgelabz.objectOrientedProgram.MyAddressBook.service.AddressBookService;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class AddressBookController {
	static List<Person> personList = new ArrayList<>();
	private static DataService data;

	public static void main(String[] args) throws Exception {
		System.out.println("welcome to address book manager");
		System.out.println("enter the type : Json/JDBC");
		String obj = Utility.userNext();

		AddressBookService manager = AddressBookFactory.getObject(obj);
		manager.getConnection();
		while (true) {
			System.out
					.println("Enter the operation you want to do:\n" + "1.Create new AddressBook\n " + "2.delete user\n"
							+ "3.update user details\n" + "4.see details of user\n" + "5.create mutiple address book\n"
							+ "6.search multiple address book\n" + "7.display multiple address book\n" + "8. Exit\n");
			System.out.println("enter choice");
			int choice = Utility.userInteger();
			switch (choice) {
			case 1:
				manager.addPerson();
				break;
			case 2:
				manager.deletePerson();
				break;
			case 3:
				manager.updatePerson();
				break;
			case 4:
				manager.seePersonDetails();
				break;
			case 5:
				manager.createMultipleAddressBook();
				break;
			case 6:
				manager.searchMultipleAddressBook();
				break;
			case 7:
				manager.displayMultipleAddressBook();
				break;
			default:
				System.out.println("invalid choice,try again");
				break;
			}
		}
	}
}
