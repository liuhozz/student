package com.heima.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DonwLoad_ser
 */
public class DonwLoad_ser extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext context = getServletContext();

		String filename = request.getParameter("filename");
		getcount(filename);
		response.setHeader("Content-Disposition", "attachment; filename=" + filename);
		response.sendRedirect("success.jsp");
		//request.getRequestDispatcher("success.jsp").forward(request, response);
		InputStream is = new FileInputStream(context.getRealPath("DonwLoad/" + filename));
		OutputStream os = response.getOutputStream();
		int len = 0;
		byte[] arr = new byte[1024];
		while ((len = is.read(arr)) != -1) {
			os.write(arr, 0, len);
		}
		os.close();
		is.close();

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void getcount(String filename){
		ServletContext context = getServletContext();
		if (context.getAttribute(filename) == null) {
			context.setAttribute(filename, 1);
		} else {
			context.setAttribute(filename, ((int) context.getAttribute(filename)) + 1);
		}
	}
}
