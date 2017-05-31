package com.heima.ssh.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.heima.ssh.dao.CustomerDao;
import com.heima.ssh.enty.Customer;
import com.heima.ssh.enty.DaseDict;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	/* (non-Javadoc)
	 * @see com.heima.ssh.dao.CustomerDao#save(com.heima.ssh.enty.Customer)
	 */
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(customer);
	}

	@Override
	public List findBypage(DetachedCriteria detachedCriteria, Integer startIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		detachedCriteria.setProjection(null);
		return this.getHibernateTemplate().findByCriteria(detachedCriteria, startIndex, pageSize);
	}

	@Override
	public Integer count(DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub
		detachedCriteria.setProjection(Projections.rowCount());
		List<Long> list = (List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return null;
	}

	
	

	
}
