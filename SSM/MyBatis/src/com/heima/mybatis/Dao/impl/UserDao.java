package com.heima.mybatis.Dao.impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.heima.mybatis.Dao.IUserDao;
import com.heima.mybatis.pojo.User;

public class UserDao implements IUserDao {

	
	
	/**
	 *  1.namespace必需是接口的全路径名
		2.接口的方法名必需与映射文件的sql id一致
		3.接口的输入参数必需与映射文件的parameterType类型一致
		4.接口的返回类型必须与映射文件的resultType类型一致
	 */
	
	
	
	@Override
	
	public void getUserById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = factoryBuilder.build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		User user = sqlSession.selectOne("getUserById",id);
		System.out.println(user);
	}

	@Test
	public void TestSelect () throws Exception{
		// TODO Auto-generated method stub
		//创建工厂
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
		//读取配置文件   将之转换成流对象   通过流对象创建工厂     用的是mybatis中的工具类
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = factoryBuilder.build(inputStream);
		
		//创建会话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//会话执行对数据库的操作
		User user = sqlSession.selectOne("getUserById",1);
		System.out.println(user);
		sqlSession.close();
	}
}
