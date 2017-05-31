package com.heima.Jredis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Jredisconn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getJredis();
		getJredispool();
	}
	
	public static void getJredis(){
		//获取连接对象
		Jedis j=new Jedis("192.168.106.128", 6379);
		//设置键值对
		j.set("name", "账单");
		//获取值
		String value=j.get("name");
		System.out.println(value);
		
	}
	
	public static void getJredispool(){
		//要记得要获取连接池的配置对象
		JedisPoolConfig config=new JedisPoolConfig();
		//获取最大连接数
		config.setMaxTotal(50);
		//获取最大空闲连接数
		config.setMaxIdle(20);
		//根据配置对象获取连接池对象
		JedisPool pool=new JedisPool(config,"192.168.106.128", 6379);
		//获取核心对象
		Jedis j = pool.getResource();
		j.set("name", "lisi(李四)");
		String value=j.get("name");
		System.out.println(value);
	}
	

}
