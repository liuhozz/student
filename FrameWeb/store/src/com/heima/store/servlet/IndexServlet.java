package com.heima.store.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.store.base.BaseServlet;
import com.heima.store.enty.Product;
import com.heima.store.service.ProductService;
import com.heima.store.service.serviceimp.ProductServiceImp;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// SELECT * FROM product WHERE pflag=0 ORDER BY pdate DESC LIMIT 0 , 9
		// 最新商品的sql语句
		// SELECT * FROM product WHERE pflag=0 AND is_hot=1 ORDER BY pdate DESC
		// LIMIT 0 ,9 最热商品的sql语句
		try {
			ProductService service = new ProductServiceImp();
			List<Product> list_news = service.findnews();
			req.setAttribute("list_news", list_news);

			List<Product> list_hots = service.findhots();
			req.setAttribute("list_hots", list_hots);
			// JOptionPane.showMessageDialog(null, list_hots);
			return "jsp/index.jsp";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			req.setAttribute("msg", e.getMessage());
			return "jsp/info.jsp";
		}

		// return null;
	}

	public String pro_info(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//根据pid查询product表中的数据
		//sql="SELECT *  FROM product WHERE pid = ?"
		//返回"/jsp/product_info.jsp"
		try {
			String pid=req.getParameter("pid");
			ProductService service=new ProductServiceImp();
			Product product = service.pro_info(pid);
			req.setAttribute("pro", product);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "/jsp/product_info.jsp";
	}
}
