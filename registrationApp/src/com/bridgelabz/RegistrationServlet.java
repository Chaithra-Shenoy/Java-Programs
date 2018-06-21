package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/action")
public class RegistrationServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String regno = req.getParameter("regno");
		String password = req.getParameter("password");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			String query = "select * from bridgelabz.studentData sd,bridgelabz.studentregister sr where sd.regno=sr.regno and sd.regno=? and sr.password=?";
			 pstmt=con.prepareStatement(query);
	            pstmt.setInt(1, Integer.parseInt(regno));
	            pstmt.setString(2, password);
	            rs=pstmt.executeQuery();
	            resp.setContentType("text/html");
	            PrintWriter out=resp.getWriter();
	            if(rs.next())
	            {
	                out.print("<h1>valid to enter</h1>");
	                out.println("<html><body bgcolor='orange'> WELCOME <a href=\"valid.html\"> NEXT </a></body></html>");
	            }
	            else
	            {
	                out.print("<h1>Invalid.You cannot enter </h1>");
	            }
	        
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
