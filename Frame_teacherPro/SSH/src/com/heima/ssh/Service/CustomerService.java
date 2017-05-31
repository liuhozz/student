package com.heima.ssh.Service;

import java.util.List;
import java.util.Set;

import org.hibernate.criterion.DetachedCriteria;

import com.heima.ssh.enty.Customer;
import com.heima.ssh.enty.User;

public interface CustomerService {

	List<Customer> findAll(DetachedCriteria detachedCriteria);

	List<User> findUser();

	void save(Customer customer);

	void del(Customer customer);

	Customer findByid(Integer cid);

	void update(Customer customer);


}
