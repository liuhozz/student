package cn.itcast.erp.dao;

import java.util.List;

import cn.itcast.erp.entity.Dep;

public interface IBaseDao<T> {

	/**
	 * 查询所有
	 * @return
	 */
	List<Dep> findAll();
	
	/**
	 * 分页查询和模糊查询
	 * @param detachedCriteria
	 * @param dep
	 * @param page
	 * @param rows
	 * @return
	 */
	List<Dep> findByCrata( Dep dep ,int page ,int rows);
	
	/**
	 * 查询总记录数
	 * @param dep
	 * @return
	 */
	Long getCount(Dep dep);
	
	/**
	 * 保存部门
	 * @param dep
	 */
	void save(Dep dep);
	
	/**
	 * 删除部门
	 * @param uuid
	 */
	void delete(long uuid);
	
	/**
	 * 修改部门
	 * @param dep
	 */
	void update(Dep dep);
	
	/**
	 * 根据id查询部门
	 * @param uuid
	 * @return
	 */
	Dep getDep(long uuid);
}
