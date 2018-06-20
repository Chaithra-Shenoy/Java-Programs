package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPreparedStatement {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into bridgelabz.prepare values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "chaithra");
			pstmt.setString(3, "ec");
			pstmt.executeUpdate();

			pstmt.setInt(1, 2);
			pstmt.setString(2, "aruna");
			pstmt.setString(3, "cs");
			pstmt.executeUpdate();

			pstmt.setInt(1, 3);
			pstmt.setString(2, "priya");
			pstmt.setString(3, "cv");
			pstmt.executeUpdate();

			pstmt.setInt(1, 4);
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
