package com.heima.store.service.serviceimp;

import java.sql.SQLException;

import com.heima.store.dao.UserDao;
import com.heima.store.dao.daoimp.UserDaoImp;
import com.heima.store.enty.User;
import com.heima.store.service.UserService;

public class UserServiceImp implements UserService {

	@Override
	public User login(User user) throws SQLException {
		// TODO Auto-generated method stub
		UserDao dao=new UserDaoImp();
		User user02=dao.login(user);
		//JOptionPane.showMessageDialog(null, user02);
		if(user02 !=null){
			if("1".equals(user02.getState())){
				//登陆成功
				return user02;
			}
		}
		return null;
	}

	@Override
	public boolean activeuser(String code) throws SQLException {
		// TODO Auto-generated method stub
		boolean flag=false;
		UserDao dao=new UserDaoImp();
		User user = dao.activeuser(code);
		if(user != null){
			user.setCode(null);
			user.setState("1");
			dao.updateuser(user);
			flag=true;
		}
		return flag;
	}

	@Override
	public void useregister(User user) throws SQLException {
		// TODO Auto-generated method stub
		UserDao dao=new UserDaoImp();
		dao.useregister(user);
	}

	@Override
	public boolean chack(String username) throws SQLException {
		// TODO Auto-generated method stub
		UserDao dao=new UserDaoImp();
		
		return dao.chack(username);
	}

}
