/**
 * 
 */
package com.bridgelabz.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.serviceImplementation.DoctorImplementation;
import com.bridgelabz.serviceImplementation.ManagerServiceImpl;
import com.bridgelabz.serviceImplementation.PatientServiceImpl;
import com.bridgelabz.utility.Utility;

/**
 * purpose This program is used to manage a list of Doctors associated with
 * the Clinique. This also manages the list of patients who use the clinique.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class CliniqueManager {
	static ManagerServiceImpl manager = new ManagerServiceImpl();

	public static void main(String[] args)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("-------WELCOME-------");
		manager.addDoctor();
		option();
	}

	/**
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 */
	public static void option() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("Enter the following option for operation");
		System.out.println(
				" 1] Add Doctor \n 2] Add patient \n 3] Remove Doctor \n 4] Remove Patient \n 5] Search doctor \n"
						+ " 6] Search Patient \n 7] Take Appointment \n 8] Print Report \n 9] Famous Doctor and Specialization"
						+ "\n 10] Quit ");
		int choice = Utility.getInt();
		performoperation(choice);
	}

	/**
	 * @param choice
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @throws ParseException
	 */
	static void performoperation(int choice)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		switch (choice) {
		case 1:
			System.out.println("Add doctors to list");
			manager.addDoctor();
			break;
		case 2:
			System.out.println("Add patient to list");
			manager.addPatient();
			break;
		case 3:
			System.out.println("Removing Doctor from list");
			manager.removeDoctor();
			break;
		case 4:
			System.out.println("Removing patient from list");
			manager.removePatient();
			break;
		case 5:
			System.out.println("searching doctor");
			manager.searchDoctor();
			break;
		case 6:
			System.out.println("searching patient");
			manager.searchPatient();
			break;
		case 7:
			System.out.println("taking appointment");
			manager.takeAppointment();
			break;
		case 8:
			System.out.println("Doctor Report");
			DoctorImplementation doc = new DoctorImplementation();
			doc.doctorDetails();
			System.out.println("patient Report");
			PatientServiceImpl pat = new PatientServiceImpl();
			pat.patientDetails();
			break;
		case 9:
			manager.famousDoctor();
			break;
		case 10:
			System.exit(0);
			break;

		}
	}
}
