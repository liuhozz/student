package com.itheima.service.impl;

import java.util.List;

import com.itheima.dao.CustomerDao;
import com.itheima.dao.impl.CustomerDaoImpl;
import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void delcustByid(Long cust_id) {
		// TODO Auto-generated method stub
		CustomerDao dao = new CustomerDaoImpl();
		dao.delcustByid(cust_id);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		CustomerDao dao = new CustomerDaoImpl();
		dao.update(customer);
	}

	@Override
	public List<Customer> find() {
		// 调用DAO:
		CustomerDao customerDao = new CustomerDaoImpl();
		return customerDao.find();
	}

	@Override
	public Customer findcustByid(Long id) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
		return dao.findcustByid(id);
	}

	@Override
	// 业务层保存客户的方法
	public void save(Customer customer) {
		// 调用DAO:
		CustomerDao customerDao = new CustomerDaoImpl();
		customerDao.save(customer);
		
	}

}
