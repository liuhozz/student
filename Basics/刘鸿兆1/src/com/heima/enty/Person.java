package com.heima.enty;

/*
 * 姓名、年龄、性别、电话、住址
 */
public class Person {
	private String name ,sex,phone ,adress;
	private int age;
	public Person(String name, String sex, String phone, String adress, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.adress = adress;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", phone=" + phone
				+ ", adress=" + adress + ", age=" + age + "]";
	}
	
	
	
}
