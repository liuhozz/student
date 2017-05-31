package com.heima.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.daoimp.UserDaoImp;

/**
 * Servlet implementation class Delete_ser
 */
public class Delete_ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UserDaoImp udi=new UserDaoImp();
		
		String name = request.getParameter("usename");
		List<?> list = udi.Delect(name);
		if(list != null){
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");	//请求转发
			request.setAttribute("list", list);
			
			rd.forward(request, response);
		}else{
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
			response.getWriter().write(new String ("<h1>这个可能是代码有问题   那啥莫慌面包会有  代码会有的</h1>".getBytes()));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
