package com.itheima.test;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

	/**
	 6.题目描述:
  书写一个工具类，类名为ListUtils;
要求:
  1. 书写getSame方法，接收两个List<Integer>类型的参数，要求方法获取两个集合相同的元素，将结果按照List<Integer>返回。
    例如: 传入的集合1为[1 2 3 4 5]，集合2为[3 4 5 6 7]，返回的的集合为[3 4 5]
  2. 书写getDiff方法，接收两个List<Integer>类型的参数，要求方法获取两个集合不同的元素，将结果按照List<Integer>返回。
    例如: 传入的集合1为[1 2 3 4 5]，集合2为[3 4 5 6 7]，返回的的集合为[1 2 6 7]
	 */
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		List<Integer> list2 = new ArrayList();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
//		List<Integer> list = getSame(list1,list2);
//		System.out.println(list);
		List<Integer> newlist = getDiff(list1,list2);
		System.out.println(newlist);
		
		
		

	}
	
	public static List<Integer> getSame(List<Integer> list1,List<Integer> list2){
		list1.retainAll(list2);
		return list1;
	}
	
	public static List<Integer> getDiff(List<Integer> list1,List<Integer> list2){
		List<Integer> newlist1 = new ArrayList();
		List<Integer> newlist2 = new ArrayList();
		newlist1.addAll(list1);
		list1.removeAll(list2);
		newlist2.addAll(list1);
		list2.removeAll(newlist1);
		newlist2.addAll(list2);
		
		return newlist2;
	}
}
