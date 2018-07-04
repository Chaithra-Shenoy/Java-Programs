package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 */

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class Register extends HttpServlet{
/* (non-Javadoc)
 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 */
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String mobile = req.getParameter("mobile");
	String password = req.getParameter("pass");

	PrintWriter out = resp.getWriter();
	Connection con=null;
	PreparedStatement ps=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginregister?user=root&password=admin");

		 ps = con.prepareStatement("insert into login(Name,Email,Mobile,Password) values(?,?,?,?)");

		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, mobile);
		ps.setString(4, password);

		int i = ps.executeUpdate();
		if (i > 0) {
			HttpSession session=req.getSession(true);
			session.setAttribute("passEmail", email);
			System.out.println(session.isNew());
			RequestDispatcher dis=req.getRequestDispatcher("PreSuccess");
			dis.forward(req, resp);	
			}
	} catch (Exception e2) {
		System.out.println(e2);
	}

	finally {
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
}
