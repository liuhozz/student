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

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
    
	public String prolist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String cid=req.getParameter("cid");
			int currnum=Integer.parseInt(req.getParameter("num"));
			ProductService service=new ProductServiceImp();
			PageModel page = service.findpage(cid, currnum);
			page.setUrl("ProductServlet?method=prolist&cid="+cid);
			req.setAttribute("page", page);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "jsp/product_list.jsp";
	}

}
