package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * purpose Update data in database using batch processing.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class BatchUpdate 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.addBatch("update bridgelabz.batch  set name='cool' where id=2");
			stmt.addBatch("update bridgelabz.batch  set name='chaithra' where id=1");
			stmt.addBatch("update bridgelabz.batch set branch='is' where id=2");
			stmt.addBatch("update bridgelabz.batch set name='guddu' where id=3");
			stmt.executeBatch();
			con.commit();
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		} 
		finally
		{
			if (stmt != null) 
			{
				try 
				{
					stmt.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try
				{
					con.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
