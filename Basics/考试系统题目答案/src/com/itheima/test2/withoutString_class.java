package com.itheima.test2;

public class withoutString_class {

	/**
	
10.��дһ���࣬����ΪItheima;

  ������һ��������������withoutString;

  ���������ַ�����base��remove������ɾ����remove�ַ�����base�ַ����������ִ�Сд����
���ҷ��ص�base�ַ���������remove���ص�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutString("adeFabcDEFbdefc","def"));

	}
	public static String withoutString(String s1,String s2){
		for (int i = 0; i < s1.length()-1; i++) {
			String string = s1.substring(i, s2.length()+i);
			if(string.equalsIgnoreCase(s2)){
				s1 = s1.replaceAll(string, "");
			}
		}
		return s1;
		
	}
}
