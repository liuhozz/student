package com.heima.Test17;

import java.util.HashSet;

import com.heima.enty.Worker;

public class Test_17_01 {

	/**
	 * 定义一个员工类(Worker),要求要有这些属性: 姓名(name),年龄(age),工资(salary)
		  重写hashCode方法和equals方法
		  再定义一个测试类,创建一个集合,存储多个员工对象, 姓名.年龄.工资都相同的认为是同一个对象, 
		  要求集合中的元素要保证唯一性.结果输出到控制台中.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Worker> hs=new HashSet<>();
		hs.add(new Worker("asf", 12, 123654));
		hs.add(new Worker("asf", 12, 123654));
		hs.add(new Worker("张三", 12, 123654));
		hs.add(new Worker("李四", 12, 12365));
		hs.add(new Worker("王五", 22, 123654));
		
		System.out.println(hs);
	}

}
