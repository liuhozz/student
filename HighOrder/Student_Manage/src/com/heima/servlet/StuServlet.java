package com.heima.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.heima.enty.Student;
import com.heima.service.StuService;
import com.heima.service.impl.StuServiceImpl;

/**
 * Servlet implementation class StuServlet
 */
public class StuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			HttpSession session = request.getSession();
			StuService<Student> service=new StuServiceImpl();
			List<Student> list = service.findAll();
			session.setAttribute("list", list);
			response.sendRedirect("success.jsp");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
