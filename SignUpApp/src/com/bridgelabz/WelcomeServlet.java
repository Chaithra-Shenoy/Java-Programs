/**
 * 
 */
package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * purpose  Welcome page
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       String name= (String) request.getAttribute("passName");
        PrintWriter out = response.getWriter();
        out.println("<html><body bgcolor='aqua'>WELCOME  "+name+" Have a nice day <br> <a href=\"index.html\">SignOut</a></body></html>");
      }  
}
