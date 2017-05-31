package com.heima.store.dao.daoimp;

import java.sql.SQLException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.heima.store.dao.UserDao;
import com.heima.store.enty.User;
import com.heima.store.utils.Hibernate_SessionUtils;
import com.heima.store.utils.MD5Utils;

public class UserDaoImp implements UserDao {

	Session session=Hibernate_SessionUtils.getSession();
	Transaction tr = session.beginTransaction();
	@Override
	public User login(User user) throws SQLException {
		// TODO Auto-generated method stub
		/*String sql="SELECT * FROM USER WHERE username=? AND password=?";
		QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String password=MD5Utils.md5(user.getPassword());
		runner.query(sql, new BeanHandler<User>(User.class),user.getUsername(),password)*/
		
		String hql="from User where username=? and password=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, user.getUsername());
		query.setParameter(1, MD5Utils.md5(user.getPassword()));
		User usere = (User) query.uniqueResult();
		
		tr.commit();
		session.close();
		return usere;
	}

	@Override
	public User activeuser(String code) throws SQLException {
		// TODO Auto-generated method stub
		String hql="from User where code=?";
		Query query = session.createQuery(hql);
		query.setParameter(0,code);
		User user = (User) query.uniqueResult();
		tr.commit();
		session.close();
		return user;
	}

	@Override
	public void updateuser(User user) throws SQLException {
		// TODO Auto-generated method stub
		/*String sql="update user set username=? , password=? ,name =? ,email=?, telephone =? ,birthday =? ,sex=? ,state=? ,code= ? where uid=?";
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
		runner.update(sql, args);*/
		session.update(user);
		
		
	}

	@Override
	public void useregister(User user) throws SQLException {
		/*QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
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
		runner.update(sql, args);*/
		session.save(user);

	}

	@Override
	public boolean chack(String username) throws SQLException {
		// TODO Auto-generated method stub
		boolean flag=false;
		/*QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
		String sql="SELECT count(*) FROM USER WHERE username = ?";
		long count=(long)runner.query(sql, new ScalarHandler() ,username);*/
		Long count=null;
		Query query = session.createQuery("SELECT count(*) FROM USERWHERE username = ?");
		query.setParameter(0, username);
		count = (Long) query.uniqueResult();
		
		if(count > 0)
			flag=true;
		tr.commit();
		session.close();
		return flag;
	}

}
