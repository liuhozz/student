package com.heima.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.heima.ssh.dao.UserDao;
import com.heima.ssh.enty.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		String hql="from User where user_code=? and user_password=?";
		List<User> list = (List<User>) this.getHibernateTemplate().find(hql,user.getUser_code(),user.getUser_password());
		if(list.isEmpty())
			return null;
		return list.get(0);
	}

	

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}

	
	
	
}
