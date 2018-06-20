/**
 * 
 */
package com.bridgelabz.serviceImplementation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgelabz.controller.CliniqueManager;
import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.utility.Utility;

/**
 * purpose Implementation class of ManagerService interface
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class ManagerServiceImpl implements ManagerService {
	private static File FILEPATH = new File(
			"/home/administrator/Java/Clinique/src/com/bridgelabz/files/Doctor.json");
	Doctor doctor;
	Patient patient;
	CliniqueManager clinic = new CliniqueManager();
	DoctorImplementation doctorImpl = new DoctorImplementation();
	PatientServiceImpl patientImpl = new PatientServiceImpl();
	static ObjectMapper map = new ObjectMapper();
	static ArrayList<Doctor> list = new ArrayList<Doctor>();
	static ArrayList<Patient> patientList = new ArrayList<Patient>();
	static ArrayList<Appointment> appointList = new ArrayList<Appointment>();
	private static File appointPath = new File(
			"/home/administrator/Java/Clinique/src/com/bridgelabz/files/Appointment.json");

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.ManagerService#addDoctor()
	 */
	@Override
	public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("Adding doctors...");
		System.out.println("Enter total doctors in clinique");
		int value = Utility.getInt();
		for (int i = 0; i < value; i++) {
			doctor = new Doctor();
			System.out.println("Enter Doctor Name: ");
			String doctorName = Utility.getString();
			doctor.setDoctorName(doctorName);
			System.out.println("Enter Doctor Id: ");
			String doctorId = Utility.getString();
			doctor.setDoctorId(doctorId);
			System.out.println("Enter Doctor specialization: ");
			String specialization = Utility.getString();
			doctor.setSpecialization(specialization);
			System.out.println("Enter Doctor Availability");
			String availability = Utility.getString();
			doctor.setAvailability(availability);
			System.out.println("Enter patient count");
			int count = Utility.getInt();
			doctor.setPatientCount(count);
			System.out.println();
			list.add(doctor);
		}
		System.out.println(list.size());
		doctor.doctorToJson();
		map.writeValue((FILEPATH), list);
		clinic.option();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.ManagerService#removeDoctor()
	 */
	@Override
	public void removeDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		int index = doctorImpl.searchById();
		list.remove(index);
		map.writeValue((FILEPATH), list);
		clinic.option();
	}

	/**
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void searchDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("Enter the option on which basis u want to search doctor");
		System.out.println(
				" 1] Search by Name \n 2] Search by id \n 3] Search by Specialization \n 4] Search by availability");
		int option = Utility.getInt();
		switch (option) {
		case 1:
			doctorImpl.searchByName();
			break;
		case 2:
			doctorImpl.searchById();
			break;
		case 3:
			doctorImpl.searchBySpecialization();
			break;
		case 4:
			doctorImpl.searchByAvailability();
			break;
		}
		clinic.option();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.ManagerService#addPatient()
	 */
	@Override
	public void addPatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("Adding Patients...");
		System.out.println("Enter total Patients in clinique");
		int value = Utility.getInt();
		for (int i = 0; i < value; i++) {
			patient = new Patient();
			System.out.println("Enter Patient Name");
			String name = Utility.getString();
			patient.setPatientName(name);
			System.out.println("Enter Patient Id");
			String id = Utility.getString();
			patient.setPatientId(id);
			System.out.println("Enter Patient Mobile number");
			long mobileNumber = Utility.getLong();
			patient.setMobileNumber(mobileNumber);
			System.out.println("Enter Patient Age");
			int age = Utility.getInt();
			patient.setAge(age);
			patientList.add(patient);
		}
		patient.patientToJson();
		map.writeValue(new File("/home/administrator/Java/Clinique/src/com/bridgelabz/files/Patient.json"),
				patientList);
		clinic.option();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.ManagerService#removePatient()
	 */
	@Override
	public void removePatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		int index1 = patientImpl.searchPatientById();
		patientList.remove(index1);
		map.writeValue(new File("/home/administrator/Java/Clinique/src/com/bridgelabz/files/Patient.json"),
				patientList);
		clinic.option();
	}

	/**
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void searchPatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("Enter the option on which basis u want to search doctor");
		System.out.println(" 1] Search by Name \n 2] Search by id \n 3] Search by Mobile number");
		int option = Utility.getInt();
		switch (option) {
		case 1:
			patientImpl.searchPatientByName();
			break;
		case 2:
			patientImpl.searchPatientById();
			break;
		case 3:
			patientImpl.searchPatientByMobile();
			break;
		}
		clinic.option();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.ManagerService#updateDoctor()
	 */
	@Override
	public void updateDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		int index = doctorImpl.searchById();
		System.out.println("Enter the option to be edited");
		System.out.println(
				"1: to Edit Doctor name \n 2: to edit Doctor Id \n 3: to edit Specialization \n 4: to edit availability");
		int choice = Utility.getInt();
		switch (choice) {
		case 1:
			System.out.println("Edit Name -");
			String newName = Utility.getString();
			list.get(index).setDoctorName(newName);
			map.writeValue((FILEPATH), list);
			break;
		case 2:
			System.out.println("Edit Id -");
			String newId = Utility.getString();
			list.get(index).setDoctorId(newId);
			map.writeValue((FILEPATH), list);
			break;
		case 3:
			System.out.println("Edit Specialization -");
			String newSpecialization = Utility.getString();
			list.get(index).setSpecialization(newSpecialization);
			map.writeValue((FILEPATH), list);
			break;
		case 4:
			System.out.println("Edit Availability -");
			String newAvailability = Utility.getString();
			list.get(index).setAvailability(newAvailability);
			map.writeValue((FILEPATH), list);
			break;
		}
		clinic.option();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.ManagerService#updatePaqtient()
	 */
	@Override
	public void updatePatient() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		int index = patientImpl.searchPatientById();
		System.out.println("Enter the option to be edited");
		System.out
				.println("1: to Edit Patient name \n 2: to edit Patient Id \n 3: to Patient Number \n 4: to edit age");
		int choice = Utility.getInt();
		switch (choice) {
		case 1:
			System.out.println("Edit Name -");
			String newName = Utility.getString();
			patient.setPatientName(newName);
			map.writeValue(
					new File("/home/administrator/Java/Clinique/src/com/bridgelabz/files/Patient.json"),
					patientList);
			break;
		case 2:
			System.out.println("Edit Id -");
			String newId = Utility.getString();
			patient.setPatientId(newId);
			map.writeValue(
					new File("/home/administrator/Java/Clinique/src/com/bridgelabz/files/Patient.json"),
					patientList);
			break;
		case 3:
			System.out.println("Edit Number-");
			long newNumber = Utility.getLong();
			patient.setMobileNumber(newNumber);
			map.writeValue(
					new File("/home/administrator/Java/Clinique/src/com/bridgelabz/files/Patient.json"),
					patientList);
			break;
		case 4:
			System.out.println("Edit Age-");
			int newAge = Utility.getInt();
			patient.setAge(newAge);
			map.writeValue(
					new File("/home/administrator/Java/Clinique/src/com/bridgelabz/files/Patient.json"),
					patientList);
			break;
		}
		clinic.option();
	}

	/**
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void takeAppointment() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		Appointment appoint = new Appointment();
		System.out.println("Enter Patients name ");

		if (patientImpl.searchPatientByName()) {
			appoint.setPatientName(patient.getPatientName());
			appoint.setPatientId(patient.getPatientId());

			// System.out.println("Enter doctor Name to take appointment with:");
			if (doctorImpl.searchByName()) {
				appoint.setDoctorName(doctor.getDoctorName());
				appoint.setDoctorId(doctor.getDoctorId());

				if (doctor.getPatientCount() < 5) {
					System.out.println("Appointment fixed on ");
					String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
					appoint.setTimeStamp(dateTime);
					System.out.println(dateTime);
					appointList.add(appoint);
					map.writeValue(appointPath, appointList);
				}
			}
		} else {
			System.out.println("Appointment is full");
			System.out.println("Take appointment next day");
		}
		clinic.option();
	}

	/**
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void famousDoctor() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		Doctor popular = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (popular.getPatientCount() <= list.get(i).getPatientCount()) {
				popular = list.get(i);
			}
		}
		System.out.println("Famous doctor");
		System.out.println(doctor.getDoctorName());
		System.out.println("famous specialization");
		System.out.println(doctor.getSpecialization());
		clinic.option();
	}

}
