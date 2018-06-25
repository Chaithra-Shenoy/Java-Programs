/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.MyAddressBook.adressbookSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.SortingFocusTraversalPolicy;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.type.TypeReference;


import com.bridgelabz.objectOrientedProgram.MyAddressBook.Utility.Utility;
import com.bridgelabz.objectOrientedProgram.MyAddressBook.adressBookFactory.DataService;
import com.bridgelabz.objectOrientedProgram.MyAddressBook.model.Person;
import com.bridgelabz.objectOrientedProgram.MyAddressBook.service.AddressBookService;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class JSonAddressBookManager   implements AddressBookService{
	List<Person> personList=new LinkedList<>();
	List<String> addressBookList=new LinkedList<>();
	File file = new File("/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/MyAddressBook/File/AddressBook.json");
	String bookList = "/home/administrator/Desktop/AddressBook.json";
	String filepath = "/home/administrator/Desktop/";
	ObjectMapper mapper=new ObjectMapper();
	DataService data;
	String id,firstName,lastName,address,city,zip,phone;
	public JSonAddressBookManager()
	{
		try
		{
			personList=JsonParser(file,Person.class);
		}
		catch(Exception e)
		{
			personList=new LinkedList<>();
		}
	}
		@Override
		public void addPerson() throws SQLException, JsonGenerationException, JsonMappingException, IOException {
			Person person=new Person();
			System.out.println("enter Id of person");
			 id = person.setId(Utility.userNext());
			System.out.println("enter firstName of person");
			 firstName = person.setFirstName(Utility.userNext());
			System.out.println("enter lastName of person");
			 lastName = person.setLastName(Utility.userNext());
			System.out.println("enter address of person");
			 address = person.setAddress(Utility.userNext());
			System.out.println("enter city of person");
			 city = person.setCity(Utility.userNext());
			System.out.println("enter Zip");
			 zip = person.setZip(Utility.userNext());
			System.out.println("enter phone number of person");
			 phone = person.setPhone(Utility.userNext());
			personList.add(person);
			save();
		}

		@Override
		public void deletePerson() throws SQLException, JsonGenerationException, JsonMappingException, IOException {
			// TODO Auto-generated method stub
			personList=JsonParser(file,Person.class);
			System.out.println("enter the id of the person who is to be deleted");
			String id = Utility.userNext();
		      for(int index=0;index<personList.size();index++)
		      {
		    		 if(personList.get(index).getId().equals(id))
		    		 {
				System.out.println("deleting person");
				personList.remove(index);
				data.save(personList);
				return;
		    		 }
		      }
		}
		@Override
		public void updatePerson() throws SQLException, JsonGenerationException, JsonMappingException, IOException {
			// TODO Auto-generated method stub
			personList=JsonParser(file,Person.class);
			Person person = new Person();
			System.out.println("enter the id of person whose details are to be edited: ");
			String id = Utility.userNext();
		for(int index=0;index<personList.size();index++)
		{
			if(personList.get(index).getId().equals(id))
			{
		System.out.println("enter the details to edit,id,address,city,zip,phone");
				String firstName = personList.get(index).getFirstName();
				person.setFirstName(firstName);
				String lastName = personList.get(index).getLastName();
				person.setLastName(lastName);
				person.setId(Utility.userString());
				person.setAddress(Utility.userString());
				person.setCity(Utility.userString());
				person.setZip(Utility.userString());
				person.setPhone(Utility.userString());
				personList.add(person);
				data.save(personList);
				System.out.println("edited details");
				personList.remove(index);
				data.save(personList);
				System.out.println("updated details");
				return;
				}
			}
		}
		
		@Override
		public void seePersonDetails() throws SQLException, JsonGenerationException, JsonMappingException, IOException {
			// TODO Auto-generated method stub
			personList=JsonParser(file,Person.class);
			System.out.println("The details of person are:");
			for (int index = 0; index < personList.size(); index++) {
				System.out.println("firstName of person" + index + "  = " + personList.get(index).getFirstName());
				System.out.println("id of person" + index + " = " + personList.get(index).getId());
				System.out.println("lastName of person" + index + "= " + personList.get(index).getLastName());
				System.out.println("address of person" + index + "= " + personList.get(index).getAddress());
				System.out.println("city of person" + index + "= " + personList.get(index).getCity());
				System.out.println("zip of person" + index + "= " + personList.get(index).getZip());
				System.out.println("phone of person" + index + "= " + personList.get(index).getPhone());
			}
		}

		@Override
		public void createMultipleAddressBook() throws JsonParseException, JsonMappingException, IOException, SQLException {
			// TODO Auto-generated method stub
			System.out.println("enter the name of address book you want to create");
			String addressBookNew=Utility.userNext();
			addressBookList = mapper.readValue(new File(bookList), new TypeReference<List<String>>() {
			});
			File file = new File(filepath + addressBookNew + ".json");
			System.out.println("filename created");
			addDetailsToJsonFile(file);
			addressBookList.add(file.toString());
			mapper.writeValue(file, personList);
			mapper.writeValue(new File(bookList), addressBookList);
			System.out.println("AddressBook created");	
		}

		@Override
		public File searchMultipleAddressBook() throws JsonParseException, JsonMappingException, IOException {
			System.out.println("enter the name of address book you want to search");
			String addressBookName=Utility.userNext();
				addressBookList = mapper.readValue(new File(bookList), new TypeReference<List<String>>() {
				});
				if (addressBookList.contains(filepath + addressBookName + ".json")) {
					int index = addressBookList.indexOf(filepath + addressBookName + ".json");
					System.out.println(" address book found");
					return new File(addressBookList.get(index));
				}
				System.out.println("addressBook not found");
				return null;
			}
		
		@Override
		public void displayMultipleAddressBook() throws JsonParseException, JsonMappingException, IOException, SQLException {
			System.out.println("enter the addressBook name to open addressbook:");
			String addressBookOpen = Utility.userNext();
			File fileOpen = searchMultipleAddressBook();
			if (fileOpen != null) {
				System.out.println("The details of the addressbook list are:");
				personList =data.read(personList);
				for (int index = 0; index < personList.size(); index--) {
					System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString((personList.get(index))));
				}
			}
		}
		public void addDetailsToJsonFile(File file) throws JsonGenerationException, JsonMappingException, IOException, SQLException {
			addPerson();
	}
		public <T>List JsonParser(File file,Class<T> parser) throws JsonParseException, JsonMappingException, IOException
		{
			List<T> list=new ArrayList<T>();
			CollectionType javaType=mapper.getTypeFactory().constructCollectionType(List.class, parser);
			list=mapper.readValue(file, javaType);
			return list;
		}
		public static void saveToJson(File file, List<Person> list)
				throws JsonGenerationException, JsonMappingException, IOException {
			ObjectMapper mapper = new ObjectMapper();
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(file, list);
			System.out.println("saved file");
		}
	public void save() throws JsonGenerationException, JsonMappingException, IOException
	{
		System.out.println("Do you want to save : y/n");
		String choice=Utility.userNext();
		if(choice.equalsIgnoreCase("y"))
		{
			saveToJson(file,personList);
		}
		else
		{
			System.out.println("not saved");
		}
	}
	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		
	}
}
