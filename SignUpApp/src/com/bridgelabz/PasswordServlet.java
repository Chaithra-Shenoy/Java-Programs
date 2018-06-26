/**
 * 
 */
package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * purpose  create new password
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name PasswordServlet
 * 
 */
@WebServlet("/forgot")
public class PasswordServlet extends HttpServlet {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String newPassword = req.getParameter("newpass");
		String Renewpass = req.getParameter("Renewpass");
		 req.setAttribute("passName", name);
		if (newPassword.equals(Renewpass)) {
			Connection con = null;
			PreparedStatement ps = null;
			String query = "update userreg set pass=? where name=? ";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz?user=root&password=admin");
				ps = con.prepareStatement(query);
				ps.setString(1, newPassword);
				ps.setString(2, name);
				ps.executeUpdate();

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		RequestDispatcher rs = req.getRequestDispatcher("Welcome");
		rs.forward(req, resp);

	}
}
