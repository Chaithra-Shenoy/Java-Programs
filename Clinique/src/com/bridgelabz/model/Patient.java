/**
 * 
 */
package com.bridgelabz.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * purpose Patient POJO class
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Patient {
	private String patientName;
	private String patientId;
	private long mobileNumber;
	private static int age;
	static String FILENAME = "/home/administrator/Java/Clinique/src/com/bridgelabz/files/Patient.json";

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName
	 *            the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId
	 *            the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the mobileNumber
	 */
	public long getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 *            the mobileNumber to set
	 */
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public  JSONObject patientToJson() {
		JSONObject object = new JSONObject();
		object.put("patientName", getPatientName());
		object.put("patientId", getPatientId());
		object.put("mobileNumber", getMobileNumber());
		object.put("age", getAge());
		return object;
	}

	public JSONArray jsonToPatient() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(FILENAME));
		JSONArray jarray = (JSONArray) obj;
		for (int i = 0; i < jarray.size(); i++) {
			JSONObject object = (JSONObject) jarray.get(i);
		}
		return jarray;

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientId=" + patientId + ", mobileNumber=" + mobileNumber
				+ "]";
	}
	
}
