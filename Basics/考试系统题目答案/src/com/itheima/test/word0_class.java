package com.itheima.test;

import java.util.HashMap;
import java.util.Map;

public class word0_class {

	/**
	 49��Ŀ����:
  ��дһ���࣬����ΪItheima;

  ������һ��������������word0;

  ����һ���ַ������飬����һ��Map ��
��������ÿ����ͬ�ַ���Ϊkey��value����0.���磬�ַ�������["h","e","l","l","o"]����"h" "e" "l" "o"��ֵ��0��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Map<String,Integer> word0(String[] st){
		Map<String ,Integer> map = new HashMap<String, Integer>();
		for (String string : st) {
			map.put(string, 0);
		}
		return map;
	}
}
