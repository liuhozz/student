package com.heima.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.heima.enty.User;
import com.heima.util.JDBCUtil;

public class UserDaoImp implements com.heima.dao.UserDao {

	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	
	public PreparedStatement con(String sql){
		
		try {
			conn = JDBCUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			return ps;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		ArrayList<User> list = new ArrayList<>();
		try {
			PreparedStatement ps = con("select * from user");
			rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("password"),
						rs.getString("phone"),
						rs.getString("usename"));
				list.add(user);
			}
			/*Collections.sort(list,new Comparator<User>() {

				@Override
				public int compare(User o1, User o2) {
					// TODO Auto-generated method stub
					
					return o1.getId()>o2.getId()?1:-1;
				}
				
			});*/
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			JDBCUtil.Over(conn,st,rs);
		}
		return list;
	}
	
	public User find(String usename , String password){
		try {
			PreparedStatement ps = con("select * from user where usename=? and password = ?");
			ps.setString(1, usename);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				User user = new User(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("password"),
						rs.getString("phone"),
						rs.getString("usename"));
				
				return user;
			}
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally {
			JDBCUtil.Over(conn,st,rs);
		}
		
	}

	@Override
	public boolean Update(String usename , User user) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = con("update user set usename=?,password=?,phone=?,name=? where usename=?");
			ps.setString(1,user.getUsename());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getPhone());
			ps.setString(4, user.getName());
			ps.setString(5, usename);
			if(ps.executeUpdate()>0){
				return true;
			}
				return false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally {
			JDBCUtil.Over(conn,st);
		}
		
	}

	@Override
	public List<?> Delect(String usename) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = con("delete from user where usename=?");
			ps.setString(1, usename);
			int jg = ps.executeUpdate();
			if(jg>0){
				return findAll();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			JDBCUtil.Over(conn,st);
		}
		return null;
	}

	@Override
	public boolean Insert(String username,String password,String phone,String name) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pt =con("insert into user values(null,?,?,?,?)");
			pt.setString(1, username);
			pt.setString(2, password);
			pt.setString(3, phone);
			pt.setString(4, name);
			if (pt.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.Over(conn,st);
		}
		
	}

}
