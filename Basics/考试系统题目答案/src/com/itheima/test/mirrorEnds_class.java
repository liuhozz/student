package com.itheima.test;

public class mirrorEnds_class {

	/**
	 * 8题目描述: 书写一个类，类名为Itheima; 类中有一个方法，方法名mirrorEnds;
	 * 给定一个字符串，在给定字符串的开始和结束时寻找一个镜像（向后）的字符串。
	 * 换句话说，零或多个字符在一个给定字符串的逆序，在字符串的结尾（可能有重叠）。例如，字符串“abxyzba”镜子“AB”的结束。
	 * 
	 * 方法调用 期望值 mirrorEnds("abXYZba") "ab" mirrorEnds("abca") "a"
	 * mirrorEnds("aba") "aba"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mirrorEnds("aba"));

	}
	public static String mirrorEnds(String str){
		int count=0;
		int index=0;
		char[] arr = str.toCharArray();
		for (int i = 0,j=str.length()-1; i <= j; i++,j--) {
			if(arr[i]==arr[j]){
				count++;
				System.out.println(i+":"+j);
			}else if(arr[i]!=arr[j]){
				index=i;
				break;
			}
		}
		String st ="";
		if(count==(str.length()+1)/2){//abcdcba
			st=str;
		}else if(index!=0){
			st= str.substring(0, index);
		}else{
			st="";
		}
		return st;
	}
}
