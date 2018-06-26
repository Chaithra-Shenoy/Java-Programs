/**
 * 
 */
package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class Validate {
	public static boolean checkUser(String name,String pass) 
    {
     boolean st =false;
     try{

	 //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	 //creating connection with the database 
        Connection con=DriverManager.getConnection
                       ("jdbc:mysql://localhost:3306/bridgelabz","root","admin");
        PreparedStatement ps =con.prepareStatement
                            ("select * from userreg where name=? and pass=?");
        ps.setString(1, name);
        ps.setString(2, pass);
        ResultSet rs =ps.executeQuery();
        st = rs.next();
       
     }catch(Exception e)
     {
         e.printStackTrace();
     }
        return st;                 
 }   
}
