package com.sathya.loginApplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//process data

		if(username.equalsIgnoreCase("pasha") && password .equals("Pasha@123"))
		{
			//RequestDispatcher dispatcher=request.getRequestDispatcher("success.html");
			//dispatcher.forward(request, response);
			response.sendRedirect("http://www.facebook.com");
			}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("Login Fail...Try with valid data");
			RequestDispatcher dispatcher=request.getRequestDispatcher("fail.html");
			dispatcher.forward(request, response);
		}
		
		
	}

}
