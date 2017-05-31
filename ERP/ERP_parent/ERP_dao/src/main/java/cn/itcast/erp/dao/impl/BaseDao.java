package cn.itcast.erp.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itcast.erp.dao.IBaseDao;
import cn.itcast.erp.entity.Dep;

public class BaseDao<T> extends HibernateDaoSupport implements IBaseDao {
	
	public BaseDao(){
		
		
	}

	public List<Dep> findAll() {
		// TODO Auto-generated method stub
		return (List<Dep>) this.getHibernateTemplate().find("from Dep");
	}

	public List<Dep> findByCrata( Dep dep ,int page ,int rows) {
		// TODO Auto-generated method stub
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Dep.class);
		if(dep != null){
			if(dep.getName() != null && dep.getName().trim().length()>0){
				detachedCriteria.add(Restrictions.like("name", dep.getName(), MatchMode.ANYWHERE));
			}
			
			if(dep.getTele() != null && dep.getTele().trim().length()>0){
				detachedCriteria.add(Restrictions.like("tele", dep.getTele(), MatchMode.ANYWHERE));
			}
		}
		
		int firstpage = (page-1)*rows;
		return (List<Dep>) this.getHibernateTemplate().findByCriteria(detachedCriteria, firstpage, rows);
	}

	public Long getCount(Dep dep) {
		// TODO Auto-generated method stub
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Dep.class);
		if(dep != null){
			if(dep.getName() != null && dep.getName().trim().length()>0){
				detachedCriteria.add(Restrictions.like("name", dep.getName(), MatchMode.ANYWHERE));
			}
			
			if(dep.getTele() != null && dep.getTele().trim().length()>0){
				detachedCriteria.add(Restrictions.like("tele", dep.getTele(), MatchMode.ANYWHERE));
			}
		}
		detachedCriteria.setProjection(Projections.rowCount());
		return (Long) this.getHibernateTemplate().findByCriteria(detachedCriteria).get(0);
	}

	public void save(Dep dep) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(dep);
	}

	public void delete(long uuid) {
		// TODO Auto-generated method stub
		Dep dep = this.getHibernateTemplate().get(Dep.class, uuid);
		this.getHibernateTemplate().delete(dep);
	}

	public void update(Dep dep) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(dep);
	}

	public Dep getDep(long uuid) {
		// TODO Auto-generated method stub
		
		return this.getHibernateTemplate().get(Dep.class, uuid);
	}

}
