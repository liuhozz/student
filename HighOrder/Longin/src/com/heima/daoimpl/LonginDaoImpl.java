package com.heima.daoimpl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.heima.dao.LonginDao;
import com.heima.enty.User;
import com.heima.utils.DataSourceUtils;

public class LonginDaoImpl implements LonginDao {

	@Override
	public User find(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner =new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where username=? and password=?";
		return runner.query(sql, new BeanHandler<User>(User.class), username,password);
	}

	@Override
	public void insert(User user) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner =new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into user values(null ,?,?,?,?,?)";
		runner.update(sql, 
				user.getUsername(),
				user.getPassword(),
				user.getEmail(),
				user.getSex(),
				user.getBirthday()
				);

	}

	@Override
	public boolean findUser(String username) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner =new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select count(*) from user where username=?";
		long count = (long) runner.query(sql, new ScalarHandler(), username);
		if(count>0)
			return true;
		return false;
	}

}
