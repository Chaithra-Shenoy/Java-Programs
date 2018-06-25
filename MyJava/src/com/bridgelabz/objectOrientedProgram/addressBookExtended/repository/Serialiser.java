/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.addressBookExtended.repository;

import java.beans.PropertyVetoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.objectOrientedProgram.addressBookExtended.model.Person;


/**
 * @author bridgelabz
 *
 */
public interface Serialiser {
	public Connection getConnection() throws SQLException, IOException, PropertyVetoException;;
	public void createBook(String addressBookName) throws  IOException, SQLException, PropertyVetoException;
	public void addPerson(Person person,String addressbookName) throws FileNotFoundException, IOException,  SQLException, PropertyVetoException, ParseException;
	public void deleteAddressBook() throws SQLException, IOException, PropertyVetoException;
	public void deletePerson(String addressBookName) throws SQLException, IOException, PropertyVetoException, JsonGenerationException, JsonMappingException, ParseException;
	public void viewAddressbook(String addressBookNameOpen) throws  IOException, SQLException, PropertyVetoException, ParseException;
	public void updatePerson(String addressBookName,String[] inputs) throws IOException, SQLException, PropertyVetoException, ParseException;
}
