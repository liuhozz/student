package com.itheima.test;

public class atFirst_class {

	/**
	 ��Ŀ����:
��дһ���࣬����ΪItheima;
������һ��������������atFirst;
����һ���ַ���������һ���ַ�������2����ǰ2���ַ���ɡ� ����ַ�������С��2��ʹ�á�@����ʾȱ�ٵ��ַ���
��ʾ:
��������	����ֵ
atFirst("hello")	"he"
atFirst("hi")	"hi"
atFirst("h")	"h@"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String atFirst(String str){
		if(str.length()<=0){
			return "@@";
		}else if(str.length()==1){
			return str.charAt(0)+"@";
		}else{
			return str.substring(0, 2);
		}
	}
}
