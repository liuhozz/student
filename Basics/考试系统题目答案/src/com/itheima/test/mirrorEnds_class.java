package com.itheima.test;

public class mirrorEnds_class {

	/**
	 * 8��Ŀ����: ��дһ���࣬����ΪItheima; ������һ��������������mirrorEnds;
	 * ����һ���ַ������ڸ����ַ����Ŀ�ʼ�ͽ���ʱѰ��һ��������󣩵��ַ�����
	 * ���仰˵��������ַ���һ�������ַ������������ַ����Ľ�β���������ص��������磬�ַ�����abxyzba�����ӡ�AB���Ľ�����
	 * 
	 * �������� ����ֵ mirrorEnds("abXYZba") "ab" mirrorEnds("abca") "a"
	 * mirrorEnds("aba") "aba"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mirrorEnds("aba"));

	}
	public static String mirrorEnds(String str){
		int count=0;
		int index=0;
		char[] arr = str.toCharArray();
		for (int i = 0,j=str.length()-1; i <= j; i++,j--) {
			if(arr[i]==arr[j]){
				count++;
				System.out.println(i+":"+j);
			}else if(arr[i]!=arr[j]){
				index=i;
				break;
			}
		}
		String st ="";
		if(count==(str.length()+1)/2){//abcdcba
			st=str;
		}else if(index!=0){
			st= str.substring(0, index);
		}else{
			st="";
		}
		return st;
	}
}
