package com.heima.tests;

import java.util.ArrayList;
import java.util.Collections;

public class Test01 {

	/**
	 *����:��һ�������д洢���������ظ����ַ���,����һ������,��������(�ֵ�˳��),���һ�����ȥ���ظ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str=new ArrayList<>();
		str.add("mdds");
		str.add("tgkd");
		str.add("qeg");
		str.add("wx");
		str.add("asf");
		str.add("asf");
		str.add("asf");
		
		px(str);
		System.out.println(str);
		
	}

	public static void px(ArrayList<String> str) {
		// TODO Auto-generated method stub
		Collections.sort(str);
		
	}
	
	

}
