package com.itheima.test3_系统题补充1;

public class blueTicket_class {

/**
	 # 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
蓝色的彩票

## 题目的描述  英文翻译
[description]
你有一张绿彩票，显示int值a、b、c，组成三对ab、bc、ac。如果其中有一对的和为10，<br/>
则返回10；如果ab的和恰巧比bc或者ac大10，则返回5；否则返回0.<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(9, 1, 0) -> 10	
(9, 2, 0) -> 0	
(6, 1, 4) -> 10	
(6, 1, 5) -> 0	
(10, 0, 0) -> 10		
(15, 0, 5) -> 5	
(5, 15, 5) -> 10	
(4, 11, 1) -> 5	
(13, 2, 3) -> 5	
(8, 4, 3) -> 0	
(8, 4, 2) -> 10		
(8, 4, 1) -> 0	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(blueTicket(9, 1, 0));
		System.out.println(blueTicket(5, 15, 5));
		System.out.println(blueTicket(4, 11, 1));
		System.out.println(blueTicket(13, 2, 3));
		System.out.println(blueTicket(8, 4, 3));
		System.out.println(blueTicket(8, 4, 2));
		System.out.println(blueTicket(8, 4, 1));
	}
	
	public static int blueTicket(int a,int b,int c){
		if(a+b==10||b+c==10||a+c==10){
			return 10;
		}
		if((a+b)-(a+c)==10||(a+b)-(b+c)==10){
			return 10;
		}else{
			return 0;
		}
	}
}
