package com.heima.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heima.ssm.mapper.SUserMapper;
import com.heima.ssm.pojo.SUser;

@Service
public class LoginServiceImpl implements com.heima.ssm.service.LoginService {

	@Autowired
	private SUserMapper userMapper;
	
	
	public SUser login(SUser user) {
		// TODO Auto-generated method stub
		SUser loginUser = userMapper.login(user);
		return loginUser;
	}

	
}
