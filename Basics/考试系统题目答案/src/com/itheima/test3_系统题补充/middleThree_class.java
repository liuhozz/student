package com.itheima.test3_ϵͳ�ⲹ��;

public class middleThree_class {

	/**
	 ## ��Ŀ������  Ӣ�ķ���
[description]
����һ���������ȵ��ַ��������м䷵���ַ�������3�����ԡ�candy��������and���� �ַ�����������Ϊ3��

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
[test.suits]
("Candy") -> "and"	
("and") -> "and"
("solving") -> "lvi"
("Hi yet Hi") -> "yet"	
("java yet java") -> "yet"	
("Chocolate") -> "col"
("XabcxyzabcX") -> "xyz"
	 */
	public static void main(String[] args) {
		System.out.println(middleThree("and"));
	}
	public static String middleThree(String str){
		int num = (str.length()-3)/2;
//		String string1 = str.substring(0, num);
//		String string2 = str.substring(num+3);
		return str.substring(num, num+3);
	}
}
