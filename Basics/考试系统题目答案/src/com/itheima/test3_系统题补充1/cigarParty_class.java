package com.itheima.test3_系统题补充1;

public class cigarParty_class {

	/**
	 ## 题目的描述  英文翻译
[description]
当松鼠聚在一起聚会，他们喜欢有雪茄。 当雪茄数量在40和60之间（含）时，松鼠派对成功。 <br/>
除非是周末，在这种情况下，雪茄的数量没有上限。以聚会时间为前提，判断松鼠们的聚会是否成功，<br/>
成功为true，失败为false。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
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
		if(b){//是周末
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










