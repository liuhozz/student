package com.heima.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.dao.UserDao;
import com.heima.daoimp.UserDaoImp;
import com.heima.enty.User;

/**
 * Servlet implementation class Update_ser
 */
public class Update_ser extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		String usename = request.getParameter("usename");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		UserDao udi=new UserDaoImp();
		boolean flage = udi.Update(usename, new User(1, name, password, phone, usename));
		if(flage){
			List<User> list=(List<User>) udi.findAll();
			request.getSession().setAttribute("list", list);
			response.sendRedirect("success.jsp");
		}else{
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
			response.getWriter().write(new String ("<h1>不好意思   你人品不咋地   这么简单的登录都能错</h1>".getBytes()));
			
		}
		//request.getParameter("name");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
