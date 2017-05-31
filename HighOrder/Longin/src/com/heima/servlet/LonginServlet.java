package com.heima.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.dao.LonginDao;
import com.heima.daoimpl.LonginDaoImpl;
import com.heima.enty.User;

/**
 * Servlet implementation class LonginServlet
 */
public class LonginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			LonginDao ld=new LonginDaoImpl();
			User user = ld.find(username, password);
			
			if(user != null){
				request.getSession().setAttribute("user", user);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}else{
				request.getSession().setAttribute("fail", "用户名和密码不匹配");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
