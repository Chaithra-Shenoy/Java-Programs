/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.MyAddressBook.adressBookFactory;

import com.bridgelabz.objectOrientedProgram.MyAddressBook.adressbookSerializer.JDBCAddressBookManager;
import com.bridgelabz.objectOrientedProgram.MyAddressBook.adressbookSerializer.JSonAddressBookManager;
import com.bridgelabz.objectOrientedProgram.MyAddressBook.service.AddressBookService;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class AddressBookFactory {
	public static AddressBookService getObject(String Object)
	{
		if(Object.equalsIgnoreCase("Json"))
		{
			AddressBookService obj=new JSonAddressBookManager();
			return obj;
		}
		else if(Object.equalsIgnoreCase("JDBC"))
		{
			AddressBookService obj=new JDBCAddressBookManager();
			return obj;
		}
		else
		{
			System.out.println("sorry,object not matched,pls try again");
		}
		return null;
	}
}
