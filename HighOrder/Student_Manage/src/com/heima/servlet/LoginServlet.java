package com.heima.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.heima.enty.User;
import com.heima.service.LoginService;
import com.heima.service.impl.LoginServiceImpl;
import com.heima.util.IslongingCookie;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//request.setCharacterEncoding("utf-8");
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		try {
			HttpSession session=request.getSession();
			
			LoginService service=new LoginServiceImpl();
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			Cookie[] cookies = request.getCookies();
			
			if(session.getAttribute("user") != null){
				response.sendRedirect("StuServlet");
			}else{
				Cookie iscookie = IslongingCookie.iscookie(cookies, "info");
				if( iscookie != null){
					String info = iscookie.getValue();
					String[] infos = info.split("&");
					User user= service.find(infos[0], infos[1]);
					if(user != null){
						session.setAttribute("info", user);
						response.sendRedirect("StuServlet");
					}
				}else{
					User user= service.find(username, password);
					if(user != null){
						Cookie cookie=new Cookie("info", user.getUsername()+"&"+user.getPassword());
						response.addCookie(cookie);
						session.setAttribute("info", user);
						response.sendRedirect("StuServlet");
					}
				}
			}
			/*if(user != null){
				session.setAttribute("user", user);
				Cookie cookieusername=new Cookie("username", username);
				Cookie cookiepassword=new Cookie("password", password);
				cookieusername.setMaxAge(60*60*24);
				cookiepassword.setMaxAge(60*60*24);
				response.addCookie(cookieusername);
				response.addCookie(cookiepassword);
				response.sendRedirect("StuServlet");
			}else{
				response.getWriter().write("登陆失败");
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
