
package com.bridgelabz;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class CallableStatementProcedure {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/bridgelabz";
		String user = "root";
		String password = "admin";
		Connection con = null;
		CallableStatement statement = null;
		ResultSet set = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbURL, user, password);

			statement = con.prepareCall("{call call_procedure(?,?)}");
			statement.setInt(2, 1);
			statement.setString(1, "chaithra");
			set = statement.executeQuery();
			while (set.next()) {
				int id = set.getInt(2);
				String name = set.getString(1);
				System.out.println(id + " " + name);
			}

			System.out.println("Stored procedure called successfully!");

		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
