package com.itheima.test3_ϵͳ�ⲹ��1;

public class in1To10_class {

	/**
	 ## ��Ŀ������  Ӣ�ķ���
[description]
����һ�����Ͳ�����һ��boolean���͵ġ�outsideMode��������������������Ͳ�����1��10�ķ�Χ���򷵻�true��<br/>
�����outSideMode��Ϊtrueʱ����ô���Ͳ���ӦС�ڵ���1���ߴ��ڵ���10���ͷ���true������1��10֮�䷵��false<br/>
## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
[test.suits]
(5, false) -> true	
(11, false) -> false	
(11, true) -> true	
(10, false) -> true
(10, true) -> true	
(9, false) -> true	
(9, true) -> false	
(1, false) -> true	
(1, true) -> true	
(0, false) -> false	
(0, true) -> true	
(-1, false) -> false	
	 */
	public static void main(String[] args) {
		System.out.println(in1To10(1, false));
		System.out.println(in1To10(1, true));
		System.out.println(in1To10(0, false));
		System.out.println(in1To10(0, true));
		System.out.println(in1To10(-1, false));
	}
	
	public static boolean in1To10(int i,boolean outsideMode){
		boolean b= false;
		if(i>1&&i<10){
			b = true;
		}else if(outsideMode && i<=1 || i>=10){
			b = true;
		}else if(outsideMode && i>1 && i<10){
			b = false;
		}
		return b;
	}
}
