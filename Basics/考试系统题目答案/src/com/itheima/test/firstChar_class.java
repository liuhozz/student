package com.itheima.test;

import java.util.HashMap;
import java.util.Map;

public class firstChar_class {

	/**
	 *53 ��дһ���࣬����ΪItheima;
	  ������һ��������������firstChar;
	  ����һ���ǿ��ַ������飬Ϊÿ����ͬ�ĵ�һ���ַ�����һ��Map ��
	��Ϊ�ַ������׸��ַ���ֵΪ���иü��׸��ַ��������ַ�������׷�ӣ����磺["salt","tea","soda","toast"]�ַ�������
	���ؽ����{��t��:"teatoast","s":"saltsoda"}�����ǲ�ͬ�ַ������׸��ַ���ֵ�ǰ������������е�˳��׷����һ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstChar(new String[]{"salt","tea","soda","toast"}));
	}
	
	public static Map<String,String> firstChar(String[] arr){
		HashMap<String, String> hm = new HashMap<String, String>();
		for (String string : arr) {
			hm.put(string.charAt(0)+"", !hm.containsKey(string.charAt(0)+"")?string:string+hm.get(string.charAt(0)+""));
		}
		
		return hm;
		
	}

}
