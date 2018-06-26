/**
 * 
 */
package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * purpose new user signUp
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name SignUpServlet
 * 
 */
@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
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
		String password = req.getParameter("pass");
		 req.setAttribute("passName", name);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz?user=root&password=admin");

			PreparedStatement ps = con.prepareStatement("insert into userreg values(?,?)");

			ps.setString(1, name);
			ps.setString(2, password);

			int i = ps.executeUpdate();
			if (i > 0) {
				RequestDispatcher rs = req.getRequestDispatcher("Welcome");
			rs.forward(req, resp);
			}
		} catch (Exception e2) {
			System.out.println(e2);
		}

		out.close();

		
	}
}
