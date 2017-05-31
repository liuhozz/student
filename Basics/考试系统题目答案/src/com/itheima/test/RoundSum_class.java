package com.itheima.test;

public class RoundSum_class {

	/**
	 23.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名roundSum;
  方法接受3个int类型的参数,每个参数的末位数进行四舍五入,例如15末尾四舍五入后就是20,12四舍五入后就是10
把三个int参数四舍五入后的值求和返回. 为了避免代码重复，编写一个单独的帮助器“public int round10（int num）并调用它3次。完全编写帮助程序，并在与roundSum（）相同的缩进级别。
提示:
方法调用	期望值
roundSum(16,17,18)	60
roundSum(12,13,14)	30
roundSum(6,4,4)	10
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(roundSum(6,4,4));
	}
	
	public static int roundSum(int a,int b,int c){
		
		return round10(a)+round10(b)+round10(c);
		
	}
	public static int round10(int num){
		if(num%10>=5){
			num = num-(num%10)+10;
		}else{
			num=num-(num%10);
		}
		return num;
	}
}
