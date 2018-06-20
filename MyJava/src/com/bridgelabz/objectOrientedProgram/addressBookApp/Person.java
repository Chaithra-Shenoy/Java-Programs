package com.bridgelabz.objectOrientedProgram.addressBookApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.objectOrientedProgram.inventoryPojo.Product;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	
	Scanner scanner = new Scanner(System.in);

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zipCode
	 * @param phoneNumber
	 */
	public Person(String firstName, String lastName, String address, String city, String state, String zipCode,
			String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
//
//	/**
//	 * @param firstName
//	 *            the firstName to set
//	 */
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

//	/**
//	 * @param lastName
//	 *            the lastName to set
//	 */
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @throws ParseException
	 */
	public JSONObject toJsonObject()  {
		JSONObject obj = new JSONObject();

		obj.put("FirstName", firstName);
		obj.put("LastName", lastName);
		obj.put("address", address);
		obj.put("city", city);
		obj.put("state", state);
		obj.put("zipCode", zipCode);
		obj.put("PhoneNumber", phoneNumber);

		return obj;
	}
	public JSONArray toJavaObject() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(new FileReader("/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/addressBookApp/AddressBook.json"));
		JSONArray jarray=(JSONArray)obj;
		for(int i=0;i<jarray.size();i++) {
			JSONObject object=(JSONObject)jarray.get(i);
		}
				return jarray;
		
	}

}