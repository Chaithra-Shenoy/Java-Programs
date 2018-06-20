
package com.bridgelabz.objectOrientedProgram.inventoryPojo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;

/**
 * purpose Create a JSON file having Inventory Details for Rice, Pulses and
 * Wheats with properties name, weight, price per kg.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class InventoryManager {
	static Scanner scan = new Scanner(System.in);
	static int value = 0;
	static int sumRice = 0;
	static int totalRice = 0;
	static int sumWheat = 0;
	static int totalWheat = 0;
	static int sumPulses = 0;
	static int totalPulses = 0;

	public static void main(String[] args) throws IOException, ParseException {
		InventoryClass invent = new InventoryClass();
		ObjectMapper map = new ObjectMapper();
		System.out.println("Enter how many types of rice");
		value = Utility.scanner(value);
		Product product = new Product();
		for (int i = 0; i < value; i++) {
			product = productMethod();
			invent.getRiceList().add(product);
		}

		System.out.println("Enter how many types of wheat");
		value = Utility.scanner(value);
		for (int i = 0; i < value; i++) {
			product = productMethod();
			invent.getWheatList().add(product);
		}

		System.out.println("Enter how many types of pulses");
		value = Utility.scanner(value);
		for (int i = 0; i < value; i++) {
			product = productMethod();
			invent.getPulsesList().add(product);
		}
		map.writeValue(new File(
				"/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/inventoryPojo/inventory.json"),
				invent);
		// reading
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(
				"/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/inventoryPojo/inventory.json"));
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray rice1 = (JSONArray) jsonObject.get("riceList");
		for (int i = 0; i < rice1.size(); i++) {
			JSONObject objrice = (JSONObject) (rice1.get(i));
			sumRice += ((long) objrice.get("weight")) * (long) (objrice.get("price"));
			totalRice += (long) objrice.get("weight");
		}
		System.out.println(rice1);
		System.out.println(sumRice);
		System.out.println(totalRice);
		JSONArray wheat1 = (JSONArray) jsonObject.get("wheatList");
		for (int i = 0; i < wheat1.size(); i++) {
			JSONObject objwheat = (JSONObject) (wheat1.get(i));
			sumWheat += ((long) objwheat.get("weight")) * (long) (objwheat.get("price"));
			totalWheat += (long) objwheat.get("weight");
		}
		System.out.println(wheat1);
		System.out.println(sumWheat);
		System.out.println(totalWheat);
		JSONArray pulses1 = (JSONArray) jsonObject.get("pulsesList");
		for (int i = 0; i < pulses1.size(); i++) {
			JSONObject objpulses = (JSONObject) (pulses1.get(i));
			sumPulses += ((long) objpulses.get("weight")) * (long) (objpulses.get("price"));
			totalPulses += (long) objpulses.get("weight");
		}
		System.out.println(pulses1);
		System.out.println(sumPulses);
		System.out.println(totalPulses);
	}

	/**
	 * @return Product
	 */
	public static Product productMethod() {
		Product product = new Product();
		System.out.println("Enter the type of product");
		String type = scan.next();
		product.setType(type);
		System.out.println("Enter the weight of product");
		int weight = scan.nextInt();
		product.setWeight(weight);
		System.out.println("Enter the price of product");
		int price = scan.nextInt();
		product.setPrice(price);
		return product;
	}

}
