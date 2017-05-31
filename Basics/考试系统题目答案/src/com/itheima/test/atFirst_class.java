package com.itheima.test;

public class atFirst_class {

	/**
	 题目描述:
书写一个类，类名为Itheima;
类中有一个方法，方法名atFirst;
给定一个字符串，返回一个字符串长度2由其前2个字符组成。 如果字符串长度小于2，使用“@”表示缺少的字符。
提示:
方法调用	期望值
atFirst("hello")	"he"
atFirst("hi")	"hi"
atFirst("h")	"h@"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String atFirst(String str){
		if(str.length()<=0){
			return "@@";
		}else if(str.length()==1){
			return str.charAt(0)+"@";
		}else{
			return str.substring(0, 2);
		}
	}
}
