package com.heima.store.service;

import java.sql.SQLException;
import java.util.List;

import com.heima.store.enty.Orders;

public interface OrdersService {

	void addOrder(Orders orders) throws SQLException;
	
	List<Orders> findorders(String uid) throws SQLException;
	
}
