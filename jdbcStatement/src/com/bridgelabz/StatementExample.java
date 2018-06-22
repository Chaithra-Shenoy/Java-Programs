package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * purpose Code to insert multiple data in database using Statement interface.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class StatementExample {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String qry = "insert into statement.insertqry values(7,'ramu','cs')";
		String qry1 = "insert into statement.insertqry values(3,'samu','me')";
		String qry2 = "insert into statement.insertqry values(5,'bheemu','ec')";
		String qry3 = "insert into statement.insertqry values(6,'vasu','cv')";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			stmt = con.createStatement();
			stmt.executeUpdate(qry);
			stmt.executeUpdate(qry1);
			stmt.executeUpdate(qry2);
			stmt.executeUpdate(qry3);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if ((stmt != null) && (con != null)) {
				try {
					stmt.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
