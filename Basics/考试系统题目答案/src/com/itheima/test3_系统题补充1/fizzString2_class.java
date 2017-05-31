package com.itheima.test3_系统题补充1;

public class fizzString2_class {

	/**
	 ## 题目的描述  英文翻译
[description]
给定一个int数，返回数字的字符串形式并在其后面加上“！”。例如int 6，则返回“6！”。<br/>
但是，如果数字可以被3整除，则返回“Fizz”；如果数字能被5整除，则返回“Buzz”；<br/>
如果既能被3整除又能被5整，则返回“FizzBuzz”<br/>
 
## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(1) -> "1!"	
(2) -> "2!"	
(3) -> "Fizz!"	
(4) -> "4!"	
(5) -> "Buzz!"
(6) -> "Fizz!"	
(7) -> "7!"	
(8) -> "8!"	
(9) -> "Fizz!"	
(15) -> "FizzBuzz!"	
(16) -> "16!"	
(18) -> "Fizz!"		
(19) -> "19!"		
(21) -> "Fizz!"		
(44) -> "44!"
(45) -> "FizzBuzz!"
(100) -> "Buzz!"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzString2(19));
		System.out.println(fizzString2(21));
		System.out.println(fizzString2(44));
		System.out.println(fizzString2(45));
		System.out.println(fizzString2(100));
	}
	
	public static String fizzString2(int num){
		if(num%3==0&&num%5==0){
			return "FizzBuzz";
		}else if(num%3==0){
			return "Fizz";
		}else if(num%5==0){
			return "Buzz";
		}else{
			return num+"!";
		}
	}
}
