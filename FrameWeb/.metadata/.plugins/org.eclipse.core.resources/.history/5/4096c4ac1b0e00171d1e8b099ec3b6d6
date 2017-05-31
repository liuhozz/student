package com.heima.store.dao.daoimp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.heima.store.dao.OrdersDao;
import com.heima.store.enty.OrderItem;
import com.heima.store.enty.Orders;
import com.heima.store.utils.JDBCUtils;

public class OrdersDaoImp implements OrdersDao {

	QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
	
	/**
	 * 根据uid查找对应账户的所有订单
	 */
	@Override
	public List<Orders> findorderByuid(String uid) throws SQLException {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM  orders WHERE uid=?";
		return runner.query(sql, new BeanListHandler<Orders>(Orders.class), uid);
	}
	
	/**
	 * 根据oid查出带订单下的所有商品  (订单项)
	 */
//SELECT * FROM product p RIGHT OUTER JOIN orderitem o ON p.pid=o.pid WHERE  o.oid=
	public List<Map<String, Object>> findorderitemByoid(String oid) throws SQLException{
		String sql="SELECT * FROM product p RIGHT OUTER JOIN orderitem o ON p.pid=o.pid WHERE  o.oid=?";
		return runner.query(sql, new MapListHandler(), oid);
	}
	
	
	@Override
	public void addorder(Orders orders) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner();
		String sql="INSERT INTO orders VALUES(?,?,?,?,?,?,?,?)";
		Object[] params={	orders.getOid(),
							orders.getOrdertime(),
							orders.getTotal(),
							orders.getState(),								
							orders.getAddress(),
							orders.getName(),
							orders.getTelephone(),
							orders.getUser().getUid()
							};
		runner.update(JDBCUtils.getConnection(),sql, params);
	}
	
	public void addOrderItem(OrderItem item) throws SQLException{
		String sql="INSERT INTO orderitem VALUES(?,?,?,?,?)";
		QueryRunner qr=new QueryRunner();
		Object[] params={item.getItemid(),item.getQuantity(),item.getTotal(),item.getProduct().getPid(),item.getOrders().getOid()};
		qr.update(JDBCUtils.getConnection(),sql,params);
	}

}
