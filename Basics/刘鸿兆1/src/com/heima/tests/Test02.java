package com.heima.tests;

import java.util.Scanner;
import java.util.TreeSet;

public class Test02 {

	/**
	 * ���󣺴Ӽ��̽���һ���ַ���, ��������������ַ���������,
		�����������: helloitcast�����ӡ:acehillostt
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		TreeSet<Character> ts=new TreeSet<>();
		for (int i=0;i<input.length();i++){
			ts.add(input.charAt(i));
		}
		
		for (Character c : ts) {
			System.out.print(c);
		}
	}

}
