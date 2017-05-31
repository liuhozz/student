package com.heima.store.dao.daoimp;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.heima.store.dao.ProductDao;
import com.heima.store.enty.Product;
import com.heima.store.utils.JDBCUtils;

public class ProductDaoImp implements ProductDao {

	
	
	@Override
	public int findcount(int currnum) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT COUNT(*) FROM product ";//要加个cid;
		Long count=(Long) runner.query(sql,new ScalarHandler());
		//System.out.println(count);
		return count.intValue();
		
	}
	@Override
	public List<Product> findAll(int startIndex, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		String sql="SELECT *  FROM product LIMIT ?,?";
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		
		return runner.query(sql, new BeanListHandler<Product>(Product.class),startIndex,pageSize);
	}
	@Override
	public Product pro_info(String pid) throws SQLException {
		// TODO Auto-generated method stub
		String sql="SELECT *  FROM product WHERE pid = ?";
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		
		return (Product) runner.query(sql, new BeanHandler<Product>(Product.class), pid);
	}
	@Override
	public int findcount(String cid) throws SQLException{
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT COUNT(*) FROM product WHERE pflag=0 AND cid=?";//要加个cid;
		Long count=(Long) runner.query(sql,new ScalarHandler(),cid);
		//System.out.println(count);
		return count.intValue();
	}
	@Override
	public List<Product> findproBycid(String cid, int startIndex, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM product WHERE cid=? AND pflag = 0 LIMIT ?,?";
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		return runner.query(sql, new BeanListHandler<Product>(Product.class),cid,startIndex,pageSize);
	}

	@Override
	public List<Product> findnews() throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT * FROM product WHERE pflag=0 ORDER BY pdate DESC LIMIT 0 , 9 ";
		return runner.query(sql, new BeanListHandler<Product>(Product.class));
		
	}

	@Override
	public List<Product> findhots() throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT * FROM product WHERE pflag=0 AND is_hot=1 ORDER BY pdate DESC LIMIT 0 ,9 ";
		return runner.query(sql, new BeanListHandler<Product>(Product.class));
	}

}
