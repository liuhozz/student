package com.itheima.test3_ϵͳ�ⲹ��1;

public class caughtSpeeding_class {

	/**
	 ## ��Ŀ������  Ӣ�ķ���
[description]
����һ��int���͵ĳ���ֵ��һ��boolean���͵�isBirthday������<br/>
���������·�ϼ�����ĳ��٣��ٶ�С�ڵ���60���޷�������61��80��������֮����С������<br/>
���ڵ���81�Ϳ��󷣵�������������������գ�����������������ٶ�����5�ȡ�<br/>
��д�����ȡ�������������int�������ݷ��أ���ʾ���޷�����0��С������1���󷣵���2��<br/>
## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
[test.suits]
(60, false) -> 0	
(65, false) -> 1	
(65, true) -> 0
(80, false) -> 1
(85, false) -> 2	
(85, true) -> 1		
(70, false) -> 1
(75, false) -> 1	
(75, true) -> 1	
(40, false) -> 0	
(40, true) -> 0	
(90, false) -> 2
	 */
	public static void main(String[] args) {
		System.out.println(caughtSpeeding(75, false));
		System.out.println(caughtSpeeding(75, true));
		System.out.println(caughtSpeeding(40, false));
		System.out.println(caughtSpeeding(40, true));
		System.out.println(caughtSpeeding(90, false));
	}
	
	public static int caughtSpeeding(int i,boolean b){
		if(b==true){//�����յ���,����������������ٶ�����5��
			if(i+5<=60){
				return 0;
			}else if(i+5>=61&&i+5<=80){
				return 1;
			}else{
				return 2;
			}
		}else{
			if(i<=60){
				return 0;
			}else if(i>=61&&i<=80){
				return 1;
			}else{
				return 2;
			}
		}
	}
}
