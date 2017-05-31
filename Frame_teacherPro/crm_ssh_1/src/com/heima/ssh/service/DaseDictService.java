package com.heima.ssh.service;

import java.util.List;

import com.heima.ssh.enty.DaseDict;

public interface DaseDictService {

	
	
	List<DaseDict> findDictBytype_code(String dict_type_code);

}
