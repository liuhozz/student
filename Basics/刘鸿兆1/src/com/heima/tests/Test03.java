package com.heima.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test03 {

	/**
	 * 按需求完成指定功能，题目如下：
		需求:程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入. 把所有输入的整数倒序排列打印.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ts=new ArrayList<>();
		while(true){
			String input =sc.next();
			if(input.equals("quit"))
				break;
			else{
				Integer i=Integer.parseInt(input);
				ts.add(i);
			}
		}
		
		Collections.sort(ts);
		for(int i=ts.size()-1;i>=0;i--){
			System.out.println(ts.get(i));
		}
		



		
	
		
	}

}
