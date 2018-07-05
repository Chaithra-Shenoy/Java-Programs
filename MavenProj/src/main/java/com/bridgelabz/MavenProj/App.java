package com.bridgelabz.MavenProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "select * from bridgelabz.prepare";
		ResultSet set = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt = con.prepareStatement(qry);
			set = pstmt.executeQuery();
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String branch = set.getString(3);
				System.out.println(id + "  " + name + "  " + branch);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if ((set != null) && (pstmt != null) && (con != null)) {
				try {
					set.close();
					pstmt.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
    }
}
