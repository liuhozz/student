package com.heima.ssh.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.heima.ssh.dao.CustomerDao;
import com.heima.ssh.enty.Customer;
import com.heima.ssh.enty.DaseDict;
import com.heima.ssh.enty.PageModel;
import com.heima.ssh.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;

	/**
	 * @param customerDao the customerDao to set
	 */
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	/* (non-Javadoc)
	 * @see com.heima.ssh.service.CustomerService#save(com.heima.ssh.enty.Customer)
	 * 页面有一个控件的name属性是跟模型驱动里面的一样   在action中又用了属性驱动 有set方法  会怎么样
	 * 文档注释可以再哪里设置
	 */
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.save(customer);
	}

	@Override
	public PageModel findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize) {
		// TODO Auto-generated method stub
		Integer totalRecords = customerDao.count(detachedCriteria);
		
		PageModel pageModel = new PageModel(currPage, totalRecords, pageSize);
		pageModel.setList(customerDao.findBypage(detachedCriteria, pageModel.getStartIndex(), pageSize));
		return pageModel;
	}

	

	
	

	
	
	

	
	
	

}
