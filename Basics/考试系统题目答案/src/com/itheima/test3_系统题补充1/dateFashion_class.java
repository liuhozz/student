package com.itheima.test3_ϵͳ�ⲹ��1;

public class dateFashion_class {

	/**
	 ## ��Ŀ������  Ӣ�ķ���
	[description]
	���������Լ�����ʱ��ֵ������һ�����ڵ���8���Ǿ��ܵõ�����(����ֵ��2),<br/>
	�������������һ����ʱ��ֵС�ڵ��ڶ��������ǿ϶����ܽ�ȥ��(����ֵ��0),<br/>
	����ʱ��ֵ�Ļ��Ͳ�ȷ��(����ֵ��1)<br/>
	
	## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
	[test.suits]
	(5, 10) -> 2	
	(5, 2) -> 0	
	(5, 5) -> 1	
	(3, 3) -> 1
	(10, 2) -> 0
	(2, 9) -> 0	
	(9, 9) -> 2	
	(10, 5) -> 2	
	(2, 2) -> 0
	(3, 7) -> 1	
	(2, 7) -> 0	
	(6, 2) -> 0	
	 */
	public static void main(String[] args) {
		
		System.out.println(dateFashion(10, 5));
		System.out.println(dateFashion(2, 2));
		System.out.println(dateFashion(3, 7));
		System.out.println(dateFashion(2, 7));
		System.out.println(dateFashion(6, 2));
	}	
	
	public static int dateFashion(int a,int b){
		if(a>=8||b>=8){
			return 2;
		}else if(a<=2 || b<=2){
			return 0;
		}else{
			return 1;
		}
	}
}
