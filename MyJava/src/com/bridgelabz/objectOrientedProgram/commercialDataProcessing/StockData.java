/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.commercialDataProcessing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.QueueProgram.QueueUsingLinkedlist;
import com.bridgelabz.QueueProgram.StackUsingLinkedlist;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class StockData {
	static Scanner scanner = new Scanner(System.in);
	List<CompanyShares> list = new ArrayList<CompanyShares>();
	static File file;
	static ObjectMapper map = new ObjectMapper();
	static File FILEPATH = new File(
			"/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/commercialDataProcessing/StockAccount.json");
	static QueueUsingLinkedlist<String> queue = new QueueUsingLinkedlist<String>();
	static StackUsingLinkedlist<String> stack = new StackUsingLinkedlist<String>();

	
	/**
	 * @param filename
	 * @throws IOException
	 */
	public StockData(String filename) throws IOException {
		file = new File(
				"/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/commercialDataProcessing/",
				filename);
		System.out.println("path-->" + file.getAbsolutePath());
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param companyShares
	 * @return JSONObject
	 */
	public static JSONObject toJsonObject(CompanyShares companyShares) {
		JSONObject obj = new JSONObject();

		obj.put("symbol", companyShares.getSymbol());
		obj.put("numberOfShares", companyShares.getNumberOfShares());
		obj.put("price", companyShares.getPrice());
		obj.put("Value", companyShares.getValue());
		obj.put("dateTime", companyShares.getDateTime());
		return obj;
	}

	
	public StockData() {
		super();
	}

	/**
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public JSONArray readFromFile(String filePath) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filePath));
		return jsonArray;
	}

	/**
	 * @param jsonArray
	 * @param filePath
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public void writeIntoFile(JSONArray jsonArray, String filePath)
			throws JsonGenerationException, JsonMappingException, IOException {

		map.writeValue(new File(filePath), jsonArray);
	}

	/**
	 * @return CompanyShares 
	 */
	public static CompanyShares makeCompanySharesObject() {

		CompanyShares companyShares = new CompanyShares();
		System.out.println("Enter the symbol of shares:");
		String symbol = scanner.next();
		companyShares.setSymbol(symbol);
		System.out.println("Enter the number of shares:");
		int numberOfShares = scanner.nextInt();
		companyShares.setNumberOfShares(numberOfShares);
		String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		companyShares.setDateTime(dateTime);
		System.out.println("Enter the price of share:");
		double price = scanner.nextDouble();
		companyShares.setPrice(price);
		return companyShares;
	}

	/**
	 * @param filePath
	 * @param symbol
	 * @param buyShares
	 * @param amount
	 * @throws IOException
	 */
	private void updateNewAccount(String filePath, String symbol, int buyShares, double amount) throws IOException {
		FileWriter filewriter = new FileWriter(filePath);
		BufferedWriter bw = new BufferedWriter(filewriter);
		String fileData = "shares of " + symbol + "\n" + "total shares present " + buyShares + "\n"
				+ "amount remaining " + amount + "\n" + "DateTime  " + LocalDateTime.now() + "\n" + "\n";
		bw.write(fileData);
		bw.flush();
		bw.close();
	}

	/**
	 * @param filePath
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void printEntries(String filePath) throws FileNotFoundException, IOException, ParseException {
		JSONArray array = readFromFile(filePath);
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

	/**
	 * @param filePath
	 * @param newAccountPath
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void sell(String filePath, String newAccountPath) throws FileNotFoundException, IOException, ParseException {
		printEntries(filePath);
		CompanyShares companyShares = makeCompanySharesObject();
		JSONObject jsonObject = toJsonObject(companyShares);
		stack.push((String) jsonObject.get("symbol"));
		JSONArray jsonArray = readFromFile(filePath);
		System.out.println(jsonArray);
		jsonArray.add("array-->" + jsonObject);
		writeIntoFile(jsonArray, filePath);
		writeIntoFile(jsonArray, newAccountPath);
		System.out.println("\n Your shares added to the shares account successfully..");
		System.out.println("\n Symbol is added to the stack..");
		stack.display();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(new Date());
		queue.insert(date);
		System.out.println("\n DateTime added to queue!!");
		queue.display();

	}

	/**
	 * @param amount
	 * @param symbol
	 * @param filePath
	 * @param newAccountFilePath
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void buy(int amount, String symbol, String filePath, String newAccountFilePath)
			throws FileNotFoundException, IOException, ParseException {
		JSONArray array = readFromFile(filePath);
		System.out.println(array);
		System.out.println("Please enter how many shares you want to buy?");
		int buyShares = scanner.nextInt();
		for (int i = 0; i < array.size(); i++) {
			JSONObject temporary = (JSONObject) array.get(i);
			System.out.println(temporary);
			if (symbol.equals(temporary.get("symbol"))) {

				long temp = (long) temporary.get("numberOfShares") - buyShares;
				temporary.put("numberOfShares", temp);
				array.remove(i);
				array.add(i, temporary);
				amount = (int) (amount - (buyShares * (double) temporary.get("price")));
				writeIntoFile(array, filePath);
				updateNewAccount(newAccountFilePath, symbol, buyShares, amount);
				stack.push((String) temporary.get("symbol"));
				System.out.println("\n Transaction done!! Symbol pushed to the Stack");
				stack.display();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				String date = dateFormat.format(new Date());
				queue.insert(date);
				System.out.println("\n DateTime added to queue!!");
				queue.display();
				break;

			}
		}

	}

	/**
	 * @param filePath
	 * @throws IOException
	 */
	public void createNewFile(String filePath) throws IOException {
		File file = new File(filePath);
		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}
		return;
	}
}
