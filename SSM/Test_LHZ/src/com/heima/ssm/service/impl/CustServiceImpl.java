package com.heima.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heima.ssm.mapper.SCustMapper;
import com.heima.ssm.pojo.SCust;
import com.heima.ssm.service.CustService;

@Service
public class CustServiceImpl implements CustService {
	
	@Autowired
	private SCustMapper custMapper;

	public List<SCust> getList() {
		// TODO Auto-generated method stub
		List<SCust> list = custMapper.list();
		for (SCust sCust : list) {
			System.out.println(sCust);
		}
		return list;
	}

	public void delCust(Integer id) {
		// TODO Auto-generated method stub
		custMapper.deleteByPrimaryKey(id);
	}

	
	
}
