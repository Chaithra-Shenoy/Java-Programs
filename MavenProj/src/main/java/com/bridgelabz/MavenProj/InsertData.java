/**
 * 
 */
package com.bridgelabz.MavenProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class InsertData {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into bridgelabz.prepare values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, 9);
			pstmt.setString(2, "divya");
			pstmt.setString(3, "ec");
			pstmt.executeUpdate();

			pstmt.setInt(1, 6);
			pstmt.setString(2, "aruna");
			pstmt.setString(3, "cs");
			pstmt.executeUpdate();

			pstmt.setInt(1, 7);
			pstmt.setString(2, "priya");
			pstmt.setString(3, "cv");
			pstmt.executeUpdate();

			pstmt.setInt(1, 8);
			pstmt.setString(2, "sam");
			pstmt.setString(3, "me");
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if ((pstmt != null) && (con != null)) {
				try {
					pstmt.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
