package com.itheima.test3_ϵͳ�ⲹ��;

public class without2_class {

	/**
	 ## ��Ŀ������  Ӣ�ķ���
[description]
����һ���ַ��������һ������Ϊ2�����ַ������������Ŀ�ʼ�ͽ���������һ���ַ�����<br/>
û���Ӵ��ڿ�ͷ�����ԡ�HelloHe��������lloHe���� �Ӵ������������ص�����ˡ�Hi������������ <br/>
���򣬷���ԭʼ�ַ������䡣<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
[test.suits]
("HelloHe") -> "lloHe"
("HelloHi") -> "HelloHi"
("Hi") -> ""
("Chocolate") -> "Chocolate"
("xxx") -> "x"
("xx") -> ""
("x") -> "x"
("") -> ""
("Fruits") -> "Fruits"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(without2("Fruits"));
		System.out.println(without2(""));
		System.out.println(without2("x"));
		System.out.println(without2("xx"));
		System.out.println(without2("xxx"));
		System.out.println(without2("HelloHe"));
	}
	
	public static String without2(String str){
		if(str=="" || str.length()==2){
			return " \"\" ";
		}
		if(str.length()==1){
			return str;
		}
		String new_start = str.substring(0, 2);
		String new_end = str.substring(str.length()-2);
		if(new_start.equals(new_end)){
			return str.substring(2);
		}
		return str;
	}
}
