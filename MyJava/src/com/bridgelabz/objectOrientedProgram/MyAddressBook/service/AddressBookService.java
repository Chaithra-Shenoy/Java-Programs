/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.MyAddressBook.service;

import java.io.*;
import java.sql.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public interface AddressBookService {
	public void addPerson() throws SQLException, JsonGenerationException, JsonMappingException, IOException;
	public void deletePerson() throws SQLException, JsonGenerationException, JsonMappingException, IOException;
	public void updatePerson() throws SQLException, JsonGenerationException, JsonMappingException, IOException;
	public void seePersonDetails() throws SQLException, JsonGenerationException, JsonMappingException, IOException;
	public void createMultipleAddressBook() throws JsonParseException, JsonMappingException, IOException, SQLException;
	public File searchMultipleAddressBook() throws JsonParseException, JsonMappingException, IOException, SQLException;
	public void displayMultipleAddressBook() throws JsonParseException, JsonMappingException, IOException, SQLException;
	public void getConnection();
}
