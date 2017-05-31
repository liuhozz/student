package com.heima.Test18;

import java.util.HashMap;

public class Test_18_02 {

	/**
	 * 分析以下需求，并用代码实现：
	(1)统计每个单词出现的次数
	(2)有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
	(3)打印格式：
		to=3
  		think=1
  		you=2
  		....
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="If you want to change your fate I think you must come to the dark horse to learn java";
		String [] arr=s.split(" ");
		HashMap<String, Integer> hm=new HashMap<>();
		for (String str : arr) {
			hm.put(str, !hm.containsKey(str)?1:hm.get(str)+1);
		}
		
		for (String h : hm.keySet()) {
			System.out.println(h+"="+hm.get(h));
		}
		
	}

}
