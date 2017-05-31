package com.itheima.test;

public class blackJack_class {

	/**
	 46.题目描述:
  书写一个类，类名为Itheima;
  类中有一个方法，方法名blackjack;
  给定两大大于0的int类型值，返回两个数中不大于21且最接近21的数，如果两个数都大于21，则返回0；
提示:
方法调用	期望值
blackjack(19,21)	21
blackjack(21,19)	21
blackjack(19,22)	19
	 */
	public static void main(String[] args) {
		System.out.println(blackjack(19,21));
		System.out.println(blackjack(21,19));
		System.out.println(blackjack(16,18));

	}
	
	public static int blackjack(int a,int b){
		int num=0;
		if(a>=21&&b>=21){
			return 0;
		}
		if(a<21 && b>=21){
			num=a;
		}
		
		if(a>21&&b<=21){
			num=b;
		}
		if(a<=21&&b<=21){
			num=(21-a)>(21-b)?b:a; 
		}
		return num;
	}
}
