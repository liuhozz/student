package com.itheima.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.utils.HibernateUtils;

@Repository("UserDaoImpl")
public class UserDaoImpl implements UserDao {

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.openSession();
		Transaction tr=session.beginTransaction();
		String hql="from User where user_code=? and user_password=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, user.getUser_code());
		query.setParameter(1, user.getUser_password());
		List<User> list = query.list();
		User userr=null;
		if(list.isEmpty()){
			return userr;
		}
		userr=list.get(0);
		tr.commit();
		session.close();
		return userr;
	}

}
