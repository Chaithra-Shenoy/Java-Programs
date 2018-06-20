/**
 * 
 */
package com.bridgelabz.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

/**
 * purpose DoctorService interface
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public interface DoctorService {
	public void doctorDetails();

	public int searchById() throws FileNotFoundException, IOException, ParseException;

	public boolean searchByName();

	public void searchBySpecialization();

	public void searchByAvailability();
}
