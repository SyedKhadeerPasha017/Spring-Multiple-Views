package com.sathya.servletex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class fullname extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstName");
		String lastname=request.getParameter("lastName");
		String fullName;
		fullName=firstname+lastname;
		response.setContentType("text/plain");
		PrintWriter writer=response.getWriter();
		writer.println("your full name....."+fullName);
	}

}
