package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * purpose Code to delete data in database using Statement interface.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class StatementDelete {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String qry = "delete from statement.insertqry where id=3";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			stmt = con.createStatement();
			stmt.executeUpdate(qry);
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
