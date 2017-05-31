package com.heima.store.dao.daoimp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.heima.store.dao.OrdersDao;
import com.heima.store.enty.OrderItem;
import com.heima.store.enty.Orders;
import com.heima.store.utils.Hibernate_SessionUtils;
import com.heima.store.utils.JDBCUtils;

public class OrdersDaoImp implements OrdersDao {

	QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
	Session session=Hibernate_SessionUtils.getSession();
	Transaction tr=session.beginTransaction();
	/**
	 * 根据uid查找对应账户的所有订单
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> findorderByuid(String uid) throws SQLException {
		// TODO Auto-generated method stub
		/*String sql="SELECT * FROM  orders WHERE uid=?";
		return runner.query(sql, new BeanListHandler<Orders>(Orders.class), uid);*/
		List<Orders> list = session.createQuery("FROM  orders WHERE uid=?").setParameter(0, uid).list();
		return list;
	}
	
	/**
	 * 根据oid查出带订单下的所有商品  (订单项)
	 */
//SELECT * FROM product p RIGHT OUTER JOIN orderitem o ON p.pid=o.pid WHERE  o.oid=
	public List<Map<String, Object>> findorderitemByoid(String oid) throws SQLException{
		String sql="SELECT * FROM product p RIGHT OUTER JOIN orderitem o ON p.pid=o.pid WHERE  o.oid=?";
		
		
		String hql = "from OrderItem o left join o.product ";
		return runner.query(sql, new MapListHandler(), oid);
	}
	
	
	@Override
	public void addorder(Orders orders) throws SQLException {
		// TODO Auto-generated method stub
		/*QueryRunner runner=new QueryRunner();
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
		runner.update(JDBCUtils.getConnection(),sql, params);*/
		session.save(orders);
	}
	
	public void addOrderItem(OrderItem item) throws SQLException{
		/*String sql="INSERT INTO orderitem VALUES(?,?,?,?,?)";
		QueryRunner qr=new QueryRunner();
		Object[] params={item.getItemid(),item.getQuantity(),item.getTotal(),item.getProduct().getPid(),item.getOrders().getOid()};
		qr.update(JDBCUtils.getConnection(),sql,params);*/
		session.save(item);
	}

}