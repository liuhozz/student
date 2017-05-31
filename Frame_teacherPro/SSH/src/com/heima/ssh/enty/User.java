package com.heima.ssh.enty;

import java.util.HashSet;
import java.util.Set;

public class User {

	/*uid	
	username
	nickname	昵称
	password	
	phoneCheckCode	
	checkCode		
	
	*/
	
	private Integer uid; 
	private String username;
	private String nickname;
	private String password;
	private String phoneCheckCode;
	private String checkCode;
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer uid, String username, String nickname, String password, String phoneCheckCode, String checkCode
			) {
		super();
		this.uid = uid;
		this.username = username;
		this.nickname = nickname;
		this.password = password;
		this.phoneCheckCode = phoneCheckCode;
		this.checkCode = checkCode;
		
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneCheckCode() {
		return phoneCheckCode;
	}

	public void setPhoneCheckCode(String phoneCheckCode) {
		this.phoneCheckCode = phoneCheckCode;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}


	
	
	
	
}
