package com.heima.ssh.service;

import com.heima.ssh.enty.User;

public interface UserService {

	User login(User user);

	void save(User user);
}
