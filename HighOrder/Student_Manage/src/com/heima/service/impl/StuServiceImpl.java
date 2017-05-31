package com.heima.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.heima.Dao.StuDao;
import com.heima.DaoImpl.StuDaoImpl;
import com.heima.enty.Page;
import com.heima.enty.Student;
import com.heima.service.StuService;


public class StuServiceImpl implements StuService<Student> {

	/**
	 * 查找所有学生的service的实现
	 */
	@Override
	public List<Student> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return new StuDaoImpl().findAll();
	}

	/**
	 * 根据Id删除学生的service的实现
	 */
	@Override
	public void Delete(int sid) throws SQLException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		StuDao stu=new StuDaoImpl();
		stu.Delete(sid);
		
	}

	/**
	 * 插入学生信息的service的实现
	 */
	@Override
	public void Insert(Student stu) throws SQLException {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		StuDao studao=new StuDaoImpl();
		studao.Insert(stu);
	}

	/**
	 * 根据Id查找对应的学生信息的service的实现
	 */
	@Override
	public Student find(int sid) throws SQLException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unchecked")
		StuDao<Student> stu=new StuDaoImpl();
		
		return stu.find(sid);
	}

	@Override
	public void Updata(int id, Student stu) throws SQLException {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		StuDao<Student> stuu = new StuDaoImpl();
		stuu.Updata(id, stu);
		
	}

	
	@Override
	public List<Student> MoHufind(String name, String sex) throws SQLException {
		// TODO Auto-generated method stub
		
		return new StuDaoImpl().MoHufind(name, sex);
	}

	@Override
	public Page pagefind(int currentlypage) throws SQLException {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		StuDao<Student> stu = new StuDaoImpl();
		List<Student> list = stu.pagefind(currentlypage);
		int num=StuDao.PAGE_SIZE;
		int allnum=new StuDaoImpl().countpage();
		int allpage=(allnum%num==0?allnum/num:(allnum/num)+1);
		Page page = new Page(currentlypage, allpage, num, allnum, list);
		
		return page;
	}

}
