package com.itheima.test2;

public class either24_class {

	/**
	 * ��Ŀ����: ��дһ���࣬����ΪItheima; ������һ��������������either24;
	 * ����һ���������飬��������к����������ڵ�����2������������4���ͷ���true��
	 * ���򷵻�false���������Ⱥ����������ڵ�����2�ֺ����������ڵ�����4���ͷ���false�� ���磺([1, 2, 3, 2, 2, 4, 4])
	 * -> false ��ʾ: �������� ����ֵ either24([1,2,2]) true either24([4,4,1]) true
	 * either24([4,4,1,2,2]) false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean either24(int[] arr){
		boolean a= false;
		boolean b= false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==2&arr[i+1]==2){
				a=true;
			}
			if(arr[i]==4&arr[i+1]==4){
				b=true;
			}
		}
		if(a==false & b==false){
			return false;
		}else if(a==true & b==true){
			return false;
		}else{
			return true;
		}
	}
}
