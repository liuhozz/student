package com.heima.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2_sqrt {

	/**
	 * 1.写一个正则, 判断一个字符串中的内容是否符合邮箱的规则.(xxx@xx.yyy和xxxx@xx.yyy.xx都是正确的邮箱)
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Dome1();
		//Dome2();
		//Dome3();
			//String regex=".+@.{0,5}\\.\\w+";
		//Dome4();
		
				 
		
	}
	public static void Dome4() {
		String regex1="^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
		
		String s="155785265@sss.cn.jhgg.ffg";
		System.out.println(s.matches(regex1));
	}
	public static void Dome3() {
		String regex="1[3875]\\d{9}";
		String s="18699987321563259913549975235522158325269875";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s);
		while(m.find())		//每找一次指针会自动向后移动一位
			System.out.println(m.group());//只能先fine再group
	}
	public static void Dome2() {
		String s="我我......我...我..要.....要.要..学...学...学...学..编..编.编.编.程";
		String regex="\\.+";
		s=s.replaceAll(regex, "").replaceAll("(.)\\1+", "$1");//内容部分可以通过 $组号 来引用第一个参数中的分组的分组的内容
		System.out.println(s);
	}
	public static void Dome1() {
		String regex="(.)\\1+";
		String s="sdqqfsjjjkedddd";
		System.out.println(Arrays.toString(s.split(regex)));
	}

}
