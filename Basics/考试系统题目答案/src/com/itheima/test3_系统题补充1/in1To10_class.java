package com.itheima.test3_系统题补充1;

public class in1To10_class {

	/**
	 ## 题目的描述  英文翻译
[description]
给定一个整型参数和一个boolean类型的“outsideMode”的两个参数，如果整型参数在1到10的范围内则返回true。<br/>
如果“outSideMode”为true时，那么整型参数应小于等于1或者大于等于10，就返回true，而在1到10之间返回false<br/>
## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(5, false) -> true	
(11, false) -> false	
(11, true) -> true	
(10, false) -> true
(10, true) -> true	
(9, false) -> true	
(9, true) -> false	
(1, false) -> true	
(1, true) -> true	
(0, false) -> false	
(0, true) -> true	
(-1, false) -> false	
	 */
	public static void main(String[] args) {
		System.out.println(in1To10(1, false));
		System.out.println(in1To10(1, true));
		System.out.println(in1To10(0, false));
		System.out.println(in1To10(0, true));
		System.out.println(in1To10(-1, false));
	}
	
	public static boolean in1To10(int i,boolean outsideMode){
		boolean b= false;
		if(i>1&&i<10){
			b = true;
		}else if(outsideMode && i<=1 || i>=10){
			b = true;
		}else if(outsideMode && i>1 && i<10){
			b = false;
		}
		return b;
	}
}
