package com.heima.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.enty.Page;
import com.heima.service.StuService;
import com.heima.service.impl.StuServiceImpl;

/**
 * Servlet implementation class PageSelectServlet
 */
public class PageSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			@SuppressWarnings("rawtypes")
			StuService stu=new StuServiceImpl();
			int currentlypage=Integer.parseInt(request.getParameter("currentlypage"));
			Page page = stu.pagefind(currentlypage);
			request.setAttribute("pagecc", page);
			request.getRequestDispatcher("page_success.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
