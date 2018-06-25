/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.MyAddressBook.Utility;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

import com.bridgelabz.objectOrientedProgram.MyAddressBook.model.Person;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class Utility {
	static Scanner scanner=new Scanner(System.in);
	List<Person> list=new LinkedList<>();
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}
	public static int userInteger()
	{
		try
		{
			return scanner.nextInt();
		}
		catch(Exception e)
		{
			scanner.nextLine();
			System.out.println("invalid input,try again");
	      return userInteger();
		}
	}
	public static Double userDouble() {
		try
		{
			return scanner.nextDouble();
		}
		catch(Exception e)
		{
			scanner.nextLine();
			System.out.println("invalid input,try again");
	      return userDouble();
		}
	}
	public static String userString()
	{
			return scanner.nextLine();
	}
	public static String userNext()
	{
		return scanner.next();
	}
	public static char userCharacter()
	{
	char[] character=scanner.next().toCharArray();
	try
	{
		if(character.length>1)
			character=scanner.nextLine().toCharArray();
	}
	catch(Exception e)
	{
		System.out.println("inavlid input");
	}
	return character[0];
	}
	public static String dateTimeFormatter()
	{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		String date = dtf.format(now);
		return date;
	}

		public static String ConvertJavaToJson(Object object) {
			String jsonResult = "";
			try {
				jsonResult = mapper.writeValueAsString(object);
			} catch (JsonGenerationException e) {
				System.out.println("Jsongeneration Exception " + e.getMessage());
			} catch (JsonMappingException e) {
				System.out.println("JsonMappingException " + e.getMessage());
			} catch (IOException e) {
				System.out.println("IOException " + e.getMessage());
			}
			return jsonResult;
		}
		public static void toJson(File file,List list)throws Exception
		{
			file=new File("pretty.json");
			ObjectMapper mapper=new ObjectMapper();
			ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(file,list);
			System.out.println("done");
		}
	
		public static void saveToJson(File file, List<Person> list)
				throws JsonGenerationException, JsonMappingException, IOException {
			ObjectMapper mapper = new ObjectMapper();
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(file, list);
			System.out.println("done file");
		}
		public static <T>List JsonParser(File file,Class<T> parser) throws JsonParseException, JsonMappingException, IOException
		{
			List<T> list=new LinkedList<T>();
			CollectionType javaType=mapper.getTypeFactory().constructCollectionType(List.class, parser);
			list=mapper.readValue(file, javaType);
			return list;
		}
		public static void saveJson(File file,String data)throws Exception
		{
			ObjectMapper mapper=new ObjectMapper();
			ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(file,data);
			System.out.println("done");
		}
}
