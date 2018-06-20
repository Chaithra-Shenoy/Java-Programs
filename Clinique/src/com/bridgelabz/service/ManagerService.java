/**
 * 
 */
package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

/**
 * purpose ManagerService interface
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public interface ManagerService {
	public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void removeDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void addPatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void removePatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void updateDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException;

	public void updatePatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException;
}
