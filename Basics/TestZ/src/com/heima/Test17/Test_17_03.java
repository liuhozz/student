package com.heima.Test17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test_17_03 {

	/**
	 * ����¼��һ���ַ���, ������ַ���ת�ɴ�д��,Ȼ�������ַ����е������ַ���������, 
			Ҫ���ֵ�˳��������,���ұ����ظ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int num=o2.compareTo(o1);
				return num==0? 1:num;
			}
		});
		
		String s=sc.next();
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++){
			ts.add(s.valueOf(s.charAt(i)));
			
		}
		System.out.println(ts);
		
		
	}

}
