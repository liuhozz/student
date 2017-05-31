package com.itheima.test;

public class dateFashion_class {

	/**
	题目描述:
书写一个类，类名为Itheima;
类中有一个方法，方法名dateFashion;
你和你的炮友想去宾馆开房啪啪。
该方法的第一个参数代表你的时尚值，是一个0~10的随机数。
该方法的第二个参数代表炮友的时尚值。
如果你们俩其中一个的时尚值大于等于8，前台就给你俩开房，方法返回2；
如果你们俩其中一个时尚值小于等于2(太搓了约个屁啊)，前台就不给开房，方法返回0
其他情况，给不给开房要看前台的心情，方法返回1。
提示:
方法调用	期望值
dateFashion(5,10)	2
dateFashion(5,2)	0
dateFashion(5,5)	1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dateFashion(5,10));
		System.out.println(dateFashion(5,2));
		System.out.println(dateFashion(5,5));
	}
	
	public static int dateFashion(int  a,int b){
		if(a>=8||b>=8){
			return 2;
		}else if(a<=2||b<=2){
			return 0;
		}else{
			return 1;
		}
	}

}
