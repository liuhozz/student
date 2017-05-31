package com.heima.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.heima.enty.Person;

public class Test05 {

	/**
	 *  1、从键盘中录入3个人的信息（姓名、年龄、性别、电话、住址）
		2、定义一个方法将键盘录入的信息封装成Person对象，把对象存储在集合中。
		3、使用两种遍历方式遍历打印集合中的对象
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请录入信息:   (格式为:姓名,年龄,性别,电话,住址;以回车为分隔;quit结束)");
		
		ArrayList<Person> per=new ArrayList<>();
		
		while(true){
			String input=sc.next();
			if(!input.equals("quit")){
			String [] s=input.split(",");
			per.add(new Person(s[0], s[2], s[3], s[4], Integer.parseInt(s[1])));
			
			}
			else{
				break;
			}
		}
		
		for (Person person : per) {
			System.out.println(person);
		}
		System.out.println("-------------------------------------------");
		
		Iterator<Person> it=per.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
