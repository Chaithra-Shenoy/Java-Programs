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
 * purpose Appointment POJO class
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Appointment {
	private String doctorName;
	private String doctorId;
	private String patientName;
	private String patientId;
	private String timeStamp;
	static String FILENAME = "/home/administrator/Java/Clinique/src/com/bridgelabz/files/Appointment.json";

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
	 * @return the timeStamp
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp
	 *            the timeStamp to set
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public JSONObject appointmentToJson() {
		JSONObject object = new JSONObject();
		object.put("doctorName", getDoctorName());
		object.put("doctorId",getDoctorId());
		object.put("patientName", getPatientName());
		object.put("patientId", getPatientId());
		object.put("timeStamp", getTimeStamp());
		return object;
	}

	public JSONArray jsonToAppointment() throws FileNotFoundException, IOException, ParseException {
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
		return "Appointment [doctorName=" + doctorName + ", doctorId=" + doctorId + ", patientName=" + patientName
				+ ", patientId=" + patientId + ", timeStamp=" + timeStamp + "]";
	}
	
}
