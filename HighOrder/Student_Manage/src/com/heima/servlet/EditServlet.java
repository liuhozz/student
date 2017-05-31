package com.heima.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.enty.Student;
import com.heima.service.StuService;
import com.heima.service.impl.StuServiceImpl;

/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			int sid =Integer.parseInt(request.getParameter("sid"));
			StuService<Student> service=new StuServiceImpl();
			Student stu = service.find(sid);
			request.setAttribute("stu", stu);
			request.getRequestDispatcher("updata.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
