package com.itheima.test;

import java.util.Arrays;

public class fizzArray_class {

	/**
	 ��Ŀ����:
	  ��дһ���࣬����ΪItheima;

	  ������һ��������������fizzArray;

	  ��һ����������֣����ش���һ�������Ǹ����ֵ��������飬�������е�Ԫ�ذ���Ȼ˳�������
	����������7����ô���س���Ϊ7���������飬�����Ԫ��Ϊ{0��1��2��3��4��5��6}

	��ʾ:
	�������� ����ֵ 
	fizzArray(4) [0,1,2,3] 
	fizzArray(1) [0] 
	fizzArray(10) [0,1,2,3,4,5,6,7,8,9] 
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(fizzArray(7)));
		
	}
	public static int[] fizzArray(int num){
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i]=i;
		}
		return arr;
	}
}
