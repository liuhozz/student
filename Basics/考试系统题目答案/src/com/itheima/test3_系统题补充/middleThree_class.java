package com.itheima.test3_系统题补充;

public class middleThree_class {

	/**
	 ## 题目的描述  英文翻译
[description]
给定一个奇数长度的字符串，从中间返回字符串长度3，所以“candy”产生“and”。 字符串长度至少为3。

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
("Candy") -> "and"	
("and") -> "and"
("solving") -> "lvi"
("Hi yet Hi") -> "yet"	
("java yet java") -> "yet"	
("Chocolate") -> "col"
("XabcxyzabcX") -> "xyz"
	 */
	public static void main(String[] args) {
		System.out.println(middleThree("and"));
	}
	public static String middleThree(String str){
		int num = (str.length()-3)/2;
//		String string1 = str.substring(0, num);
//		String string2 = str.substring(num+3);
		return str.substring(num, num+3);
	}
}
