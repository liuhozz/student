package com.itheima.test;

public class dateFashion_class {

	/**
	��Ŀ����:
��дһ���࣬����ΪItheima;
������һ��������������dateFashion;
������������ȥ���ݿ���žž��
�÷����ĵ�һ�������������ʱ��ֵ����һ��0~10���������
�÷����ĵڶ��������������ѵ�ʱ��ֵ��
�������������һ����ʱ��ֵ���ڵ���8��ǰ̨�͸�������������������2��
�������������һ��ʱ��ֵС�ڵ���2(̫����Լ��ƨ��)��ǰ̨�Ͳ�����������������0
�������������������Ҫ��ǰ̨�����飬��������1��
��ʾ:
��������	����ֵ
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
