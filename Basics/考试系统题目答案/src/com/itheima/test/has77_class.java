package com.itheima.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class has77_class {

	/**
	 51��Ŀ����:
  ��дһ���࣬����ΪItheima;
  ������һ��������������has77;
  ����һ���������飬���������������˴����ڵ�7������������7��һ��Ԫ�طָ�����{7��1��7}���򷵻�true��
  ([1, 7, 7]) -> true	
([1, 7, 1, 7]) -> true	
([1, 7, 1, 1, 7]) -> false
([7, 7, 1, 1, 7]) -> true	
([2, 7, 2, 2, 7, 2]) -> false		
([2, 7, 2, 2, 7, 7]) -> true	
([7, 2, 7, 2, 2, 7]) -> true	
([7, 2, 6, 2, 2, 7]) -> false	
([7, 7, 7]) -> true	
([7, 1, 7]) -> true		
([7, 1, 1]) -> false	
([1, 2]) -> false	
([1, 7]) -> false	
([7]) -> false	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(has77_method(new int[]{1,7}));
	}
	public static boolean has77_method(int[] arr){
		for (int i = 0; i < arr.length-2; i++) {
			if(i!=arr.length-1&&arr[i]==7&&arr[i+1]==7){
				return true;
			}else if(i!=arr.length-2&&arr[i]==7&&arr[i+1]!=7&&arr[i+2]==7){
				return true;
			}
		}
		return false;
	}
	
	public static boolean has77(int[] arr){
		String str="";
		for (int i : arr) {
			str+=i;
		}
		String regex = "7.?7";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(str);
		while(matcher.find()){
			return true;
		}
		return false;
	}
}
