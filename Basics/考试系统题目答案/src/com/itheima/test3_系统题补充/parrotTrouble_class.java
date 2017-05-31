package com.itheima.test3_系统题补充;

public class parrotTrouble_class {

	/**
	 ## 题目的描述  英文翻译
[description]
我们有一个大声说话的鹦鹉。 “小时”参数是在0..23范围内的当前小时时间。<br>
如果鹦鹉在说话，时间是在7之前或者20之后.表示我们有麻烦，返回真。<br>


## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  → 换成 ->
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
