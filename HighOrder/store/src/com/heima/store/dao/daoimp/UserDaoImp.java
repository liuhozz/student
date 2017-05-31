package com.heima.store.dao.daoimp;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.heima.store.dao.UserDao;
import com.heima.store.enty.User;
import com.heima.store.utils.Hibernate_SessionUtils;
import com.heima.store.utils.JDBCUtils;
import com.heima.store.utils.MD5Utils;

public class UserDaoImp implements UserDao {

	@Override
	public User login(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM USER WHERE username=? AND password=?";
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String password=MD5Utils.md5(user.getPassword());
		
		Session session=Hibernate_SessionUtils.getSession();
		Transaction tr = session.beginTransaction();
		String hql="from User where username=? and password=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, user.getUsername());
		query.setParameter(1, MD5Utils.md5(user.getPassword()));
		User usere = (User) query.uniqueResult();
		System.out.println(usere);
		tr.commit();
		session.close();
		return runner.query(sql, new BeanHandler<User>(User.class),user.getUsername(),password);
	}

	@Override
	public User activeuser(String code) throws SQLException {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM USER WHERE code=?";
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		return runner.query(sql, new BeanHandler<User>(User.class),code);
	}

	@Override
	public void updateuser(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql="update user set username=? , password=? ,name =? ,email=?, telephone =? ,birthday =? ,sex=? ,state=? ,code= ? where uid=?";
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		Object[] args={ user.getUsername(),
						user.getPassword(),
						user.getName(),
						user.getEmail(),
						user.getTelephone(),
						user.getBirthday(),
						user.getSex(),
						user.getState(),
						user.getCode(),
						user.getUid()
				};
		runner.update(sql, args);
		
	}

	@Override
	public void useregister(User user) throws SQLException {
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="INSERT INTO USER VALUES (?,?,?,?,?,?,?,?,?,?)";
		Object[] args={ user.getUid(),
						user.getUsername(),
						MD5Utils.md5(user.getPassword()) ,
						user.getName(),
						user.getEmail(),
						user.getTelephone(),
						user.getBirthday(),
						user.getSex(),
						user.getState(),
						user.getCode()
						};
		runner.update(sql, args);

	}

	@Override
	public boolean chack(String username) throws SQLException {
		// TODO Auto-generated method stub
		boolean flag=false;
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT count(*) FROM USER WHERE username = ?";
		long count=(long)runner.query(sql, new ScalarHandler() ,username);
		if(count > 0)
			flag=true;
		return flag;
	}

}
