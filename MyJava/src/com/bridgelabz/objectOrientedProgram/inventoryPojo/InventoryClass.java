/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.inventoryPojo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * purpose class to create list of products
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class InventoryClass {
	ArrayList<Product> riceList = new ArrayList<Product>();
	ArrayList<Product> wheatList = new ArrayList<Product>();
	ArrayList<Product> pulsesList = new ArrayList<Product>();

	/**
	 * @return the riceList
	 */
	public ArrayList<Product> getRiceList() {
		return riceList;
	}

	/**
	 * @param riceList
	 *            the riceList to set
	 */
	public void setRiceList(ArrayList<Product> riceList) {
		this.riceList = riceList;
	}

	/**
	 * @return the wheatList
	 */
	public ArrayList<Product> getWheatList() {
		return wheatList;
	}

	/**
	 * @param wheatList
	 *            the wheatList to set
	 */
	public void setWheatList(ArrayList<Product> wheatList) {
		this.wheatList = wheatList;
	}

	/**
	 * @return the pulsesList
	 */
	public ArrayList<Product> getPulsesList() {
		return pulsesList;
	}

	/**
	 * @param pulsesList
	 *            the pulsesList to set
	 */
	public void setPulsesList(ArrayList<Product> pulsesList) {
		this.pulsesList = pulsesList;
	}

}
