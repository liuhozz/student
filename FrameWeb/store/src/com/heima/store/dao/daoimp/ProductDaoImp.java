package com.heima.store.dao.daoimp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.heima.store.dao.ProductDao;
import com.heima.store.enty.Product;
import com.heima.store.utils.Hibernate_SessionUtils;

public class ProductDaoImp implements ProductDao {

	Session session=Hibernate_SessionUtils.getSession();
	Transaction tr=session.beginTransaction();
	@Override
	public Product pro_info(String pid) throws SQLException {
		// TODO Auto-generated method stub
		/*String sql="SELECT *  FROM product WHERE pid = ?";
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		
		return (Product) runner.query(sql, new BeanHandler<Product>(Product.class), pid);*/
		Query query = session.createQuery("FROM product WHERE pid = :pid").setParameter("pid", pid);
		
		return (Product)query.uniqueResult();
	}
	@Override
	public int findcount(String cid) throws SQLException{
		/*QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT COUNT(*) FROM product WHERE pflag=0 AND cid=?";//要加个cid;
		Long count=(Long) runner.query(sql,new ScalarHandler(),cid);
		//System.out.println(count);
		return count.intValue();*/
		Query query = session.createQuery("SELECT COUNT(*) FROM product WHERE pflag=0 AND cid=?").setParameter(0, cid);
		Long count = (Long)query.uniqueResult();
		
		return count.intValue();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findproBycid(String cid, int startIndex, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		/*String sql="SELECT * FROM product WHERE cid=? AND pflag = 0 LIMIT ?,?";
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		return runner.query(sql, new BeanListHandler<Product>(Product.class),cid,startIndex,pageSize);*/
		List<Product> list = session.createQuery("from product where cid =? and pflag=0")
				.setParameter(0, cid)
				.setFirstResult(startIndex)
				.setMaxResults(pageSize)
				.list();
		
		
		/*query.setParameter(0, cid);
		query.setFirstResult(startIndex);
		query.setMaxResults(pageSize);*/
		
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findnews() throws SQLException {
		// TODO Auto-generated method stub
		/*QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT * FROM product WHERE pflag=0 ORDER BY pdate DESC LIMIT 0 , 9 ";
		return runner.query(sql, new BeanListHandler<Product>(Product.class));*/
		List<Product> list = session.createQuery("FROM product WHERE pflag=0 ORDER BY pdate DESC")
				.setFirstResult(0)
				.setMaxResults(9)
				.list();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findhots() throws SQLException {
		// TODO Auto-generated method stub
		/*QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT * FROM product WHERE pflag=0 AND is_hot=1 ORDER BY pdate DESC LIMIT 0 ,9 ";
		return runner.query(sql, new BeanListHandler<Product>(Product.class));*/
		List<Product> list = session.createQuery("FROM product WHERE pflag=0 AND is_hot=1 ORDER BY pdate DESC")
				.setFirstResult(0)
				.setMaxResults(9)
				.list();
		
		return list;
		
	}

}
