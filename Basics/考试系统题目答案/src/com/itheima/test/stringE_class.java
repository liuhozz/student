package com.itheima.test;

public class stringE_class {

	/**
	 ��Ŀ����:
��дһ���࣬����ΪItheima;
������һ��������������stringE;
���� true ����ַ����а���1��3�� 'e' �ַ�.
��ʾ:
��������	����ֵ
stringE("Hello")	true
stringE("Heelle")	true
stringE("Heelele")	false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringE("Hello"));
		System.out.println(stringE("Heelle"));
		System.out.println(stringE("Heelele"));
	}
	
	public static boolean stringE(String str){
		int count=0;
		char[] arr = str.toCharArray();
		for (char c : arr) {
			if(c=='e'){
				count++;
			}
		}
		if(count>=1&&count<=3){
			return true;
		}else{
			return false;
		}
		
	}

}
