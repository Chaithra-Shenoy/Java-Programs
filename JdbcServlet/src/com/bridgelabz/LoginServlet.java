package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String id = req.getParameter("id");
		int idnew = Integer.parseInt(id);
		String name = req.getParameter("name");
		String branch = req.getParameter("branch");
		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor='purple'><h1> STUDENT DETAILS<br>" + name + " " + id + " " + branch);
		out.flush();
		out.close();
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into bridgelabz.capgemini values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=admin");
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, idnew);
			pstmt.setString(2, name);
			pstmt.setString(3, branch);
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
