package com.heima.store.dao.daoimp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.heima.store.dao.CategoryDao;
import com.heima.store.enty.Category;
import com.heima.store.utils.Hibernate_SessionUtils;

public class CategoryDaoImp implements CategoryDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> findAll() throws SQLException {
		// TODO Auto-generated method stub
		/*QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT * FROM category";
		return runner.query(sql, new BeanListHandler<Category>(Category.class));*/
		Session session=Hibernate_SessionUtils.getSession();
		Transaction tr = session.beginTransaction();
			List<Category> list = session.createQuery("FROM category").list();
		tr.commit();
		session.close();
		return list;
	}

}