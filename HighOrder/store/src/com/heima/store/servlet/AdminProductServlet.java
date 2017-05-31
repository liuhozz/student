package com.heima.store.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.store.base.BaseServlet;
import com.heima.store.enty.PageModel;
import com.heima.store.service.ProductService;
import com.heima.store.service.serviceimp.ProductServiceImp;

public class AdminProductServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public String findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int num=Integer.parseInt(request.getParameter("num"));
			ProductService service=new ProductServiceImp();
			PageModel page = service.findAll(num);
			page.setUrl("AdminProductServlet?method=findAll");
			request.setAttribute("page", page);
			return "admin/product/list.jsp";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
