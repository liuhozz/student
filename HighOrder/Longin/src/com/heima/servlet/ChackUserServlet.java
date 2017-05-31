package com.heima.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.dao.LonginDao;
import com.heima.daoimpl.LonginDaoImpl;

/**
 * Servlet implementation class ChackUserServlet
 */
public class ChackUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String username = request.getParameter("username");
			Map<String, String[]> mp = request.getParameterMap();
			System.out.println(mp);
			
			LonginDao ld = new LonginDaoImpl();
			boolean flag = ld.findUser(username);
			if (flag) {
				response.getWriter().write("1");
			} else {
				response.getWriter().write("0");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
