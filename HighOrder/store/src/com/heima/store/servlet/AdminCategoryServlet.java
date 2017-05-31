package com.heima.store.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.store.base.BaseServlet;
import com.heima.store.enty.Category;
import com.heima.store.service.CategoryService;
import com.heima.store.service.serviceimp.CategoryServiceImp;

public class AdminCategoryServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public String findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			 CategoryService service=new CategoryServiceImp();
			List<Category> list = service.findAll();
			request.setAttribute("clist", list);
			return "admin/category/list.jsp";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
