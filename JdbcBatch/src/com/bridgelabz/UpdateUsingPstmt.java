package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUsingPstmt {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		String qry = "update bridgelabz.batch  set name=? where id=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			con.setAutoCommit(false);
			ps = con.prepareStatement(qry);
			
			ps = con.prepareStatement(qry);
            ps.setString(2,"manu");
            ps.setInt(1, 1);
            ps.addBatch();
            ps.setInt(1, 4000);
            ps.setInt(2, 230);
            ps.addBatch();
            int count[] = ps.executeBatch();

			con.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null && con != null) {
				try {
					ps.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
