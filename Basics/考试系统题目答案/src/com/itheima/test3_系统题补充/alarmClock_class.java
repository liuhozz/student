package com.itheima.test3_系统题补充;

public class alarmClock_class {

	/**## 方法参数，严格按照顺序填写(多个用英文逗号隔开,全包名的类名) java.lang.String , int , boolean,  int[] 
[method.params]
int,boolean
	## 题目的描述  英文翻译
[description]
给定星期中的一天（用整型编码为0 = Sun，1 = Mon，2 = Tue，... 6 = Sat）和Boolean类型的vacation(是否在度假)的两个参数，<br/>
返回一个闹钟应响的字符串值。工作日，闹钟应响都为“7:00”，周末则为“10:00”；如果是在度假的话，工作日的闹钟应响为“10:00”，周末则为“off”。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(1, false) -> "7:00"		
(5, false) -> "7:00"
在1-5之间并且没有度假,那么就是七点

(1, true) -> "10:00"	
(3, true) -> "10:00"	
(5, true) -> "10:00"	
在1-5之间并且在度假,那么就是十点


(0, false) -> "10:00"	
(6, false) -> "10:00"
在周末(0,6)也有度假	

(0, true) -> "off"	
(6, true) -> "off"	
在周末,但是在度假就off

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
