package com.heima.mybatis.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.heima.mybatis.pojo.Order;
import com.heima.mybatis.pojo.User;

import Mapper.UserMapper;

public class UserMapperTest {

	private ApplicationContext applicationContext;
	
	@Before
	public void init(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
	}
	
	@Test
	public void testGetUserById() {
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		User user = userMapper.getUserById(25);
		System.out.println(user);
	}

	@Test
	public void testGetUserByName() {
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		List<User> list = userMapper.getUserByName("张");
		for (User user : list) {
			System.out.println(user);
		}
		
	}

	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUsername("张小飞1");
		user.setSex("1");
		user.setAddress("飞机上空");
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		userMapper.insertUser(user);
	}
	
	@Test
	public void testgetUserByWhere() {
		User user = new User();
		user.setUsername("张");
		user.setSex("1");
		user.setAddress("飞机上空");
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		List<User> list = userMapper.getUserByWhere(user);
		for (User user2 : list) {
			System.out.println(user2);
		}
	}
	
	@Test
	public void testGetUserByIn(){
		
		User user = new User();
		user.setList(Arrays.asList(1,25,10,16));
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		List<User> list = userMapper.getUserByIn(user);
		for (User user2 : list) {
			System.out.println(user2);
		}
		
	}
	
	@Test
	public void testGetUserOrder(){
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		List<User> list = userMapper.getUserOrder();
		for (User user : list) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testGetOrderUser(){
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		List<Order> list = userMapper.getOrderUser();
		for (Order order : list) {
			System.out.println(order);
		}
	}

}
