package com.itheima.test;

public class closeFar_class {

	/**
	 ��Ŀ����:
��дһ���࣬����ΪItheima;
������һ��������������closeFar;
��������int��a b c�����b��c�е�һ������a������Ϊ1��������һ������������ֵ���2���߸����򷵻�true��
ע�⣺Math.abs��num���������ֵľ���ֵ��
��ʾ:
��������	����ֵ
closeFar(1,2,10)	true
closeFar(1,2,3)	false
closeFar(4,1,3)	true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean closeFar(int a,int b,int c){
		if(Math.abs(a-b)<=1&&Math.abs(c-a)>=2&&Math.abs(c-b)>=2){
			return true;
		}
		if(Math.abs(a-c)<=1&&Math.abs(b-a)>=2&&Math.abs(b-c)>=2){
			return true;
		}
		return false;
	}

}
