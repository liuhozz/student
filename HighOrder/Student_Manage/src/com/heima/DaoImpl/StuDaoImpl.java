package com.heima.DaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.heima.Dao.StuDao;
import com.heima.enty.Student;
import com.heima.util.JDBCUtil02;

@SuppressWarnings("rawtypes")
public class StuDaoImpl implements StuDao {

	/**
	 * 查找所有学生信息的具体实现
	 */
	@Override
	public List<Student> findAll() throws SQLException {
		QueryRunner runner=new QueryRunner(JDBCUtil02.getDaraSource());
		String sql="select * from stu";
		return runner.query(sql, new BeanListHandler<Student>(Student.class));
	}

	/**
	 * 依据Id查找对应学生的具体实现
	 */
	@Override
	public Student find(int sid) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtil02.getDaraSource());
		String sql="select * from stu where sid=?";
		return runner.query(sql, new BeanHandler<Student>(Student.class),sid);
		
	}

	/**
	 * 根据Id删除学生信息的具体实现
	 */
	@Override
	public void Delete(int sid) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtil02.getDaraSource());
		String sql="delete from stu where sid=?";
		runner.update(sql,sid);
		
	}

	/**
	 * 添加学生信息的具体实现
	 */
	@Override
	public void Insert(Student stu) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtil02.getDaraSource());
		String sql="insert into stu values(null , ?,?,?,?,?,?)";
		runner.update(sql,
				stu.getSname(),
				stu.getSex(),
				stu.getPhone(),
				stu.getBirthday(),
				stu.getHobby(),
				stu.getInfo()
				);
	}

	/**
	 * 根据Id修改学生信息
	 */
	@Override
	public void Updata(int id, Student stu) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtil02.getDaraSource());
		String sql="update stu set sname=? , sex=? , phone=? , birthday=? , hobby=? , info=? where sid = ?";
		runner.update(sql, 
				stu.getSname(),
				stu.getSex(),
				stu.getPhone(),
				stu.getBirthday(),
				stu.getHobby(),
				stu.getInfo(),
				id
				);
	}

	/**
	 * 模糊查询
	 */
	@Override
	public List<Student> MoHufind(String name, String sex) throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		QueryRunner runner=new QueryRunner(JDBCUtil02.getDaraSource());
		String sql="select * from stu where 1=1";
		
		if(name != null && name.length()!=0){
			sql += " and sname like ?";
			list.add("%"+name+"%");
		}
		if(sex != null && sex.length()!=0){
			sql += " and sex=?";
			list.add(sex);
		}
		
		List<Student> list2 = runner.query(sql, new BeanListHandler<Student>(Student.class),list.toArray());
		return list2;
		
	}

	/**
	 * 分页查询  传当前页数为参数  select * from stu limit ? offset ?(从第几条开始读)
	 */
	@Override
	public List<Student> pagefind(int currentlypage) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtil02.getDaraSource());
		String sql=" select * from stu limit ? offset ?";
		
		List<Student> list = runner.query(sql, new BeanListHandler<Student>(Student.class),PAGE_SIZE,(currentlypage-1)*PAGE_SIZE);
		
		return list;
	}

	/**
	 * 查询出学生表共有多少条记录
	 * @return
	 * @throws SQLException
	 */
	//ScalarHandler()
	@Override
	public int countpage() throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtil02.getDaraSource());
		String sql=" select count(*) from stu";
		Long count =(long) runner.query(sql, new ScalarHandler());
		
		return count.intValue();
	}

}
