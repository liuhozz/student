package com.heima.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
	static Connection conn;
	static String name;
	static String url;
	static String password;
	static String driverClass;
	static{
		Properties properties=new Properties();
		try {
			
			properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("JDBC.properties"));
			name = properties.getProperty("name");
			url=properties.getProperty("url");
			password=properties.getProperty("password");
			driverClass=properties.getProperty("driverClass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//注册驱动 & 创建连接
	public static Connection getConnection(){
		try {
			
			Class.forName(driverClass);//加载驱动
			conn = DriverManager.getConnection(url, name, password);//获取连接对象
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return conn;
	}
	
	public static void Over(Connection conn,Statement st,ResultSet rs){
		Ovreconn(conn);
		Ovrest(st);
		Overrs(rs);
	}
	public static void Over(Connection conn,Statement st){
		Ovreconn(conn);
		Ovrest(st);
	}
	
	private static void Ovreconn(Connection conn){
		try {
			if(conn!=null){
			conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			conn=null;
		}
	}
	private static void Ovrest(Statement st){
		try {
			if(st!=null){
				st.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			st=null;
		}
	}
	private static void Overrs(ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rs=null;
		}
	}
}