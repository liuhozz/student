package com.heima.ssm.service;

import java.util.List;

import com.heima.ssm.pojo.SCust;

public interface CustService {

	List<SCust> getList();
	
	void delCust(Integer id);
}
