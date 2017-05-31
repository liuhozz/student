package com.heima.ssh.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.heima.ssh.enty.Customer;
import com.heima.ssh.enty.DaseDict;

public interface CustomerDao {

	void save(Customer customer);

	List findBypage(DetachedCriteria detachedCriteria, Integer startIndex, Integer pageSize);

	Integer count(DetachedCriteria detachedCriteria);


}
