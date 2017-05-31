package com.heima.Dao;

import java.sql.SQLException;
import java.util.List;

import com.heima.enty.Student;

public interface StuDao<T> {
	
	static int PAGE_SIZE=5;
	/**
	 * 查找所有学生信息
	 * @return
	 * @throws SQLException
	 */
	List<T> findAll() throws SQLException;

	/**
	 * 依据Id查找对应的学生信息
	 * @param sid
	 * @return
	 * @throws SQLException
	 */
	T find(int sid) throws SQLException;
	
	/**
	 * 根据Id删除学生信息
	 * @param sid
	 * @throws SQLException
	 */
	void Delete(int sid) throws SQLException;
	
	/**
	 * 添加学生信息
	 * @param stu
	 * @throws SQLException
	 */
	void Insert(Student stu) throws SQLException;
	
	/**
	 * 根据Id修改学生信息
	 * @param id
	 * @param stu
	 * @throws SQLException
	 */
	void Updata(int id,Student stu) throws SQLException;
	
	/**
	 * 模糊查询
	 * @param name
	 * @param sex
	 * @return
	 * @throws SQLException
	 */
	List<T> MoHufind(String name, String sex) throws SQLException;
	
	/**
	 * 分页查询  传当前页数为参数  select * from stu limit ? offset ?(从第几条开始读)
	 * @param dqpage
	 * @return
	 * @throws SQLException
	 */
	List<T> pagefind(int currentlypage) throws SQLException;
	
	/**
	 * 查询出学生表共有多少条记录
	 * @return
	 * @throws SQLException
	 */
	int countpage() throws SQLException;
}
