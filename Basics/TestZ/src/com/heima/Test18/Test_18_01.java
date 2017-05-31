package com.heima.Test18;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_18_01 {

	/**
	 * 	��һ���ַ�,������: String str="heima shi wo jia, Da Jia Yao Ai Hu Ta!";
		��д����,ͳ��ÿ���ַ���ֵĴ���, ����Ľ������: a(6) e(1) h(2) i(5) j(1) m(1) o(2) s(1) u(1) w(1) A(1) D(1) H(1) J(1) T(1) Y(1)
	 	˼·:
	 		��ͳ�Ƴ��ֵĴ���
	 		������
	 	�Ż�  :  ������TreeMap��  �����ͳ����ͬһ��Map������
	 	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="heima shi wo jia, Da Jia Yao Ai Hu Ta!";
		//Dome1(str);
		TreeMap<Character, Integer> tm=new TreeMap<>(new Comparator<Character>() {
			@Override
			public int compare(Character o1, Character o2) {
				if(o1>='a'&&o1<='z'){
					o1=(char) (o1-60);
				}
				if(o2>='a'&&o2<='z'){
					o2=(char) (o2-60);
				}
				int num=o1-o2;
				return  num;
			}
		});
		char[] ch = str.toCharArray();
		for (Character c : ch) {
			if(Character.isLetter(c)||Character.isDigit(c))
			{
			tm.put(c, !tm.containsKey(c)?1:tm.get(c)+1);
			}
		}
		StringBuilder sb=new StringBuilder();
		for (Character c : tm.keySet()) {
			sb.append(c).append("(").append(tm.get(c)).append(") ,");
		}
		String s=sb.substring(0, sb.length()-1);
		System.out.println(s);
	}

	public static void Dome1(String str) {
		HashMap<Character, Integer> hm=new HashMap<>();
		TreeSet<Character> ts=new TreeSet<>(new Comparator<Character>() {
			@Override
			public int compare(Character o1, Character o2) {
				if(o1>='a'&&o1<='z'){
					o1=(char) (o1-60);
				}
				if(o2>='a'&&o2<='z'){
					o2=(char) (o2-60);
				}
				int num=o1-o2;
				return  num;
			}
		});
		char[] ch = str.toCharArray();
		for (Character c : ch) {
			if(Character.isLetter(c)||Character.isDigit(c))
			{
			hm.put(c, !hm.containsKey(c)?1:hm.get(c)+1);
			ts.add(c);
			}
		}
		StringBuilder sb=new StringBuilder();
		for (Character c : ts) {
			sb.append(c).append("(").append(hm.get(c)).append(") ,");
		}
		String s=sb.substring(0, sb.length()-1);
		System.out.println(s);
	}

}
