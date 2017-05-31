package com.heima.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.daoimp.UserDaoImp;

/**
 * Servlet implementation class Insert_ser
 */
public class Insert_ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert_ser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		String usename = request.getParameter("usename");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String name = request.getParameter("name");
		UserDaoImp udi=new UserDaoImp();
		if(udi.Insert(usename, password, phone, name)){
			/*response.setStatus(302);//设置状态码
			response.setHeader("location", "index.jsp");  这种跳转为重定位  */
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
			response.getWriter().write(new String ("<h1>应该不会有太大的问题   不是输入的太长就是已有该账号了</h1>".getBytes()));
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
