package com.heima.ssh.dao;

import java.util.List;

import com.heima.ssh.enty.DaseDict;

public interface DaseDictDao {

	List<DaseDict> findDictBytype_code(String dict_type_code);

}
