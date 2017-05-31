package com.itheima.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.itheima.dao.CustomerDao;
import com.itheima.domain.Customer;
import com.itheima.utils.HibernateUtils;

@Repository("CustomerDaoImpl")
public class CustomerDaoImpl implements CustomerDao {

	
	
	@Override
	public void delcustByid(Long cust_id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.delete(session.get(Customer.class, cust_id));
		tx.commit();
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		session.update(customer);
		
		tx.commit();
	}

	@Override
	public Customer findcustByid(Long id) {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer = session.get(Customer.class, id);
		
		tx.commit();
		return customer;
	}

	@SuppressWarnings("unchecked")
	@Override
	// 查询客户的方法
	public List<Customer> find() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		List<Customer> list = session.createQuery("from Customer").list();
		
		tx.commit();
		return list;
	}

	@Override
	// 保存客户的方法
	public void save(Customer customer) {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		session.save(customer);
		
		tx.commit();
	}

}
