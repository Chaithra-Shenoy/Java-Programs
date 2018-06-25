/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.addressBookExtended.service;

import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.parser.ParseException;

import com.bridgelabz.objectOrientedProgram.addressBookExtended.repository.Serialiser;
import com.bridgelabz.objectOrientedProgram.addressBookExtended.repository.SerialiserFactory;



public class AddressBookJDBCImpl {
	Serialiser serialiserFactoryInterface;
	AddressBookJSONImpl addressBook = new AddressBookJSONImpl();
	ObjectMapper mapper = new ObjectMapper();
	AddressBookJSONImpl jsonImpl=new AddressBookJSONImpl();
	com.bridgelabz.objectOrientedProgram.addressBookExtended.Utility.AddressUtility addressUtility= new com.bridgelabz.objectOrientedProgram.addressBookExtended.Utility.AddressUtility();
	public ArrayList<com.bridgelabz.objectOrientedProgram.addressBookExtended.model.Person> personList = new ArrayList<com.bridgelabz.objectOrientedProgram.addressBookExtended.model.Person>();
	public ArrayList<String> addressBookList = new ArrayList<String>();
	static String template = "/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/addressBookExtended/files/";
	static String bookList="/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/addressBookExtended/files/BookList.json";
	static Serialiser serialiser;
	

	
	/**
	 * Method to CREATE A NEW ADDRESS book and saving the track of newly created address book in the JSON file named "addressBookList"
	 * 
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws PropertyVetoException 
	 * @throws SQLException 
	 * @throws ParseException
	 */
	
	public void createAddressBook(String serialiseType,String addressBookName) throws JsonGenerationException, JsonMappingException, IOException, SQLException, PropertyVetoException {
		serialiser=com.bridgelabz.objectOrientedProgram.addressBookExtended.repository.SerialiserFactory.getSerialiser(serialiseType);
		serialiser.createBook(addressBookName);
		}

	
	
	/**
	 * Method to DISPLAY address book
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void displayAddressBookList() throws FileNotFoundException, IOException, ParseException {
		System.out.println("The addressBooks available with us is displayed below:");
		addressBookList = mapper.readValue(new File(bookList), new TypeReference<ArrayList<String>>() {});
		for(int i=0 ;i<addressBookList.size();i++) {
			System.out.println(addressBookList.get(i));
		}
	}




	public void deleteAddressBook(String serialiseType) throws SQLException, IOException, PropertyVetoException {
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		serialiser.deleteAddressBook();
		
		
	}


	public void openExistingAdBook(String serialiseType) throws JsonGenerationException, JsonMappingException, IOException, ParseException, SQLException, PropertyVetoException {
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		System.out.println("Enter the address book you want to view ");
		String addressBookName=com.bridgelabz.objectOrientedProgram.addressBookExtended.Utility.AddressUtility.userInputString();
		serialiser.viewAddressbook(addressBookName);
		
	}


	public void addPerson(String serialiseType,String addressbookName) throws JsonGenerationException, JsonMappingException, SecurityException, IOException, ParseException, InterruptedException, SQLException, PropertyVetoException {
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		jsonImpl.addPerson(serialiser,addressbookName);

		
	}



	
	public void removePerson(String serialiseType,String addressbookName) throws FileNotFoundException, SecurityException, IOException, ParseException, InterruptedException, SQLException, PropertyVetoException {
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		jsonImpl.removePerson(serialiser,addressbookName);
		
	}




	public void updatePerson(String serialiseType,String addressbookName) throws FileNotFoundException, SecurityException, IOException, ParseException, InterruptedException, SQLException, PropertyVetoException {
	
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		jsonImpl.updatePerson(serialiser, addressbookName);
	}



	}


