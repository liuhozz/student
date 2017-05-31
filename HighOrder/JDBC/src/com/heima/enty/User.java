package com.heima.enty;

public class User {
	private String name;
	private String password;
	private int phone;
	private String username;
	public User(String name, String password, int phone, String username) {
		super();
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.username = username;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", phone="
				+ phone + ", username=" + username + "]";
	}
	
	
}
