package com.itheima.test;

import java.util.Arrays;

public class evenlySpaced_class {

	/**
30��Ŀ����:
��дһ���࣬����ΪItheima;
������һ��������������evenlySpaced;
��������int��a b c������һ����С�ģ�һ�����еȣ�һ����
�������ֵ���ȷֲ�������С����ֵ֮��Ĳ������кʹ�֮��Ĳ�����ͬ���򷵻�true��
��ʾ:
�������� ����ֵ 
evenlySpaced(2,4,6) true 
evenlySpaced(4,6,2) true 
evenlySpaced(4,6,3) false */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evenlySpaced(6,8,7));
	}
	public static boolean evenlySpaced(int a,int b,int c){
		if(b-a == c-b){
			return true;
		}else if(b-c == a-b){
			return true;
		}else if(a-b == c-a){
			return true;
		}else if(a-c == b-a){
			return true;
		}else if(c-a == b-c){
			return true;
		}else if(c-b == a-c){
			return true;
		}
		return false;
	}
	public static boolean evenlySpaced2(int a,int b,int c){
		int[] arr = {a,b,c};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length-2; i++) {
			if(arr[i]+1==arr[i+1]&arr[i+1]==arr[i+2]-1){
				return true;
			}
		}
		return false;
	}

}
