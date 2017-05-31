package com.itheima.test3_系统题补充1;

public class fizzString_class {

	/**
	 ## 题目的描述  英文翻译
[description]
给定一个字符串str，如果它是以“f”开头则返回“Fizz”，如果是以“b”结尾则返回“Buzz”，<br/>
如果既以“f”开头、又以“b”结尾则返回“FizzBuzz”，如果都不是则返回字符串本身。<br/>
 
## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
("fig") -> "Fizz"	
("dib") -> "Buzz"	
("fib") -> "FizzBuzz"	
("abc") -> "abc"		
("fooo") -> "Fizz"	
("booo") -> "booo"	
("ooob") -> "Buzz"	
("fooob") -> "FizzBuzz"	
("f") -> "Fizz"	
("b") -> "Buzz"	
("abcb") -> "Buzz"		
("Hello") -> "Hello"	
("Hellob") -> "Buzz"		
("af") -> "af"	
("bf") -> "bf"	
("fb") -> "FizzBuzz"	
*/
	public static void main(String[] args) {
		System.out.println(fizzString("Hello"));
		System.out.println(fizzString("Hellob"));
		System.out.println(fizzString("af"));
		System.out.println(fizzString("bf"));
		System.out.println(fizzString("fb"));
	}
	
	public static String fizzString(String str){
		if(str.charAt(0)=='f' && str.endsWith("b")){
			return "FizzBuzz";
		}else if(str.charAt(0)=='f'){
			return "Fizz";
		}else if(str.endsWith("b")){
			return "Buzz";
		}else{
			return str;
		}
	}
}
