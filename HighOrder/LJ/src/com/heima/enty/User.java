package com.heima.enty;

public class User{
	private int id;
	private String name;
	private String password;
	private String phone;
	private String usename;
	public User(int id, String name, String password, String phone, String usename) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.usename = usename;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", usename="
				+ usename + "]";
	}
	
	
	
	
	
	
	
}
