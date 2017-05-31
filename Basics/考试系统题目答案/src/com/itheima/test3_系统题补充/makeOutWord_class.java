package com.itheima.test3_系统题补充;

public class makeOutWord_class {

	/**
	 
## 题目的描述  英文翻译
[description]

给定一个“out”字符串长度4，例如“<< >>”和一个单词，返回一个新的字符串，<br/>
其中单词在out字符串的中间，例如。 “<< word >>”。 注意：使用str.substring（i，j）<br/>
提取从索引i开始的字符串，直到但不包括索引j。<br/>


## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
("<<>>", "Yay") -> "<<Yay>>"
("<<>>", "WooHoo") -> "<<WooHoo>>"
("[[]]", "word") -> "[[word]]"
("HHoo", "Hello") -> "HHHellooo"
("abyz", "YAY") -> "abYAYyz"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeOutWord("<<>>", "Yay"));
		System.out.println(makeOutWord("<<>>", "WooHoo"));
	}
	public static String makeOutWord(String s1,String s2){
		String newstr="";
		if(s1.length()>=4){
			String s1_start = s1.substring(0, 2);
			String s1_end = s1.substring(2);
			newstr = s1_start+s2+s1_end;
		}
		return newstr;
	}
}
