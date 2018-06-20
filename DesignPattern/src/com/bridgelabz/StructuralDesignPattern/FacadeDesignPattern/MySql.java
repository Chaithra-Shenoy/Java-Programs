/**
 * 
 */
package com.bridgelabz.StructuralDesignPattern.FacadeDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class MySql {
	public static Connection getMySqlDbConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded and registered");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Connection established");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	public void generateMySqlPDFReport(String tableName, Connection con) {
		String qry = "delete from employee.chaithra1 where id=1";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			System.out.println("platform created");
			stmt.execute(qry);
			System.out.println("data inserted ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void generateMySqlHTMLReport(String tableName, Connection con) {
		tableName = "Bridgelabz";
		System.out.println(tableName + ".html");
	}
}
