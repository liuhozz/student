package com.itheima.test3_ϵͳ�ⲹ��;

public class nearHundred_class {

	/**
	## ��Ŀ������  Ӣ�ķ���
[description]

����һ������n���������100�ľ��Բ����200�ľ��Բ��ֵ��10���ڣ��򷵻�true��<br>
ע�⣺Math.abs��num���������ֵľ���ֵ<br/>
## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  �� ���� ->
[test.suits]

(93) ->true
(90) ->true
(89) ->false
(110) -> true
(111) ->false
(121) ->false
(-101) -> false
(-209) ->false
(190) ->true
(0) ->false
(5) ->false
(-50) ->false
(191) ->true
(189) -> false
(200) ->true
(210) ->true
(211) -> false
(290) ->false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nearHundred(189));
		System.out.println(nearHundred(200));
		System.out.println(nearHundred(210));
		System.out.println(nearHundred(211));
		System.out.println(nearHundred(290));
	}
	
	public static boolean nearHundred(int i){
		if((Math.abs(100-i)>=0&&Math.abs(100-i)<=10)||(Math.abs(200-i)>=0&&Math.abs(200-i)<=10)){
			return true;
		}else{
			return false;
		}
	}

}
