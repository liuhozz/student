package com.itheima.test3_ϵͳ�ⲹ��1;

public class cigarParty_class {

	/**
	 ## ��Ŀ������  Ӣ�ķ���
[description]
���������һ��ۻᣬ����ϲ����ѩ�ѡ� ��ѩ��������40��60֮�䣨����ʱ�������ɶԳɹ��� <br/>
��������ĩ������������£�ѩ�ѵ�����û�����ޡ��Ծۻ�ʱ��Ϊǰ�ᣬ�ж������ǵľۻ��Ƿ�ɹ���<br/>
�ɹ�Ϊtrue��ʧ��Ϊfalse��<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
[test.suits]
(30, false) -> false		
(50, false) -> true	
(70, true) -> true	
(30, true) -> false	
(50, true) -> true	
(60, false) -> true
(61, false) -> false	
(40, false) -> true	
(39, false) -> false	
(40, true) -> true	
(39, true) -> false	
	 */
	public static void main(String[] args) {
		
		System.out.println(cigarParty(61, false));//false
		System.out.println(cigarParty(40, false));//true
		System.out.println(cigarParty(39, false));//false
		System.out.println(cigarParty(40, true));//true
		System.out.println(cigarParty(39, true));//false
	}
	public static boolean cigarParty(int i,boolean b){
		if(b){//����ĩ
			if(i>=40){
				return true;
			}else{
				return false;
			}
		}else{
			if(i>=40&&i<=60){
				return true;
			}else{
				return false;
			}
		}
	}
}










