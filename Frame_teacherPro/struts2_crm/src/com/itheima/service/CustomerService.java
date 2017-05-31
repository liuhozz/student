package com.itheima.service;

import java.util.List;

import com.itheima.domain.Customer;

public interface CustomerService {
	public List<Customer> find();

	public void save(Customer customer);	
	
	public Customer findcustByid(Long id);

	public void update(Customer customer);

	public void delcustByid(Long cust_id);
	
}
