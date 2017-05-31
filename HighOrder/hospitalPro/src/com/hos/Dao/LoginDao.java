package com.hos.Dao;
import java.util.List;

import com.hos.beans.Login_user;

public interface LoginDao {
	public List<Login_user > find(String um ,String pw);
	public Boolean save(Login_user user, String um, String pw);
}
