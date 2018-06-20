/**
 * 
 */
package com.bridgelabz.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * purpose Doctor POJO class
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Doctor {
	private String doctorName;
	private String doctorId;
	private String specialization;
	private String Availability;
	private int patientCount;
	static String FILENAME = "/home/administrator/Java/Clinique/src/com/bridgelabz/files/Doctor.json";

	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * @param doctorName
	 *            the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	/**
	 * @return the doctorId
	 */
	public String getDoctorId() {
		return doctorId;
	}

	/**
	 * @param doctorId
	 *            the doctorId to set
	 */
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * @param specialization
	 *            the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	/**
	 * @return the availability
	 */
	public String getAvailability() {
		return Availability;
	}

	/**
	 * @param availability
	 *            the availability to set
	 */
	public void setAvailability(String availability) {
		Availability = availability;
	}

	/**
	 * @return the patientCount
	 */
	public int getPatientCount() {
		return patientCount;
	}

	/**
	 * @param patientCount
	 *            the patientCount to set
	 */
	public void setPatientCount(int patientCount) {
		this.patientCount = patientCount;
	}

	public JSONObject doctorToJson() {
		JSONObject object = new JSONObject();
		object.put("doctorName", getDoctorName());
		object.put("doctorId", getDoctorId());
		object.put("specialization", getSpecialization());
		object.put("Availability", getAvailability());
		object.put("patientCount", getPatientCount());
		return object;
	}

	public JSONArray jsonToDoctor(String FILENAME) throws FileNotFoundException, IOException, ParseException {
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
		return "Doctor [doctorName=" + doctorName + ", doctorId=" + doctorId + ", specialization=" + specialization
				+ ", Availability=" + Availability + ", patientCount=" + patientCount + "]";
	}

	

}
