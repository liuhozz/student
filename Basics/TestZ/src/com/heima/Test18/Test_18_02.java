package com.heima.Test18;

import java.util.HashMap;

public class Test_18_02 {

	/**
	 * �����������󣬲��ô���ʵ�֣�
	(1)ͳ��ÿ�����ʳ��ֵĴ���
	(2)�������ַ���"If you want to change your fate I think you must come to the dark horse to learn java"(�ÿո���)
	(3)��ӡ��ʽ��
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