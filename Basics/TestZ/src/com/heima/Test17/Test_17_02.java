package com.heima.Test17;

import java.util.Comparator;
import java.util.TreeSet;

import com.heima.enty.Worker;

public class Test_17_02 {

	/**
	 *  现在有一串字符串,内容是: String str="wo ai heima, heima shi wo jia, Qing Da jia Ai Hu Ta!";
		要求:对这个字符串中的字符进行排序, 排序结果如下: aaaabbbbcccccdddd....AAABBBCCCDDD...
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="wo ai heima, heima shi wo jia, Qing Da jia Ai Hu Ta!";
		TreeSet<Character> ts=new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				
				/*if(o1>='a'&&o1<='z'){
					int i1=o1-60;
					o1=(char)i1;
				}
				if(o2>='a'&&o2<='z'){
					int i1=o2-60;
					o2=(char)i1;
				}*/
				/*if(o1<='Z'&&o1>='A'&&o2<='z'&&o2>'a')
					return 1;*/
				int num=o1-o2;
				return num==0? -1: num;
			}
		});
		
		for(int i=0;i<str.length();i++){
			ts.add(str.charAt(i));
			
		}
		System.out.println(ts);
		
	}

}
