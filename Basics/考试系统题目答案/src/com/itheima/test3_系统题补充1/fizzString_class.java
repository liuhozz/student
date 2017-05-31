package com.itheima.test3_ϵͳ�ⲹ��1;

public class fizzString_class {

	/**
	 ## ��Ŀ������  Ӣ�ķ���
[description]
����һ���ַ���str����������ԡ�f����ͷ�򷵻ء�Fizz����������ԡ�b����β�򷵻ء�Buzz����<br/>
������ԡ�f����ͷ�����ԡ�b����β�򷵻ء�FizzBuzz��������������򷵻��ַ�������<br/>
 
## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
