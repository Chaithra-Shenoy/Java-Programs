/**
 * 
 */
package com.bridgelabz.serviceImplementation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.service.DoctorService;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.utility.Utility;

/**
 * purpose Implementation class of DoctorService interface
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class DoctorImplementation implements DoctorService {
	static Doctor doctor = new Doctor();
	static String FILENAME = "/home/administrator/Java/Clinique/src/com/bridgelabz/files/Doctor.json";
	
	/* (non-Javadoc)
	 * @see com.bridgelabz.service.DoctorService#doctorDetails()
	 */
	public void doctorDetails() {
		JSONArray array;
		try {
			array = doctor.jsonToDoctor(FILENAME);

			for (int i = 0; i < array.size(); i++) {
				System.out.println(array.get(i));
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.DoctorService#searchById()
	 */
	@Override
	public int searchById(){
		System.out.println("Enter Doctor's Id to be searched ");
		String newId = Utility.getString();
		System.out.println(newId);
	  for(int i=0;i<ManagerServiceImpl.list.size();i++) {
		  if(newId.equals(ManagerServiceImpl.list.get(i).getDoctorId())){
			  System.out.println("doctor found"+i);
			  System.out.println(ManagerServiceImpl.list.get(i).toString());
			  return i;
		  }
	  }
	  return -1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.DoctorService#searchByName()
	 */
	@Override
	public boolean searchByName() {
		System.out.println("Enter Doctor's name to be searched ");
		String newname = Utility.getString();
		System.out.println(newname);
	  for(int i=0;i<ManagerServiceImpl.list.size();i++) {
		  if(newname.equals(ManagerServiceImpl.list.get(i).getDoctorName())){
			  System.out.println("doctor found"+i);
			  System.out.println(ManagerServiceImpl.list.get(i).toString());
			  return true;
		  }
	  }
	  System.out.println("Doctor not present");
	  return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.DoctorService#searchBySpecialization()
	 */
	@Override
	public void searchBySpecialization() {
		System.out.println("Enter Doctor's specialization to be searched ");
		String newSpecialization = Utility.getString();
		System.out.println(newSpecialization);
	  for(int i=0;i<ManagerServiceImpl.list.size();i++) {
		  if(newSpecialization.equals(ManagerServiceImpl.list.get(i).getSpecialization())){
			  System.out.println(ManagerServiceImpl.list.get(i).toString());
			  System.out.println("doctor found"+i);
		  }
	  }
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.DoctorService#searchByAvailability()
	 */
	@Override
	public void searchByAvailability() {
		System.out.println("Enter Doctor's availability to be searched ");
		String newAvailable = Utility.getString();
		System.out.println(newAvailable);
	  for(int i=0;i<ManagerServiceImpl.list.size();i++) {
		  if(newAvailable.equals(ManagerServiceImpl.list.get(i).getAvailability())){
			  System.out.println(ManagerServiceImpl.list.get(i).toString());
			  System.out.println("doctor found"+i);
		  }
	  }
	}

}
