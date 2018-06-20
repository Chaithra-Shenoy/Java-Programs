/**
 * 
 */
package com.bridgelabz.service;

/**
 * purpose PatientService interface
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public interface PatientService {
	public void patientDetails();

	public boolean searchPatientByName();

	public int searchPatientById();

	public void searchPatientByMobile();
}
