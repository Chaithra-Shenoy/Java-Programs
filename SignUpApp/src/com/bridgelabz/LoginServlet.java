/**
 * 
 */
package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class LoginServlet extends HttpServlet{
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        String name = request.getParameter("name");
	        String pass = request.getParameter("pass");
	        request.setAttribute("passName", name);
	      
	        if(Validate.checkUser(name, pass))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
	            rs.forward(request, response);
	        
	        }
	        else
	        {
	           out.println("Username or Password incorrect");
	           RequestDispatcher rs = request.getRequestDispatcher("index.html");
	           rs.include(request, response);
	        }
	    }  
}
