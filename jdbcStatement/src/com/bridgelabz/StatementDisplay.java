package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * purpose Code to display data in database using Statement interface.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class StatementDisplay {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String qry = "select * from statement.insertqry";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			stmt = con.createStatement();
			rs = stmt.executeQuery(qry);
			// boolean val=rs.absolute(3);
			// if(val) {
			// int id=rs.getInt("id");
			// String name=rs.getString(2);
			// String branch=rs.getString(3);
			// System.out.println(id+" "+name+" "+branch);
			// }
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String branch = rs.getString(3);
				System.out.println(id + " " + name + " " + branch);
			}
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
