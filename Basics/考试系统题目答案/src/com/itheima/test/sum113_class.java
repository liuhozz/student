package com.itheima.test;

public class sum113_class {

/**
��Ŀ����:
 ��дһ���࣬����ΪItheima;

 ������һ��������������sum13;

 ��һ���������飬���صĽ������������Ԫ�ص��ܺͣ���������г���������13��ʱ��
 ��ôԪ��13��13�����һ��Ԫ��Ҳ�������ܺ����档

 ��ʾ:
 �������� ����ֵ 
 sum13([1,2,2,1]) 6 
 sum13([1,1]) 2 
 sum13([1,2,2,1,13]) 6 
	 */
	public static void main(String[] args) {
		System.out.println(sum13(new int[]{1,2,2,1,13}));
	}
	
	public static int sum13(int[] arr){
		int sum=0;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]!=13){
				sum+=arr[j];
			}else{
				j=j+1;
			}
		}
		return sum;
	}
}
