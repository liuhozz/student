package com.heima.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.dao.Find;
import com.heima.daoimp.FindWords;
import com.heima.enty.Words;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class FindWordsServlet
 */
public class FindWordsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//@SuppressWarnings("static-access")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		try {
			String words=request.getParameter("value");
			Find find=new FindWords();
			List<Words> word = find.findwords(words);
			JSONArray array=JSONArray.fromObject(word);
			String json=array.toString();
			System.out.println(json);
			response.getWriter().write(json);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
