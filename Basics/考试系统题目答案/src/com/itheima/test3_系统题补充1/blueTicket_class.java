package com.itheima.test3_ϵͳ�ⲹ��1;

public class blueTicket_class {

/**
	 # ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
��ɫ�Ĳ�Ʊ

## ��Ŀ������  Ӣ�ķ���
[description]
����һ���̲�Ʊ����ʾintֵa��b��c���������ab��bc��ac�����������һ�Եĺ�Ϊ10��<br/>
�򷵻�10�����ab�ĺ�ǡ�ɱ�bc����ac��10���򷵻�5�����򷵻�0.<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
