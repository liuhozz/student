package com.heima.ssh.Dao.Impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.heima.ssh.Dao.UserDao;
import com.heima.ssh.enty.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User where username=? and password=?", user.getUsername(),user.getPassword());
		if(list.size()>0)
			return list.get(0);
		return null;
	}

	
}
