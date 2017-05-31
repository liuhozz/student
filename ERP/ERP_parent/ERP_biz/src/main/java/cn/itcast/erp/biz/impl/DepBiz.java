package cn.itcast.erp.biz.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.itcast.erp.biz.IDepBiz;
import cn.itcast.erp.dao.IDepDao;
import cn.itcast.erp.entity.Dep;

public class DepBiz implements IDepBiz {

	private IDepDao depDao;
	
	public void setDepDao(IDepDao depDao) {
		this.depDao = depDao;
	}

	@Override
	public List<Dep> findAll() {
		// TODO Auto-generated method stub
		
		return depDao.findAll();
	}

	@Override
	public List<Dep> findByCrata(Dep dep, int page, int rows) {
		// TODO Auto-generated method stub
		return depDao.findByCrata(dep, page, rows);
	}

	@Override
	public Long getCount(Dep dep) {
		// TODO Auto-generated method stub
		return depDao.getCount(dep);
	}

	@Override
	public void save(Dep dep) {
		// TODO Auto-generated method stub
		depDao.save(dep);
	}

	@Override
	public void delete(long uuid) {
		// TODO Auto-generated method stub
		depDao.delete(uuid);
	}

	@Override
	public void update(Dep dep) {
		// TODO Auto-generated method stub
		depDao.update(dep);
	}

	@Override
	public Dep getDep(long uuid) {
		// TODO Auto-generated method stub
		
		return depDao.getDep(uuid);
	}

	
	
	
	
}
