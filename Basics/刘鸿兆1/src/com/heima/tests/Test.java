package com.heima.tests;

public class Test {

	/**
	 * 28个人去买可乐    3个瓶盖换一瓶可乐   最少买几瓶够28人喝
	 */
	public static void main(String[] args) {
		int kl=0,ren=0,count=0;
		for(int i=0;ren<28;i++){
		
			ren=i;
			if(i>1&&i%3==0){
				kl++;
				System.out.println("111111111111");
			}
			//
			if(kl>1&&kl%3==0)
				kl++;
			ren=i+kl;
			count++;
			System.out.println(ren);
		}
		
		System.out.println(count);
	}

}
