package com.bridgelabz.objectOrientedProgram.addressBookApp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.objectOrientedProgram.ReplaceMessage;
import com.bridgelabz.objectOrientedProgram.inventoryPojo.Product;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class AddressBook {
	static Scanner scanner = new Scanner(System.in);
	List<Person> list = new ArrayList<>();
	static Person person;
	static File file;
	AddressBookManager manage = new AddressBookManager();
	static ObjectMapper map = new ObjectMapper();
	static File FILEPATH = new File(
			"/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/addressBookApp/AddressBook.json");

	/**
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @throws ParseException
	 * 
	 */
	public void add() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("Adding details....");
		System.out.println("Enter how many details you need");
		int value = scanner.nextInt();
		for (int i = 0; i < value; i++) {
			System.out.println("Enter your first name");
			String name = scanner.next();
			System.out.println("Enter your last name");
			String nameLast = scanner.next();
			System.out.println("Enter your address");
			String add = scanner.next();
			System.out.println("Enter your city");
			String city = scanner.next();
			System.out.println("Enter your state");
			String state = scanner.next();
			System.out.println("Enter your zipcode");
			String zip = scanner.next();
			System.out.println("Enter your phone number");
			String phoneNumber = scanner.next();
			System.out.println();
			person = new Person(name, nameLast, add, city, state, zip, phoneNumber);
			list.add(person);
		}
		JSONObject jsonOb = person.toJsonObject();
		saveFile();
		map.writeValue((FILEPATH), list);
		System.out.println("person added successfully");
		manage.option();
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @throws ParseException
	 * 
	 */
	public void edit() throws JsonGenerationException, JsonMappingException, IOException, ParseException {

		Person p = search();
		int index = list.indexOf(p);
		System.out.println(index);
		System.out.println("Enter the option to be edited");
		System.out.println("1: To change Address");
		System.out.println("2: To change City");
		System.out.println("3: To change State");
		System.out.println("4: To change zipCode");
		System.out.println("5: To change Phonenumber");
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			System.out.println("Enter new Address");
			String newAddress = scanner.next();
			list.get(index).setAddress(newAddress);
			map.writeValue((FILEPATH), list);
			saveFile();
			break;
		case 2:
			System.out.println("Enter new city");
			String newCity = scanner.next();
			list.get(index).setCity(newCity);
			map.writeValue((FILEPATH), list);
			saveFile();
			break;
		case 3:
			System.out.println("Enter new state");
			String newState = scanner.next();
			list.get(index).setState(newState);
			map.writeValue((FILEPATH), list);
			saveFile();
			break;
		case 4:
			System.out.println("Enter new zipcode");
			String newZipcode = scanner.next();
			list.get(index).setZipCode(newZipcode);
			map.writeValue((FILEPATH), list);
			saveFile();
			break;
		case 5:
			System.out.println("Enter new phone number");
			String newnumber = scanner.next();
			list.get(index).setPhoneNumber(newnumber);
			map.writeValue((FILEPATH), list);
			saveFile();
			break;
		}

		manage.option();
	}

	/**
	 * @throws ParseException
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * 
	 */
	public void delete() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		Person p = search();
		int index = list.indexOf(p);
		System.out.println(index);
		try {
			list.remove(index);
		} catch (ArrayIndexOutOfBoundsException |NullPointerException e) {
		   e.getMessage();
			
		}
		map.writeValue((FILEPATH), list);
		saveFile();
		manage.option();
	}

	/**
	 * @throws IOExceptionsetAddress(newState);
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @throws ParseException
	 * 
	 */
	public void sortByLastName() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		JSONArray array = person.toJavaObject();
		System.out.println(array);
		ArrayList<JSONObject> arrayList = new ArrayList<JSONObject>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject temp = (JSONObject) array.get(i);
			arrayList.add(temp);
		}

		for (int i = 0; i < arrayList.size() - 1; i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				JSONObject obj1 = (JSONObject) arrayList.get(i);
				String key1 = (String) obj1.get("lastName");
				JSONObject obj2 = (JSONObject) arrayList.get(j);
				String key2 = (String) obj2.get("lastName");
				if (key1.compareTo(key2) > 0) {
					JSONObject temp = obj1;
					arrayList.set(i, obj2);
					arrayList.set(j, obj1);
				}
			}
		}
		map.writeValue((FILEPATH), arrayList);
		saveFile();
		manage.option();
	}

	/**
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @throws ParseException
	 * 
	 */
	public void sortByZipCode() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		JSONArray array = person.toJavaObject();
		System.out.println(array);
		ArrayList<JSONObject> arrayList = new ArrayList<JSONObject>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject temp = (JSONObject) array.get(i);
			arrayList.add(temp);
		}

		for (int i = 0; i < arrayList.size() - 1; i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				JSONObject obj1 = (JSONObject) arrayList.get(i);
				String key1 = (String) obj1.get("zipCode");
				JSONObject obj2 = (JSONObject) arrayList.get(j);
				String key2 = (String) obj2.get("zipCode");
				if (key1.compareTo(key2) > 0) {
					JSONObject temp = obj1;
					arrayList.set(i, obj2);
					arrayList.set(j, obj1);
				}
			}
		}
		map.writeValue((FILEPATH), arrayList);
		saveFile();
		manage.option();
	}

	/**
	 * @return Person
	 */
	public Person search() {
		System.out.println("enter the first name to be searched in address book");
		String name = scanner.next();
		for (int i = 0; i != list.size(); i++) {
			if (list.get(i).getFirstName().equals(name)) {
				System.out.println("found");
				return list.get(i);
			}
		}
		System.out.println("not found");
		return null;
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void printEntries() throws FileNotFoundException, IOException, ParseException {

		JSONArray array = person.toJavaObject();
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		manage.option();
	}

	/**
	 * @throws ParseException
	 */
	public void createNewFile() throws ParseException {
		System.out.println("enter the filename");
		String filename = scanner.next();
		file = new File("/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/addressBookApp/",
				filename);
		System.out.println("path-->" + file.getAbsolutePath());
		try {
			file.createNewFile();
			manage.option();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @throws IOException
	 * @throws ParseException
	 */
	public void saveFile() throws IOException, ParseException {
		JSONArray array = person.toJavaObject();
		map.writeValue(file, array);
	}

	/**
	 * to quit
	 */
	void quit() {
		System.exit(0);
	}
}