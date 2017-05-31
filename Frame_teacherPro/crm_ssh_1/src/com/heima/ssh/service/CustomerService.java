package com.heima.ssh.service;

import org.hibernate.criterion.DetachedCriteria;

import com.heima.ssh.enty.Customer;
import com.heima.ssh.enty.PageModel;

public interface CustomerService {

	void save(Customer customer);

	PageModel findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize);

	


}
