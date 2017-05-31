package com.itheima.test3_系统题补充1;

public class caughtSpeeding_class {

	/**
	 ## 题目的描述  英文翻译
[description]
给定一个int类型的车速值和一个boolean类型的isBirthday参数。<br/>
如果交警在路上检查的你的车速，速度小于等于60则无罚单，在61到80（包括）之间则开小罚单，<br/>
大于等于81就开大罚单，但如果当天是你生日，可以在所有情况下速度增加5度。<br/>
编写代码获取交警检查结果并以int类型数据返回，提示：无罚单＝0；小罚单＝1；大罚单＝2；<br/>
## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
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
		if(b==true){//是生日当天,可以在所有情况下速度增加5度
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
