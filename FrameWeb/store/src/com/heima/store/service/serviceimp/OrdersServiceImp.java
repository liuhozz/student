package com.heima.store.service.serviceimp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.heima.store.dao.OrdersDao;
import com.heima.store.dao.daoimp.OrdersDaoImp;
import com.heima.store.enty.OrderItem;
import com.heima.store.enty.Orders;
import com.heima.store.enty.Product;
import com.heima.store.service.OrdersService;
import com.heima.store.utils.JDBCUtils;
import com.heima.store.utils.MyBeanUtils;

public class OrdersServiceImp implements OrdersService {

	@Override
	public void addOrder(Orders orders) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = JDBCUtils.getConnection();//.setAutoCommit(false);
		try{
			OrdersDao dao=new OrdersDaoImp();
			conn.setAutoCommit(false);
			
			dao.addorder(orders);
			for (OrderItem item : orders.getList()) {
				dao.addOrderItem(item);
			}
			conn.commit();
		}catch(Exception e){
			e.printStackTrace();
			conn.rollback();
		}
	}

	@Override
	public List<Orders> findorders(String uid) throws SQLException {
		// TODO Auto-generated method stub
		OrdersDao dao=new OrdersDaoImp();
		List<Orders> list = dao.findorderByuid(uid);
		for (Orders orders : list) {
			//orders.setList(dao.findorderitemByoid(orders.getOid()));
			/*List<OrderItem> listitem = dao.findorderitemByoid(orders.getOid());
			for (OrderItem item : listitem) {
				
				item.setOrders(orders);
				item.setProduct(product);
			}*/
			List<Map<String, Object>> listmap = dao.findorderitemByoid(orders.getOid());
			
			for (Map<String, Object> map : listmap) {
				OrderItem item=new OrderItem();
				Product product=new Product();
				MyBeanUtils.populate(item, map);
				MyBeanUtils.populate(product, map);
				item.setProduct(product);
				orders.getList().add(item);
			}
			
		}
		return list;
	}

}
