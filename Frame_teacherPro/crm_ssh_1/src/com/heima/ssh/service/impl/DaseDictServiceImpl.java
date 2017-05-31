package com.heima.ssh.service.impl;

import java.util.List;

import com.heima.ssh.dao.DaseDictDao;
import com.heima.ssh.enty.DaseDict;
import com.heima.ssh.service.DaseDictService;

public class DaseDictServiceImpl implements DaseDictService {

	private DaseDictDao daseDictDao;
	
	public void setDaseDictDao(DaseDictDao daseDictDao) {
		this.daseDictDao = daseDictDao;
	}

	@Override
	public List<DaseDict> findDictBytype_code(String dict_type_code) {
		// TODO Auto-generated method stub
		
		return daseDictDao.findDictBytype_code(dict_type_code);
	}
}
