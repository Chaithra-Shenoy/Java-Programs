package com.bridgelabz;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;
/**
 * purpose  Insert query using Connection pool.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class ConnectionPool {
	public static void main(String[] args) {
		DataSource datasSourse = null;
		datasSourse = MyDataSource.getMyDataSource();
		Connection con = null;
		Statement stmt = null;
		String query = "insert into bridgelabz.batch values(17,'geetha','ec')";
		String query1 = "insert into bridgelabz.batch values(18,'seetha','it')";
		try {
			con = datasSourse.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			stmt.executeUpdate(query1);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stmt != null && con != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
