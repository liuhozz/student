package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Customer;

public interface CustomerDao {

	List<Customer> find();

	void save(Customer customer);
	
	Customer findcustByid(Long id);

	void update(Customer customer);

	void delcustByid(Long cust_id);
}
