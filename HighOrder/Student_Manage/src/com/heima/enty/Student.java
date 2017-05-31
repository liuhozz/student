package com.heima.enty;

import java.util.Date;

public class Student {

	private int sid;
	private String sname;
	private String sex;
	private String phone;
	private Date birthday;
	private String hobby;
	private String info;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String sex, String phone, Date birthday, String hobby, String info) {
		super();
		this.sname = sname;
		this.sex = sex;
		this.phone = phone;
		this.birthday = birthday;
		this.hobby = hobby;
		this.info = info;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", phone=" + phone + ", birthday="
				+ birthday + ", hobby=" + hobby + ", info=" + info + "]";
	}
	
	
}
