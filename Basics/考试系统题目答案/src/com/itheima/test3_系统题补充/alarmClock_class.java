package com.itheima.test3_ϵͳ�ⲹ��;

public class alarmClock_class {

	/**## �����������ϸ���˳����д(�����Ӣ�Ķ��Ÿ���,ȫ����������) java.lang.String , int , boolean,  int[] 
[method.params]
int,boolean
	## ��Ŀ������  Ӣ�ķ���
[description]
���������е�һ�죨�����ͱ���Ϊ0 = Sun��1 = Mon��2 = Tue��... 6 = Sat����Boolean���͵�vacation(�Ƿ��ڶȼ�)������������<br/>
����һ������Ӧ����ַ���ֵ�������գ�����Ӧ�춼Ϊ��7:00������ĩ��Ϊ��10:00����������ڶȼٵĻ��������յ�����Ӧ��Ϊ��10:00������ĩ��Ϊ��off����<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
[test.suits]
(1, false) -> "7:00"		
(5, false) -> "7:00"
��1-5֮�䲢��û�жȼ�,��ô�����ߵ�

(1, true) -> "10:00"	
(3, true) -> "10:00"	
(5, true) -> "10:00"	
��1-5֮�䲢���ڶȼ�,��ô����ʮ��


(0, false) -> "10:00"	
(6, false) -> "10:00"
����ĩ(0,6)Ҳ�жȼ�	

(0, true) -> "off"	
(6, true) -> "off"	
����ĩ,�����ڶȼپ�off

*/
	public static void main(String[] args) {
		//System.out.println(alarmClock(1, false));
		System.out.println(alarmClock(1, true));
		System.out.println(alarmClock(0, true));

	}
	public static String alarmClock(int week,boolean vacation){
		String str="";
		if(week>=1&week<=5 & vacation==false){
			str= "7:00";
		}
		if(week>=1&week<=5 & vacation==true){
			str= "10:00";
		}
		if(week==6 | week==0 & vacation==false){
			str= "10:00";
		}
		if(week==6 | week==0 & vacation==true){
			str= "off";
		}
		return str;
	}
}
