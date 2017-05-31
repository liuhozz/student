package com.heima.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.heima.daoimp.UserDaoImp;
import com.heima.enty.User;

/**
 * Servlet implementation class User_ser
 */
public class User_ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_ser() {
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
		UserDaoImp udi=new UserDaoImp();
		String usename = request.getParameter("username");
		String password = request.getParameter("password");
		User user = udi.find(usename,password);
		List<User> list=udi.findAll();
		
		if(user != null){ 
			/*response.setStatus(302);//设置状态码
			response.setHeader("location", "success.jsp");  //这种跳转为重定位   这里的第一个参数是自定义还是有固定格式?*/
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");	//这种跳转方式为请求转发
			HttpSession session=request.getSession();
			
			session.setAttribute("list", list);
			
			rd.forward(request, response);
		}else{
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
			response.getWriter().write(new String ("<h1>不好意思   你人品不咋地   这么简单的登录都能错</h1>".getBytes()));
		}
		//response.getWriter().write("dddd");  //这样一输出   原页面的内容会被替换掉
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
