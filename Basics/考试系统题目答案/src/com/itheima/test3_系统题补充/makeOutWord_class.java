package com.itheima.test3_ϵͳ�ⲹ��;

public class makeOutWord_class {

	/**
	 
## ��Ŀ������  Ӣ�ķ���
[description]

����һ����out���ַ�������4�����硰<< >>����һ�����ʣ�����һ���µ��ַ�����<br/>
���е�����out�ַ������м䣬���硣 ��<< word >>���� ע�⣺ʹ��str.substring��i��j��<br/>
��ȡ������i��ʼ���ַ�����ֱ��������������j��<br/>


## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
[test.suits]
("<<>>", "Yay") -> "<<Yay>>"
("<<>>", "WooHoo") -> "<<WooHoo>>"
("[[]]", "word") -> "[[word]]"
("HHoo", "Hello") -> "HHHellooo"
("abyz", "YAY") -> "abYAYyz"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeOutWord("<<>>", "Yay"));
		System.out.println(makeOutWord("<<>>", "WooHoo"));
	}
	public static String makeOutWord(String s1,String s2){
		String newstr="";
		if(s1.length()>=4){
			String s1_start = s1.substring(0, 2);
			String s1_end = s1.substring(2);
			newstr = s1_start+s2+s1_end;
		}
		return newstr;
	}
}
