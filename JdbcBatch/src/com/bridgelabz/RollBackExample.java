package com.bridgelabz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;
/**
 * purpose Code to understand transaction in database.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class RollBackExample 
{
	public static void main(String args[]) 
	{
		Connection con = null;
		Savepoint point = null;
		PreparedStatement pstmt = null;
		

		String query = "insert into bridgelabz.newbatch values(?,?,?)";
		String query1 = "insert into bridgelabz.newbatch values(?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "1257");
			pstmt.setString(2, "aru");
			pstmt.setString(3, "sssss");
			pstmt.executeUpdate();
			con.commit();
			
			pstmt = con.prepareStatement(query1);
			pstmt.setString(1, "1258");
			pstmt.setString(2,"bhav");
			pstmt.setString(3, "nnnnn");
			pstmt.executeUpdate();
			
			point = con.setSavepoint();
			
			pstmt = con.prepareStatement(query1);
			pstmt.setString(1, "1259");
			pstmt.setString(2,"bhavna");
			pstmt.setString(3, "nnnnn");
			pstmt.executeUpdate(); Update data in database using batch processing.
	
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			con.rollback(point);

		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}
}
