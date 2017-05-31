package com.heima.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.dao.LonginDao;
import com.heima.daoimpl.LonginDaoImpl;
import com.heima.enty.User;
import com.heima.utils.MyDateConverter;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			String email=request.getParameter("email");
			String sex=request.getParameter("sex");
			String birthdaystr=request.getParameter("birthday");
			Date birthday=(Date) new MyDateConverter().convert(null, birthdaystr);
			
			User user=new User(username, password, email, sex, birthday);
			
			LonginDao ld=new LonginDaoImpl();
			ld.insert(user);
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
