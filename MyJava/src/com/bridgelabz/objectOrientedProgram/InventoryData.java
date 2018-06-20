/**
 * 
 */
package com.bridgelabz.objectOrientedProgram;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class InventoryData {
	static int sumRice = 0;
	static int totalRice = 0;
	static int sumWheat = 0;
	static int totalWheat = 0;
	static int sumPulses = 0;
	static int totalPulses = 0;

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader(
					"/home/administrator/java/Task1/src/com/bridgelabz/objectOrientedProgram/Inventorydata.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray rice = (JSONArray) jsonObject.get("Rice");
			for (int i = 0; i < rice.size(); i++) {
				JSONObject objrice = (JSONObject) (rice.get(i));
				sumRice += (Integer.parseInt(objrice.get("Weight in KG").toString()))
						* (Integer.parseInt(objrice.get("Price per KG").toString()));
				totalRice += (Integer.parseInt(objrice.get("Weight in KG").toString()));
			}
			System.out.println(rice);
			System.out.println(sumRice);
			System.out.println(totalRice);
			JSONArray wheat = (JSONArray) jsonObject.get("Wheat");
			for (int i = 0; i < wheat.size(); i++) {
				JSONObject objwheat = (JSONObject) (wheat.get(i));
				sumWheat += (Integer.parseInt(objwheat.get("Weight in KG").toString()))
						* (Integer.parseInt(objwheat.get("Price per KG").toString()));
				totalWheat += (Integer.parseInt(objwheat.get("Weight in KG").toString()));
			}
			System.out.println(wheat);
			System.out.println(sumWheat);
			System.out.println(totalWheat);
			JSONArray pulses = (JSONArray) jsonObject.get("pulses");
			for (int i = 0; i < pulses.size(); i++) {
				JSONObject objpulse = (JSONObject) (pulses.get(i));
				sumPulses += (Integer.parseInt(objpulse.get("Weight in KG").toString()))
						* (Integer.parseInt(objpulse.get("Price per KG").toString()));
				totalPulses += (Integer.parseInt(objpulse.get("Weight in KG").toString()));
			}
			System.out.println(pulses);
			System.out.println(sumPulses);
			System.out.println(totalPulses);

		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

}
