package com.heima.store.dao.daoimp;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.heima.store.dao.CategoryDao;
import com.heima.store.enty.Category;
import com.heima.store.utils.JDBCUtils;

public class CategoryDaoImp implements CategoryDao {

	@Override
	public List<Category> findAll() throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT * FROM category";
		return runner.query(sql, new BeanListHandler<Category>(Category.class));
	}

}
