package com.heima.store.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.heima.store.enty.OrderItem;
import com.heima.store.enty.Orders;

public interface OrdersDao {

	void addorder(Orders orders) throws SQLException;
	void addOrderItem(OrderItem item) throws SQLException;
	
	List<Orders> findorderByuid(String uid) throws SQLException;
	
	List<Map<String, Object>> findorderitemByoid(String oid) throws SQLException;

}
