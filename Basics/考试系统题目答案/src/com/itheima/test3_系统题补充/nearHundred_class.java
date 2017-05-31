package com.itheima.test3_系统题补充;

public class nearHundred_class {

	/**
	## 题目的描述  英文翻译
[description]

给定一个整型n，如果它与100的绝对差或与200的绝对差的值在10以内，则返回true。<br>
注意：Math.abs（num）计算数字的绝对值<br/>
## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  → 换成 ->
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
