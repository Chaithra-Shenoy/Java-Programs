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
import org.json.simple.parser.ParseException;

import com.bridgelabz.objectOrientedProgram.addressBookExtended.Utility.AddressUtility;
import com.bridgelabz.objectOrientedProgram.addressBookExtended.model.Person;
import com.bridgelabz.objectOrientedProgram.addressBookExtended.repository.Serialiser;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class AddressBookJSONImpl {
	ArrayList<Person> personList=new ArrayList<Person>();
	Person person = new Person();
	ObjectMapper mapper = new ObjectMapper();

	
	/**
	 * Method to add person's details( to the address book
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address       
	 * @param city
	 * @param state
	 * @param zip
	 * @param phone
	 * @param file
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 * @throws SecurityException
	 * @throws InterruptedException
	 * @throws PropertyVetoException 
	 * @throws SQLException 
	 */
	public void addPerson(Serialiser serialiser,String addressbookName) throws JsonGenerationException, JsonMappingException, IOException, ParseException,SecurityException, InterruptedException, SQLException, PropertyVetoException {
		String[] personData=AddressUtility.askForInputs();
		Person person = new Person(personData[0],personData[1],personData[2],personData[3],personData[4],personData[5],personData[6]);
		serialiser.addPerson(person,addressbookName);
	}


	/**
	 * Method to update person's details(apart from his/her name)
	 * 
	 * @param index
	 *            Position of person in the address book
	 * @param address
	 *            Address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phone
	 * @param file
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 * @throws SecurityException
	 * @throws InterruptedException
	 * @throws PropertyVetoException 
	 * @throws SQLException 
	 */
	public void updatePerson(Serialiser serialiser,String addressbookName)
		throws FileNotFoundException, IOException, ParseException, SecurityException, InterruptedException, SQLException, PropertyVetoException {
		String[] inputs = AddressUtility.askForInputsUpdate();
		serialiser.updatePerson(addressbookName,inputs);
}

	/**
	 * Method to DELETE a person from the address book
	 * 
	 * @param index
	 * @param file
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 * @throws SecurityException
	 * @throws InterruptedException
	 * @throws PropertyVetoException 
	 * @throws SQLException 
	 */
	public void removePerson(Serialiser serialiser,String addressbookName)
			throws FileNotFoundException, IOException, ParseException, SecurityException, InterruptedException, SQLException, PropertyVetoException {
		
		serialiser.deletePerson(addressbookName);
	}

	
	
	/**
	 * Method to save the last changes made to the address book
	 * 
	 * @param file
	 * @param arrayList
	 * @throws java.io.IOException
	 * @throws java.lang.InterruptedException
	 * @throws java.lang.SecurityException
	 */
	public void doSave(File file, ArrayList personList)
			throws java.io.IOException, java.lang.InterruptedException, java.lang.SecurityException {
		mapper.writeValue((file), personList);
	
	}

}
