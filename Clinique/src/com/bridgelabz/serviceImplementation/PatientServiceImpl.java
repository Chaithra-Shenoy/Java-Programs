/**
 * 
 */
package com.bridgelabz.serviceImplementation;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import com.bridgelabz.model.Patient;
import com.bridgelabz.service.PatientService;
import com.bridgelabz.utility.Utility;

/**
 * purpose implementation class of PatientService interface
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class PatientServiceImpl implements PatientService {
	static Patient patient = new Patient();
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.PatientService#patientDetails()
	 */
	@Override
	public void patientDetails() {
		JSONArray array;
		try {
			array = patient.jsonToPatient();

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
	 * @see com.bridgelabz.service.PatientService#searchPatientByName()
	 */
	@Override
	public boolean searchPatientByName() {
      System.out.println("Enter patient name to be searched in list");
      String newName=Utility.getString();
      for(int i=0;i<ManagerServiceImpl.patientList.size();i++) {
    	  if(newName.equals(ManagerServiceImpl.patientList.get(i).getPatientName())) {
    		  System.out.println("Patient found in loc "+i);
    		  System.out.println(ManagerServiceImpl.patientList.get(i).toString());
    		  return true;
    	  }
      }
      System.out.println("Patient not found ");
      return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.PatientService#searchPatientById()
	 */
	@Override
	public int searchPatientById() {
		
		System.out.println("Enter Patients's Id to be searched ");
		String newId = Utility.getString();
		System.out.println(newId);
	  for(int i=0;i<ManagerServiceImpl.patientList.size();i++) {
		  if(newId.equals(ManagerServiceImpl.patientList.get(i).getPatientId())){
			  System.out.println("Patient found"+i);
			  System.out.println(ManagerServiceImpl.patientList.get(i).toString());
			  return i;
		  }
	  }
	  return -1;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.service.PatientService#searchPatientByMobile()
	 */
	@Override
	public void searchPatientByMobile() {
      System.out.println("Enter patient mobile Number");
      long newNumber=Utility.getLong();
      for(int i=0;i<ManagerServiceImpl.patientList.size();i++) {
    	  if(newNumber==ManagerServiceImpl.patientList.get(i).getMobileNumber()) {
    		  System.out.println("Patient found at"+i);
    		  System.out.println(ManagerServiceImpl.patientList.get(i).toString());
    		  return;
    	  }
      }
      System.out.println("patient not found");
      return;
	}

}
