package com.heima.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2_sqrt {

	/**
	 * 1.дһ������, �ж�һ���ַ����е������Ƿ��������Ĺ���.(xxx@xx.yyy��xxxx@xx.yyy.xx������ȷ������)
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
		while(m.find())		//ÿ��һ��ָ����Զ�����ƶ�һλ
			System.out.println(m.group());//ֻ����fine��group
	}
	public static void Dome2() {
		String s="����......��...��..Ҫ.....Ҫ.Ҫ..ѧ...ѧ...ѧ...ѧ..��..��.��.��.��";
		String regex="\\.+";
		s=s.replaceAll(regex, "").replaceAll("(.)\\1+", "$1");//���ݲ��ֿ���ͨ�� $��� �����õ�һ�������еķ���ķ��������
		System.out.println(s);
	}
	public static void Dome1() {
		String regex="(.)\\1+";
		String s="sdqqfsjjjkedddd";
		System.out.println(Arrays.toString(s.split(regex)));
	}

}
