package com.itheima.test3_ϵͳ�ⲹ��;

public class parrotTrouble_class {

	/**
	 ## ��Ŀ������  Ӣ�ķ���
[description]
������һ������˵�������ġ� ��Сʱ����������0..23��Χ�ڵĵ�ǰСʱʱ�䡣<br>
���������˵����ʱ������7֮ǰ����20֮��.��ʾ�������鷳�������档<br>


## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  �� ���� ->
[test.suits]

(true, 6) ->true
(true, 7) ->false
(false, 6) -> false
(true, 21) ->true
(false, 21) ->false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(parrotTrouble(true, 6));
		System.out.println(parrotTrouble(true, 7));
		System.out.println(parrotTrouble(false, 6));
		System.out.println(parrotTrouble(true, 21));
		System.out.println(parrotTrouble(false, 21));
	}
	public static boolean parrotTrouble(boolean b,int i){
		if(i<7|i>20 && b==true){
			return true;
		}
		return false;
		
	}
}
