package com.heima.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.enty.Student;
import com.heima.service.StuService;
import com.heima.service.impl.StuServiceImpl;

/**
 * Servlet implementation class UpdataServlet
 */
public class UpdataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		try {
			request.setCharacterEncoding("utf-8");
			int id=Integer.parseInt(request.getParameter("sid"));
			
			String sname=request.getParameter("sname");
			String sex=request.getParameter("sex");
			String phone=request.getParameter("phone");
			Date birthday = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("birthday"));
			String[] hobbyarr=request.getParameterValues("hobby");
			String hobby=Arrays.toString(hobbyarr);
			hobby=hobby.substring(1, hobby.length()-1);
			String info=request.getParameter("info");
			Student stu=new Student(sname, sex, phone, birthday, hobby, info);
			
			@SuppressWarnings("rawtypes")
			StuService service=new StuServiceImpl();
			
			service.Updata(id, stu);
			
			request.getRequestDispatcher("StuServlet").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
