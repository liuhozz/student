package com.itheima.test3_系统题补充;

public class makeAbba_class {

	/**
	 ## 方法参数，严格按照顺序填写(多个用英文逗号隔开,全包名的类名) java.lang.String , int , boolean,  int[] 
[method.params]
java.lang.String,java.lang.String

## 方法返回值 (全包名的类名)  java.lang.String , int , boolean,  int[] 
[method.return]
java.lang.String

## 方法修饰符号(多个用英文逗号隔开)
[method.modifiers]
public

## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
ABBA

## 题目的描述  英文翻译
[description]
给定两个字符串a和b，返回将它们以abba的顺序放在一起的结果，<br/>
例如。 “Hi”和“Bye”返回"HiByeByeHi"。<br/>


## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
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
