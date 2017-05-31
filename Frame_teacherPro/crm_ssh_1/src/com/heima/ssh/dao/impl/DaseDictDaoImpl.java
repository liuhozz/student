package com.heima.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.heima.ssh.dao.DaseDictDao;
import com.heima.ssh.enty.DaseDict;

public class DaseDictDaoImpl extends HibernateDaoSupport implements DaseDictDao {

	public List<DaseDict> findDictBytype_code(String dict_type_code) {
		// TODO Auto-generated method stub
		String hql="from DaseDict where dict_type_code=?";
		List<DaseDict> list = (List<DaseDict>) this.getHibernateTemplate().find(hql, dict_type_code);
		return list;
	}
}
