package com.heima.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.heima.Dao.UserDao;
import com.heima.enty.User;
import com.heima.util.JDBCUtil;

public class UserDaoImp implements UserDao {

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
	public List<?> findAll() {
		// TODO Auto-generated method stub
		ArrayList<User> list = new ArrayList<>();
		try {
			PreparedStatement ps = con("select * from user");
			rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getString("name"),
						rs.getString("password"),
						rs.getInt("phone"),
						rs.getString("username"));
				list.add(user);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			JDBCUtil.Over(conn,st,rs);
		}

		return list;
	}
	
	public User find(int id){
		try {
			PreparedStatement ps = con("select * from user where id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				User user = new User(rs.getString("name"),
						rs.getString("password"), rs.getInt("phone"),
						rs.getString("username"));
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
	public User Update(int id , String attname , String attvalue) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = con("update user set " + attname
					+ "=? where id=?");
			ps.setString(1,attvalue);
			ps.setInt(2, id);
			if(ps.executeUpdate()>0){
				User user = find(id);
				
				return user;
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
	public List<?> Delect(int id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = con("delete from user where id=?");
			ps.setInt(1, id);
			int jg = ps.executeUpdate();
			JOptionPane.showMessageDialog(null, jg);
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
	public String Insert(String username,String password,int phone,String name) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pt =con("insert into user values(null,?,?,?,?)");
			pt.setString(1, username);
			pt.setString(2, password);
			pt.setInt(3, phone);
			pt.setString(4, name);
			if (pt.executeUpdate() > 0) {
				return "插入成功";
			} else {
				return "插入失败";
			}

		} catch (Exception e) {
			return e.getMessage();
		} finally {
			JDBCUtil.Over(conn,st);
		}
		
	}

}