package com.heima.Test;

import java.math.BigInteger;

public class Test05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dome1();
		
		
		
		Dome2();
	}

	public static void Dome2() {
		
		BigInteger bi1=new BigInteger("1");
		for(int i=1;i<=1000;i++){
			BigInteger bi2=new BigInteger(i+"");
			bi1=bi1.multiply(bi2);
		}
		
	}

	/*
	 * 数组的做法
	 */
	public static void Dome1() {
		int[] arr=new int[12];
		arr[0]=1;
		arr[1]=1;
		for (int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println(arr[arr.length-1]);
	}

}