package com.heima.DaoImpl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.heima.Dao.LoginDao;
import com.heima.enty.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class LoginDaoImpl implements LoginDao {

	/**
	 * 判断用户是否存在于user表(判断用户是否登陆成功)
	 */
	@Override
	public User find(String username, String password) throws SQLException {
		QueryRunner runner=new QueryRunner(new ComboPooledDataSource());
		String sql="select * from user where username=? and password=?";
		User user = runner.query(sql, new BeanHandler<User>(User.class),username,password);
		
		return user;
	}

}
