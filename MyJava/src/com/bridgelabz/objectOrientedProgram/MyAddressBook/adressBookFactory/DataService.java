/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.MyAddressBook.adressBookFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.objectOrientedProgram.MyAddressBook.model.Person;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public interface DataService {
	public List<Person> read(List<Person> person) throws SQLException, JsonGenerationException, JsonMappingException, IOException;
	public void save(List<Person> person) throws SQLException, JsonGenerationException, JsonMappingException, IOException;
}
