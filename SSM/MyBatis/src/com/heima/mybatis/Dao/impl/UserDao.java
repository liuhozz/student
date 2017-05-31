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
	 *  1.namespace�����ǽӿڵ�ȫ·����
		2.�ӿڵķ�����������ӳ���ļ���sql idһ��
		3.�ӿڵ��������������ӳ���ļ���parameterType����һ��
		4.�ӿڵķ������ͱ�����ӳ���ļ���resultType����һ��
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
		//��������
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
		//��ȡ�����ļ�   ��֮ת����������   ͨ�������󴴽�����     �õ���mybatis�еĹ�����
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = factoryBuilder.build(inputStream);
		
		//�����Ự
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//�Ựִ�ж����ݿ�Ĳ���
		User user = sqlSession.selectOne("getUserById",1);
		System.out.println(user);
		sqlSession.close();
	}
}
