package com.heima.agency;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String str=request.getParameter("name");
		System.out.println(str);
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str=request.getParameter("name");
		System.out.println(str);
	}

}