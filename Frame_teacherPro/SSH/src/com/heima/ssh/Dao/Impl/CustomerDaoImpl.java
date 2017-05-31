package com.heima.ssh.Dao.Impl;

import java.util.List;
import java.util.Set;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.heima.ssh.Dao.CustomerDao;
import com.heima.ssh.enty.Customer;
import com.heima.ssh.enty.User;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public List<Customer> findAll(DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub
		
		return (List<Customer>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
		
	}

	@Override
	public List<User> findUser() {
		// TODO Auto-generated method stub
		
		return (List<User>) this.getHibernateTemplate().find("from User");
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(customer);
	}

	@Override
	public void del(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(customer);
		
	}

	@Override
	public Customer findByid(Integer cid) {
		// TODO Auto-generated method stub
		
		return this.getHibernateTemplate().get(Customer.class, cid);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(customer);
	}
	
	
	


	
	
	
}
