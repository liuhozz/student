package com.heima.ssh.Service.Impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.heima.ssh.Dao.CustomerDao;
import com.heima.ssh.Service.CustomerService;
import com.heima.ssh.enty.Customer;
import com.heima.ssh.enty.User;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> findAll(DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub
		return customerDao.findAll(detachedCriteria);
	}

	@Override
	public List<User> findUser() {
		// TODO Auto-generated method stub
		
		return customerDao.findUser();
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.save(customer);
	}

	@Override
	public void del(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.del(customer);
	}

	@Override
	public Customer findByid(Integer cid) {
		
		return customerDao.findByid(cid);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.update(customer);
	}
	
	
	
}
