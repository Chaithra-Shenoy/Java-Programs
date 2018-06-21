package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		String name = req.getParameter("name");
		String password = req.getParameter("pwd");
		PrintWriter out;
		try {
			out = resp.getWriter();
			out.println("<html><body bgcolor=orange><h1>WELCOME" + " " + name + "</h1></body></html>");
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
