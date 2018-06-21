package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.text.ParseException;


public class Practice {
	private static final String INSERT = "INSERT INTO employee "
	         + "(empid, name) VALUES (?,?)";

	   public static void main(String[] args) {
	      String jdbcUrl = "jdbc:mysql://localhost:3306/bridgelabz";
	      String username = "root";
	      String password = "admin";
	      try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);) {

	         // Disable auto commit mode
	         conn.setAutoCommit(false);

	         try (PreparedStatement insertStmt = conn.prepareStatement(INSERT);) {

	            // Insert 1st record
	            insertStmt.setInt(1, 60);
	            insertStmt.setString(2, "chaithra");
	            insertStmt.executeUpdate();

	            // Insert 2st record
	            insertStmt.setInt(1, 70);
	            insertStmt.setString(2, "aruna");
	            insertStmt.executeUpdate();

	            // Insert 3st record
	            insertStmt.setInt(1, 80);
	            insertStmt.setString(2, "priya");
	            insertStmt.executeUpdate();

	            // Create Savepoint
	            Savepoint savepoint = conn.setSavepoint();

	            // Insert 4st record
	            insertStmt.setInt(1, 40);
	            insertStmt.setString(2, "divya");
	            insertStmt.executeUpdate();

	            // Insert 5st record
	            insertStmt.setInt(1, 50);
	            insertStmt.setString(2, "bhavya");
	            insertStmt.executeUpdate();

	            // Rollback to savepoint
	            conn.rollback(savepoint);

	            // Commit statement
	            conn.commit();

	            System.out.println("Transaction is commited successfully.");
	         } catch (SQLException e) {
	            e.printStackTrace();
	            if (conn != null) {
	               try {
	                  // Roll back transaction
	                  System.out.println("Transaction is being rolled back.");
	                  conn.rollback();
	               } catch (Exception ex) {
	                  ex.printStackTrace();
	               }
	            }
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   }
}
