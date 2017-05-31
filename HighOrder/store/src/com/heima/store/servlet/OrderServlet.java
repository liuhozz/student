package com.heima.store.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.store.base.BaseServlet;
import com.heima.store.enty.Cart;
import com.heima.store.enty.Cartitem;
import com.heima.store.enty.OrderItem;
import com.heima.store.enty.Orders;
import com.heima.store.enty.User;
import com.heima.store.service.OrdersService;
import com.heima.store.service.serviceimp.OrdersServiceImp;
import com.heima.store.utils.UUIDUtils;

/**
 * Servlet implementation class OrderServlet
 */
public class OrderServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	//lorders
	public String findordersBypid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String uid=request.getParameter("uid");
			//根据Pid获取order的集合  
			//然后根据order的oid获取orderitem表和product表的数据将之存放到listmap中
			OrdersService service=new OrdersServiceImp();
			List<Orders> list = service.findorders(uid);
			request.setAttribute("orderl", list);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/jsp/order_list.jsp";
	}
	
	public String addorder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Cart cart =(Cart) request.getSession().getAttribute("cart");
			//cart.get
			Orders orders=new Orders();
			orders.setOid(UUIDUtils.getId());
			orders.setUser((User)request.getSession().getAttribute("user"));
			orders.setOrdertime(new Date());
			orders.setTotal(cart.getTotal());
			orders.setState(1);
			for(Cartitem cartitem : cart.getCartItemAll()){
				OrderItem oitem=new OrderItem();
				oitem.setItemid(UUIDUtils.getId());
				oitem.setQuantity(cartitem.getNum());
				oitem.setProduct(cartitem.getProduct());
				
				oitem.setOrders(orders);//相当于在orderitem设置orders的外键
				orders.getList().add(oitem);
			}
			
			cart.clearcart();
			OrdersService service=new OrdersServiceImp();
			service.addOrder(orders);
			
			request.getSession().setAttribute("order", orders);
			
			response.sendRedirect("/store/jsp/order_info.jsp");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
