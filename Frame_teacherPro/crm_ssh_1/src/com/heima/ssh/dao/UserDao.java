package com.heima.ssh.dao;

import com.heima.ssh.enty.User;

public interface UserDao {

	User login(User user);

	void save(User user);

}
