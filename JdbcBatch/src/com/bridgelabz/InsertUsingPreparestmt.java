package com.bridgelabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * purpose insert data in database using batch processing and PreparedStatement.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class InsertUsingPreparestmt 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement ps = null;
		String qry = "insert into  bridgelabz.batch  values(?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			con.setAutoCommit(false);
			ps = con.prepareStatement(qry);
			ps.setInt(1, 101);
			ps.setString(2, "payal");
			ps.setString(3, "system");
			ps.addBatch();

			ps.setInt(1, 102);
			ps.setString(2, "kajol");
			ps.setString(3, "ec");
			ps.addBatch();
			int[] count = ps.executeBatch();

			con.commit();
		} 
		/**
		 * purpose Update data in database using batch processing.
		 * 
		 * @author Chaithra-Shenoy
		 * @version 1.0
		 * @since 17-05-2018
		 */
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			if (ps != null && con != null) 
			{
				try 
				{
					ps.close();
					con.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}

			}
		}
	}
}
