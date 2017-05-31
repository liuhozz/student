package com.itheima.test2;

public class closeFar {

	/**
	 8.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名closeFar;
  给定三个int，a b c，如果b或c中的一个是与a相差最多为1，并且另一个与其他两个值相差2或者更大，则返回true。
注意：Math.abs（num）计算数字的绝对值。
提示:
方法调用	期望值
closeFar(1,2,10)	true
closeFar(1,2,3)	false
closeFar(4,1,3)	true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(closeFar_method(1,2,3));
	}
	
	public static boolean closeFar_method(int a,int b,int c){
		if(Math.abs(b-a)==1 & Math.abs(c-a)>=2&Math.abs(c-b)>=2){
			return true;
		}
		if(Math.abs(c-a)==1 & Math.abs(b-a)>=2&Math.abs(b-c)>=2){
			return true;
		}
		return false;
	}
}
