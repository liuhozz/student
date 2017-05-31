package com.itheima.test3_系统题补充;

public class without2_class {

	/**
	 ## 题目的描述  英文翻译
[description]
给定一个字符串，如果一个长度为2的子字符串出现在它的开始和结束，返回一个字符串，<br/>
没有子串在开头，所以“HelloHe”产生“lloHe”。 子串可能与自身重叠，因此“Hi”产生“”。 <br/>
否则，返回原始字符串不变。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
("HelloHe") -> "lloHe"
("HelloHi") -> "HelloHi"
("Hi") -> ""
("Chocolate") -> "Chocolate"
("xxx") -> "x"
("xx") -> ""
("x") -> "x"
("") -> ""
("Fruits") -> "Fruits"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(without2("Fruits"));
		System.out.println(without2(""));
		System.out.println(without2("x"));
		System.out.println(without2("xx"));
		System.out.println(without2("xxx"));
		System.out.println(without2("HelloHe"));
	}
	
	public static String without2(String str){
		if(str=="" || str.length()==2){
			return " \"\" ";
		}
		if(str.length()==1){
			return str;
		}
		String new_start = str.substring(0, 2);
		String new_end = str.substring(str.length()-2);
		if(new_start.equals(new_end)){
			return str.substring(2);
		}
		return str;
	}
}
