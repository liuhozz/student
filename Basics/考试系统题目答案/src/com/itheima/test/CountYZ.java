package com.itheima.test;

import java.util.Arrays;

public class CountYZ {

	/**
	 18.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名countYZ;
  给定一个字符串，找出里面以“y”或者“z”结尾的单词的个数，也就是说，跟在“y”或者“z”后面的字符不是英文单词。
“y”在“heavy”中和“z”在“fez”中计数，而“y”在“yellow”中不计数，（不区分大小写）
提示:
方法调用	期望值
countYZ("fez day")	2
countYZ("day fez")	2
countYZ("day fyyyz")	2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countYZ_method("day fyyyz*sjfkdy+sskdjZ*sjfdsk"));
	}
	
	public static int countYZ_method(String str){
		int count=0;
		String[] split = str.split("\\W");
		for (String st:split) {
			if(st.endsWith("z")||st.endsWith("y")||st.endsWith("Y")||st.endsWith("Z")){
				count++;
			}
		}
		return count;
	}
}
