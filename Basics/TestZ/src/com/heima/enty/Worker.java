package com.heima.enty;

/*
 * ����һ��Ա����(Worker),Ҫ��Ҫ����Щ����: ����(name),����(age),����(salary)
		  ��дhashCode������equals����
		  �ٶ���һ��������,����һ������,�洢���Ա������, ����.����.���ʶ���ͬ����Ϊ��ͬһ������, 
		  Ҫ�󼯺��е�Ԫ��Ҫ��֤Ψһ��.������������̨��.
 */
public class Worker {
	private String name;
	private int age;
	private int salary;
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Worker(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}
	
}
