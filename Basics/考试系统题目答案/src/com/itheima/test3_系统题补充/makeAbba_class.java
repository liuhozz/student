package com.itheima.test3_ϵͳ�ⲹ��;

public class makeAbba_class {

	/**
	 ## �����������ϸ���˳����д(�����Ӣ�Ķ��Ÿ���,ȫ����������) java.lang.String , int , boolean,  int[] 
[method.params]
java.lang.String,java.lang.String

## ��������ֵ (ȫ����������)  java.lang.String , int , boolean,  int[] 
[method.return]
java.lang.String

## �������η���(�����Ӣ�Ķ��Ÿ���)
[method.modifiers]
public

## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
ABBA

## ��Ŀ������  Ӣ�ķ���
[description]
���������ַ���a��b�����ؽ�������abba��˳�����һ��Ľ����<br/>
���硣 ��Hi���͡�Bye������"HiByeByeHi"��<br/>


## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
[test.suits]
("Hi", "Bye") -> "HiByeByeHi"
("Yo", "Alice") -> "YoAliceAliceYo"
("What", "Up") -> "WhatUpUpWhat"
("aaa", "bbb") -> "aaabbbbbbaaa"
("x", "y") -> "xyyx"
("x", "") -> "xx"
("", "y") -> "yy"
("Bo", "Ya") -> "BoYaYaBo"
("Ya", "Ya") -> "YaYaYaYa"

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeAbba("aaa", "bbb"));
		System.out.println(makeAbba("x", ""));
		System.out.println(makeAbba("", "y"));
		System.out.println(makeAbba("Bo", "Ya"));
		System.out.println(makeAbba("Ya", "Ya"));
	}
	
	public static String makeAbba(String s1,String s2){
		if(s1==""){
			return s2+s2;
		}
		if(s2==""){
			return s1+s1;
		}
		return s1+s2+s2+s1;
		
	}
}
