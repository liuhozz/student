package com.heima.store.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.store.base.BaseServlet;
import com.heima.store.enty.Cart;
import com.heima.store.enty.Cartitem;
import com.heima.store.enty.Product;
import com.heima.store.service.ProductService;
import com.heima.store.service.serviceimp.ProductServiceImp;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public String addcart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 根据PID查找商品
		// 将商品和数量放入cartitem
		// 在cart中将cartitem放入map集合
		try {
			//从session获取购物车
			Cart cart=(Cart)request.getSession().getAttribute("cart");
			if(null==cart){
			  //如果获取不到,创建购物车对象,放在session中
				cart=new Cart();
				request.getSession().setAttribute("cart", cart);
			}
				if (
					request.getSession().getAttribute("user") != null) {
					String pid = request.getParameter("pid");
					int num = Integer.parseInt(request.getParameter("num"));
					ProductService service = new ProductServiceImp();
					Product product = service.pro_info(pid);
					Cartitem cartitem = new Cartitem();
					cartitem.setNum(num);
					cartitem.setProduct(product);
					
					cart.addcartitem(cartitem);
					
					response.sendRedirect("/store/jsp/cart.jsp");
					return null;
			} else {
				request.setAttribute("msg", "请登陆后再查看购物车");
				return "jsp/info.jsp";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			request.setAttribute("msg", e.getMessage());
			return "jsp/info.jsp";
		}

	}
	
	public String delcart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取待删除商品pid
				String pid=request.getParameter("pid");
				//获取到购物车
				Cart cart=(Cart)request.getSession().getAttribute("cart");
				//调用购物车删除购物项方法
				cart.remove(pid);
				//重定向到/jsp/cart.jsp
				response.sendRedirect("/store/jsp/cart.jsp");
				return null;
	}

	public String removrcart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取购物车
				Cart cart=(Cart)request.getSession().getAttribute("cart");
				//调用购物车上的清空购物车方法
				cart.clearcart();
				//重新定向到/jsp/cart.jsp
				response.sendRedirect("/store/jsp/cart.jsp");
				return null;
		
	}
}
