package com.itheima.test3_ϵͳ�ⲹ��1;

public class fizzString2_class {

	/**
	 ## ��Ŀ������  Ӣ�ķ���
[description]
����һ��int�����������ֵ��ַ�����ʽ�����������ϡ�����������int 6���򷵻ء�6������<br/>
���ǣ�������ֿ��Ա�3�������򷵻ء�Fizz������������ܱ�5�������򷵻ء�Buzz����<br/>
������ܱ�3�������ܱ�5�����򷵻ء�FizzBuzz��<br/>
 
## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
