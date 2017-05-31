package com.heima.DBCP_C3P0_JBDCUtils;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.heima.enty.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestDBCP {

	@Test
	public void Testconn() throws Exception{
		/*BasicDataSourceFactory dataSourceFactory=new BasicDataSourceFactory();
		Properties pro=new Properties();
		pro.load(this.getClass().getClassLoader().getResourceAsStream("dbcpconfig.properties"));
		DataSource ds = dataSourceFactory.createDataSource(pro);*/

//		ParameterMetaData 参数元数据
		
		
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		
		QueryRunner qr=new QueryRunner(cpds);
		List<User> list = qr.query("select * from stu", new BeanListHandler<User>(User.class));
		
		for (User user : list) {
			System.out.println(user);
		}
		
		
	}
}
