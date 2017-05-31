package com.itheima.test3_系统题补充综合;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 综合题目_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}
	public static String show44(String str){
		String ss="";
		for (int i = 1; i <= str.length()/2; i++) {
			String start = str.substring(0, i);
			String end = str.substring(str.length()-i);
			if(start.equals(end)){
				ss = str.substring(0, i);
			}
		}
		return ss;
	}
	/*
	 * ## 题目的描述
[description]
给定一字符串，截取出该字符串开头和结尾相同的内容且不可重叠，并返回。<br/>
例如：sameEnds("abXab") is "ab"


## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)
[test.suits]
("abXYab") -> "ab"
("xx") -> "x"	
("xxx") -> "x"
("xxxx") -> "xx"	
("javaXYZjava") -> "java"	
("javajava") -> "java"
("xavaXYZjava") -> ""
("Hello! and Hello!") -> "Hello!"
("x") -> ""
("") -> ""
("abcb") -> ""
("mymmy") -> "my"
	 */
	public static boolean show43(int num){
		if(num%10==9||num%10==8||num%10>=0&&num%10<=2){
			return true;
		}else{
			return false;
		}
	}
	/*
	 ## 题目的描述  英文翻译
[description]
给定一个非负数的整型参数，如果它除以10的余数比10小1或2的范围内，<br/>
或者是在0～2（包括）范围内，则返回true，否则返回false。<br/>


## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(12) -> true	
(17) -> false	
(19) -> true	
(31) -> true	
(6) -> false		
(10) -> true	
(11) -> true	
(21) -> true	
(22) -> true	
(23) -> false	
(54) -> false	
(155) -> false	
(158) -> true	
(3) -> false	
(1) -> true
	 */
	public static boolean show42(int num){
		if(num%20==19||num%20==18){
			return true;
		}else{
			return false;
		}
	}
	/*
	 ## 题目的描述  英文翻译
[description]
给定一个非负数，如果它除以20的余数比20小1或者2则返回true。例如，38和39则返回true，40则返回false。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(18) -> true	
(19) -> true	
(20) -> false	
(8) -> false	
(17) -> false	
(23) -> false	
(25) -> false	
(30) -> false	
(31) -> false	
(58) -> true	
(59) -> true	
(60) -> false	
(61) -> false	
(62) -> false	
(1017) -> false	
(1018) -> true	
(1019) -> true	
(1020) -> false	
(1021) -> false	
(1022) -> false	
(1023) -> false	
(37) -> false	
	 */
	public static String show41(String str){
		String newstr="";
		if(str.length()>2){
			if(str.charAt(0)=='a'&&str.charAt(1)=='b'){
				return "a"+"b"+str.substring(2);
			}else if(str.charAt(0)=='a'){
				return "a"+str.substring(2);
			}else if(str.charAt(0)=='b'){
				return "b"+str.substring(2);
			}else{
				return str.substring(2);
			}
		}else{
			if(str.charAt(0)=='a'&&str.charAt(1)=='b'){
				return "a"+"b";
			}else if(str.charAt(1)=='b'){
				return "b";
			}else if(str.charAt(1)=='a'){
				return "a";
			}else{
				return "";
			}
		}
	}
	/*
	
## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
没有前2的字符串

## 题目的描述  英文翻译
[description]
给定一个字符串，返回一个没有前2个字符的版本。 如果第一个字符是'a'，则保留第一个字符<br/>
如果第二个字符是'b'。 则保留第二个字符，字符串可以是任意长度。 <br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
("Hello") -> "llo"
("java") -> "va"
("away") -> "aay"
("axy") -> "ay"	
("abc") -> "abc"
("xby") -> "by"	
("ab") -> "ab"
("ax") -> "a"
("axb") -> "ab"
("aaa") -> "aa"
("xbc") -> "bc"	
("bbb") -> "bb"	
("bazz") -> "zz"	
("ba") -> ""
("abxyz") -> "abxyz"
("hi") -> ""	
("his") -> "s"
("xz") -> ""	
("zzz") -> "z"
	 */
	public static int show39(int a,int b,boolean flag){
		if(flag==false){
			return a+b;
		}else if(flag && a==b && a+b<=6){
			return a+b+1;
		}else if(flag&& a==6&&b==6){
			return a+1;
		}else{
			return a+b;
		}
	}
/*
 ## 题目的描述  英文翻译
[description]
有三个参数，其中两个是整型参数表示显示骰子的点数，另一个是布尔参数：noDoubles.<br/>
结果返回两个骰子点数的总和，(骰子的点数范围是1到6),如果noDoubles为true时，<br/>
如果两个骰子的值相同，则将两个骰子的点数总和加1；如果两个骰子都显示为6时，<br/>
将其中一个骰子点数置换成1再进行求和<br/>
 
## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(2, 3, true) -> 5	
(3, 3, true) -> 7		
(3, 3, false) -> 6	
(2, 3, false) -> 5	
(5, 4, true) -> 9	
(5, 4, false) -> 9	
(5, 5, true) -> 11	
(5, 5, false) -> 10	
(6, 6, true) -> 7	
(6, 6, false) -> 12	
(1, 6, true) -> 7		
(6, 1, false) -> 7	
 */
	public static boolean show38(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==3&&arr[i-1]==1){
				return true;
			}
		}
		return false;
	}
	/*
	 ## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
不幸的1

## 题目的描述  英文翻译
[description]
我们会说，在数组中紧跟着3的1是一个“不幸的”1.如果给定的数组在数组的前2个或最后2个位置包含一个不幸的1，返回true。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 3, 4, 5]) -> true
([2, 1, 3, 4, 5]) -> true
([1, 1, 1]) -> false
([1, 3, 1]) -> true	
([1, 1, 3]) -> true
([1, 2, 3]) -> false
([3, 3, 3]) -> false	
([1, 3]) -> true	
([1, 4]) -> false	
([1]) -> false	
([]) -> false	
([1, 1, 1, 3, 1]) -> false	
([1, 1, 3, 1, 1]) -> true		
([1, 1, 1, 1, 3]) -> true	
([1, 4, 1, 5]) -> false	
([1, 1, 2, 3]) -> false		
([2, 3, 2, 1]) -> false	
([2, 3, 1, 3]) -> true	
([1, 2, 3, 4, 1, 3]) -> true	
	 */
	public static int show37(int a,int b){
		if(a>=13&&a<=19 || b>=13&&b<=19){
			return 19;
		}else{
			return a+b;
		}
	}
	/*
	 ## 题目的描述  英文翻译
[description]
给定两个整型参数，返回他们的和。如果两参数至少有一个在13～19（包括）之间，<br/>
或两参数的和在19之间，则返回19.<br/>



## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(3, 4) -> 7	
(10, 13) -> 19	
(13, 2) -> 19	
(3, 19) -> 19	
(13, 13) -> 19	
(10, 10) -> 20	
(6, 14) -> 19	
(15, 2) -> 19	
(19, 19) -> 19	
(19, 20) -> 19	
(2, 18) -> 19	
(12, 4) -> 16	
(2, 20) -> 22	
(2, 17) -> 19	
(2, 16) -> 19	
(6, 7) -> 13
	 */
	public static int show36(int a,int b){
		if(a<5||b<5){
			return 0;
		}else if(a>=b*2||b>=a*2){
			return 2;
		}else if(a>=5&&b>=5){
			return 1;
		}else{
			return 0;
		}
	}
	/*
	## 题目的描述  英文翻译
[description]
我们正在举行一个有茶和糖果的聚会，返回聚会情况用int值表示，0 =坏，1 =好，或2 =很好；<br/>
如果糖果和茶的数量都在5以上则返回好（1）；如果糖果和茶的数量在5以上，且有一个的数量是<br/>
另一个的两倍或两倍以上则返回很好（2）；如果茶和糖的数量有一个小于5则返回坏（0）。<br/>


## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(6, 8) -> 1		
(3, 8) -> 0	
(20, 6) -> 2	
(12, 6) -> 2	
(11, 6) -> 1	
(11, 4) -> 0	
(4, 5) -> 0	
(5, 5) -> 1	
(6, 6) -> 1	
(5, 10) -> 2	
(5, 9) -> 1
(10, 4) -> 0	
(10, 20) -> 2	
	 */
	public static int show35(int a,int b){
		int num = a+b;
		if((num+"").length()>(a+"").length()){
			return a;
		}else{
			return num;
		}
	}
	/*
	 ## 题目的描述  英文翻译
[description]
给定两个非负整数a和b，如果它们的和的数字位数和a的位数相同，返回a和b的和。<br/>
如果和的位数多余a的数字位数，则只需返回a。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(2, 3) -> 5	
(8, 3) -> 8	
(8, 1) -> 9
(11, 39) -> 50	
(11, 99) -> 11	
(0, 0) -> 0	
(99, 0) -> 99		
(99, 1) -> 99	
(123, 1) -> 124	
(1, 123) -> 1	
(23, 60) -> 83	
(23, 80) -> 23	
(9000, 1) -> 9001	
(90000000, 1) -> 90000001	
(9000, 1000) -> 9000	
	 */
	public static int show34(int[] arr1,int[] arr2){
		if(arr1.length>0&&arr2.length>0){
			if(arr1[0]==1&&arr2[0]==1){
				return 2;
			}else if(arr1[0]==1||arr2[0]==1){
				return 1;
			}
		}else if(arr1.length>0&&arr2.length<=0){
			if(arr1[0]==1){
				return 1;
			}else{
				return 0;
			}
		}else if(arr2.length>0&&arr1.length<=0){
			if(arr2[0]==1){
				return 1;
			}else{
				return 0;
			}
		}
		return 0;
	}
	/*
	## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
以1开始的元素

## 题目的描述  英文翻译
[description]
有两个任意长度的整型数组， 返回有多少个数组有1作为他们的第一个元素。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3], [1, 3]) -> 2	
([7, 2, 3], [1]) -> 1	
([1, 2], []) -> 1	
([], [1, 2]) -> 1	
([7], []) -> 0	
([7], [1]) -> 1	
([1], [1]) -> 2	
([7], [8]) -> 0	
([], []) -> 0	
([1, 3], [1]) -> 2	
	 */
	public static boolean show33(int num,boolean b){
		if(b&&num>=60&&num<=100){
			return true;
		}else if(b==false && num>=60&&num<=90){
			return true;
		}else{
			return false;
		}
	}
	/*
	## 题目的描述  英文翻译
[description]
在帕洛阿尔托的松鼠一天绝大数时间都花在玩上面，前提是室外温度得保持在60到90（包括）之间。<br/>
但如果是夏天，它们忍耐的温度可以高达100（包括），给定一个int类型的温度和boolean类型的isSummer的参数，<br/>
如果松鼠们可以玩则返回true，反之则为false。<br/>



## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(70, false) -> true	
(95, false) -> false	
(95, true) -> true
(90, false) -> true	
(90, true) -> true
(50, false) -> false
(50, true) -> false	
(100, false) -> false	
(100, true) -> true	
(105, true) -> false	
(59, false) -> false	
(59, true) -> false	
(60, false) -> true	
	 */
	public static boolean show32(int a,int b){
		//%10拿到各位
		// /10拿到十位
		int age = a%10;
		int ashi = a/10;
		
		int bge = b%10;
		int bshi = b/10;
		if(age==bge||age==bshi){
			return true;
		}else if(ashi==bge||ashi==bshi){
			return true;
		}else{
			return false;
		}
	}
	/*
	 ## 题目的描述  英文翻译
[description]
给定两个int数，范围在10到99之间，如果有一个数字都出现在两个数当中，<br/>
则返回true。例如，”23“和”12“中都有2，则返回值为true。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(12, 23) -> true	
(12, 43) -> false	
(12, 44) -> false		
(23, 12) -> true	
(23, 39) -> true	
(23, 19) -> false	
(30, 90) -> true	
(30, 91) -> false	
(55, 55) -> true	
(55, 44) -> false
	 */
	public static String show31(String str){
		String newstr="";
		for (int i = 1; i <= str.length()/2; i++) {
			String start = str.substring(0, i);
			String end = str.substring(str.length()-i);
			if(start.equals(end)){
				newstr = str.substring(0, i);
			}
		}
		return newstr;
	}
	
	
	/*
	 * ## 题目的描述
[description]
给定一字符串，截取出该字符串开头和结尾相同的内容且不可重叠，并返回。<br/>
例如：sameEnds("abXab") is "ab"


## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)
[test.suits]
("abXYab") -> "ab"
("xx") -> "x"	
("xxx") -> "x"
("xxxx") -> "xx"	
("javaXYZjava") -> "java"	
("javajava") -> "java"
("xavaXYZjava") -> ""
("Hello! and Hello!") -> "Hello!"
("x") -> ""
("") -> ""
("abcb") -> ""
("mymmy") -> "my"
	 */
	public static int[] show28(int[] arr){
		int[] newarr = new int[arr.length];
		int index =1;
		newarr[0] = arr[arr.length-1];
		for (int i = 0; i < arr.length-1; i++) {
			newarr[index++]=arr[i];
		}
		return newarr;
		
	}
	/*
	 * ## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
数组左旋转一位
## 题目的描述  英文翻译
[description]
给定一个ints长度为3的数组，返回一个包含元素“rotate left”的数组，所以{1,2,3}得到{2,3,1}。<br/>
## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3]) -> [2, 3, 1]
([5, 11, 9]) -> [11, 9, 5]
([7, 0, 0]) -> [0, 0, 7]
([1, 2, 1]) -> [2, 1, 1]
([0, 0, 1]) -> [0, 1, 0]
	 */
	public static int[] show27(int[] arr){
		int[] newarr = new int[arr.length];
		int index = 2;
		for (int i = 0; i < arr.length; i++) {
			newarr[index--]=arr[i];
		}
		return newarr;
		
	}
	/*
	 * ## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
数组反转
## 题目的描述  英文翻译
[description]
给定一个int数组长度为3，返回一个新的数组，元素的顺序相反，所以{1,2,3}变成{3,2,1}。<br/>
## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3]) -> [3, 2, 1]
([5, 11, 9]) -> [9, 11, 5]
([7, 0, 0]) -> [0, 0, 7]	
([2, 1, 2]) -> [2, 1, 2]	
([1, 2, 1]) -> [1, 2, 1]
([2, 11, 3]) -> [3, 11, 2]	
([0, 6, 5]) -> [5, 6, 0]	
([7, 2, 3]) -> [3, 2, 7]
	 */
	public static String show26(String str,int num){
		String ss="";
		for (int i = num; num>0; num--) {
			String substring = str.substring(0, num);
			ss+=substring;
		}
		return ss;
	}
	/*
	 * ## 题目的描述
[description]
传入一个字符串和整型数字, <br/>
截取字符串的前n位, 拼接上前n-1位, 再拼接n-2位,再n-3以此类推...<br/>
n的范围应该是0到字符串长度之间.

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)
[test.suits]
("Chocolate", 4) -> "ChocChoChC"
("Chocolate", 3) -> "ChoChC"	
("Ice Cream", 2) -> "IcI"
("Ice Cream", 1) -> "I"
("Ice Cream", 0) -> ""
("xyz", 3) -> "xyzxyx"
("", 0) -> ""
("Java", 4) -> "JavaJavJaJ"	
("Java", 1) -> "J"
	 */
	public static String show25(String str,int n){//abcdfeg 3
		if(str.length()>=n){
			int index = str.length()-n;
			String substring = str.substring(index);
			String newstr = "";
			for (int i =1; i <=n; i++) {
				newstr+=substring;
			}
			return newstr;
		}
		return "";
	}
	/*
	 * ## 题目的描述
[description]
传入一个字符串和整型数字, <br/>
把字符串的最后n个字符重复n次,返回出来.<br/>
n的范围应该是0到字符串长度之间.

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)
[test.suits]
("Hello", 3) -> "llollollo"
("Hello", 2) -> "lolo"
("Hello", 1) -> "o"
("Hello", 0) -> ""	
("abc", 3) -> "abcabcabc"
("1234", 2) -> "3434"
("1234", 3) -> "234234234"
("", 0) -> ""
	 */
	public static int show24(int a,int b,int c){
		if(a==2&& b==2 && c==2){
			return 10;
		}else if (a==b&&b==c){
			return 5;
		}else if (a!=b&&c!=a){
			return 1;
		}else{
		return 0;
		}
		
	}
	
/*
 * ## 题目的描述  英文翻译
[description]
如果你有一张彩票，显示int值a、b、c，范围是0、1、2。如果它们的值都是2时，<br/>
则返回10，如果都不为2且三个数又相同则返回5；再者只要b和c都不同于a则返回1；其他情况都返回0.<br/>
 
## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(2, 2, 2) -> 10	
(2, 2, 1) -> 0	
(0, 0, 0) -> 5		
(2, 0, 0) -> 1	
(1, 1, 1) -> 5		
(1, 2, 1) -> 0	
(1, 2, 0) -> 1		
(0, 2, 2) -> 1	
(1, 2, 2) -> 1	
(0, 2, 0) -> 0	
(1, 1, 2) -> 0	
 */
	
	public static boolean show23(int num){
		boolean b = true;
		if(num%3==0&&num%5==0){
			b = false;
		}else if(num%3==0||num%5==0){
			b = true;
		}
		return b;
	}
	/*
	 * ## 题目的描述  英文翻译
[description]
给定一个非负数，如果是3或者5的倍数，则返回true；但如果是3和5共同的倍数则返回false；<br/>


## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(3) -> true	
(10) -> true	
(15) -> false	
(5) -> true	
(9) -> true	
(8) -> false	
(7) -> false	
(6) -> true	
(17) -> false	
(18) -> true	
(29) -> false	
(20) -> true	
(21) -> true	
(22) -> false	
(45) -> false	
(99) -> true	
	 */
	public static boolean show22(int num){
		if(num%10==9||num%10==8){
			return true;
		}else{
			return false;
		}
		
	}
	/*
	 * ## 题目的描述  英文翻译
[description]
给定一个非负数的整型参数，如果它除以10的余数比10小1或2的范围内，<br/>
或者是在0～2（包括）范围内，则返回true，否则返回false。<br/>


## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
(12) -> true	
(17) -> false	
(19) -> true	
(31) -> true	
(6) -> false		
(10) -> true	
(11) -> true	
(21) -> true	
(22) -> true	
(23) -> false	
(54) -> false	
(155) -> false	
(158) -> true	
(3) -> false	
(1) -> true
	 */
	public static String show21(String str){
		int count=0;
		int index=0;
		char[] array = str.toCharArray();
		for (int i = 0,j = array.length-1; i <= j; i++,j--) {
			if(array[i]==array[j]){
				count++;
				System.out.println(array[i]+":"+array[j]);
			}else if(array[i]!=array[j]){
				index = i;
				System.out.println(array[i]+":"+array[j]);
				
				break;
			}
		}
		if(count==(str.length()+1)/2){
			return str;
		}else if(index!=0){
			return str.substring(0, index);
		}else{
			return "";
		}
	}
	/*
	 * 
	 * ## 题目的描述
[description]
给定一个字符串，在给定字符串的开始和结束时寻找一个镜像（向后）的字符串。<br/>
换句话说，零或多个字符在一个给定字符串的逆序，在字符串的结尾（可能有重叠）。例如，字符串“abxyzba”镜子“AB”的结束。


## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)
[test.suits]
("abXYZba") -> "ab"	
("abca") -> "a"		
("aba") -> "aba"		
("abab") -> ""	
("xxx") -> "xxx"	
("xxYxx") -> "xxYxx"	
("Hi and iH") -> "Hi "		
("x") -> "x"	
("") -> ""	
("123and then 321") -> "123"	
("band andab") -> "ba"
	 */
	public static int[] show19(int[] arr){
		int index = (arr.length-3)/2;
		int[] newarr = new int[3];
		for (int i = 0; i < 3; i++) {
			newarr[i]=arr[index++];
		}
		return newarr;
		
	}
	/*
	 * ## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
长度为3的奇数组

## 题目的描述  英文翻译
[description]
给定奇数长度的int数组，返回一个新数组长度3，其中包含数组中间的元素。 数组长度至少为3。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3, 4, 5]) -> [2, 3, 4]	
([8, 6, 7, 5, 3, 0, 9]) -> [7, 5, 3]	
([1, 2, 3]) -> [1, 2, 3]
	 */
	public static int[] show18(int[] arr1,int[] arr2){
		int[] newarr = new int[2];
		newarr[0] = arr1[1];
		newarr[1] = arr2[1];
		
		
		return newarr;
		
	}
	/*
	 * ## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
取两数组的中间元素
## 题目的描述  英文翻译
[description]
给定2个int数组，a和b，每个长度为3，返回一个包含中间元素的新数组长度2。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3], [4, 5, 6]) -> [2, 5]
([7, 7, 7], [3, 8, 0]) -> [7, 8]
([5, 2, 9], [1, 4, 5]) -> [2, 4]
([1, 9, 7], [4, 8, 8]) -> [9, 8]
([1, 2, 3], [3, 1, 4]) -> [2, 1]
([1, 2, 3], [4, 1, 1]) -> [2, 1]
	 */
	public static int[] show17(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=max;
		}
		return arr;
	}
	/*
	 * ## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
数组最大的元素
## 题目的描述  英文翻译
[description]
给定一个ints长度为3的数组，计算出更大的数组中的第一个或最后一个元素，<br/>
并将所有其他元素设置为该值。 返回更改的数组。<br/>
## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3]) -> [3, 3, 3]	
([11, 5, 9]) -> [11, 11, 11]	
([2, 11, 3]) -> [3, 3, 3]	
([11, 3, 3]) -> [11, 11, 11]	
([3, 11, 11]) -> [11, 11, 11]
([2, 2, 2]) -> [2, 2, 2]		
([2, 11, 2]) -> [2, 2, 2]	
([0, 0, 1]) -> [1, 1, 1]	
	 */
	public static int[] show16(int[] arr){
		int[] newarr = new int[2];
		int index = (arr.length-2)/2;
		newarr[0]=arr[index];
		newarr[1]=arr[index+1];
		return newarr;
	}
	/*
	 * 
## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
数组中间的元素

## 题目的描述  英文翻译
[description]
给定一个偶数长度的int数组，返回一个包含原始数组中间两个元素的新数组长度2。 原始数组长度为2或更长。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3, 4]) -> [2, 3]
([7, 1, 2, 3, 4, 9]) -> [2, 3]
([1, 2]) -> [1, 2]	
([5, 2, 4, 7]) -> [2, 4]	
([9, 0, 4, 3, 9, 1]) -> [4, 3]	
	 */
	public static int[] show15(int[] arr){
		int[] newarr = new int[(arr.length)*2];
		newarr[newarr.length-1]=arr[arr.length-1];
		return newarr;
	}
	/*
	 ## 题目的描述  英文翻译
[description]
给定一个int数组，返回一个长度加倍的新数组，其最后一个元素与原始数组相同，<br/>
所有其他元素都为0.原始数组长度为1或更大。 注意：默认情况下，一个新的int数组包含所有0。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([4, 5, 6]) -> [0, 0, 0, 0, 0, 6]	
([1, 2]) -> [0, 0, 0, 2]	
([3]) -> [0, 3]	
([0]) -> [0, 0]	
([7, 7, 7]) -> [0, 0, 0, 0, 0, 7]	
([3, 1, 4]) -> [0, 0, 0, 0, 0, 4]	
([1, 2, 3, 4]) -> [0, 0, 0, 0, 0, 0, 0, 4]	
([1, 2, 3, 0]) -> [0, 0, 0, 0, 0, 0, 0, 0]
([2, 4]) -> [0, 0, 0, 4]	
	 */
	
	public static int[] show14(int[] arr1,int[] arr2){
		int[] newarr = new int[2];
		if(arr1.length>=2){
			newarr[0] = arr1[0];
			newarr[1] = arr1[1];
			return newarr;
		}else if(arr1.length==1){
			newarr[0] = arr1[0];
			newarr[1] = arr2[0];
			return newarr;
		}else if(arr1.length==0){
			newarr[0] = arr2[0];
			newarr[1] = arr2[1];
			return newarr;
		}else{
			return newarr;
		}
	}
	/*
	 ## 题目的描述  英文翻译
[description]
给定2个int数组a和b，返回一个新的数组长度2，包含的元素从a到后面跟b的元素。<br/>
阵列可以是任何长度，包括0，但是在2个阵列之间将存在2个或更多个可用元素。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([4, 5], [1, 2, 3]) -> [4, 5]	
([4], [1, 2, 3]) -> [4, 1]	
([], [1, 2]) -> [1, 2]	
([1, 2], []) -> [1, 2]	
([3], [1, 2, 3]) -> [3, 1]	
([3], [1]) -> [3, 1]	
([3, 1, 4], []) -> [3, 1]	
([1], [1]) -> [1, 1]	
([1, 2, 3], [7, 8]) -> [1, 2]
([7, 8], [1, 2, 3]) -> [7, 8]	
([7], [1, 2, 3]) -> [7, 1]	
([5, 4], [2, 3, 7]) -> [5, 4]
	 */
	public static boolean show13(String str){
		if(str.substring(0, 3).equals("bad")||str.substring(1, 4).equals("bad")){
			return true;
		}else{
			return false;
		}
	}
	/*
	## 题目的描述  英文翻译
[description]
给定一个字符串，如果“bad”出现在字符串中的索引0或1处，则返回true，<br/>
例如“badxxx”或“xbadxx”，而不是“xxbadxx”。 字符串可以是任何长度，<br/>
包括0.注意：使用.equals（）来比较2个字符串。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]

("badxx") -> true
("xbadxx") -> true
("xxbadxx") -> false
("code") -> false
("bad") -> true
("ba") -> false
("xba") -> false
("xbad") -> true
("") -> false
("badyy") -> true
	 */
	public static int[] show12(int[] arr){
		if(arr.length>2){
			int[] newarr=new int[2];
			newarr[0]=arr[0];
			newarr[1]=arr[1];
			return newarr;
		}else{
			return arr;
		}
	}
/*
## 题目的描述  英文翻译
[description]
给定任何长度的int数组，返回它的前2个元素的新数组。 如果数组小于长度2，则使用任何存在的元素。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3]) -> [1, 2]
([1, 2]) -> [1, 2]	
([1]) -> [1]
([]) -> []	
([6, 5, 0]) -> [6, 5]
([6, 5]) -> [6, 5]
([3, 1, 4, 1, 5]) -> [3, 1]	
([6]) -> [6]
*/
	public static int[] show11(int[] arr1,int[] arr2){
		if(arr1.length>0&&arr2.length>0){
			int[] newarr= new int[2];
			newarr[0]=arr1[0];
			newarr[1]=arr2[0];
			return newarr;
		}else if(arr1.length<=0&&arr2.length>0){
			int[] newarr= new int[1];
			newarr[0]=arr2[0];
			return newarr;
		}else if(arr1.length>0&&arr2.length<=0){
			int[] newarr= new int[1];
			newarr[0]=arr1[0];
			return newarr;
		}else{
			return new int[0];
		}
		
	}
	/*
	## 题目的描述  英文翻译
[description]
给定2个int数组，任何长度的a和b，返回一个包含每个数组的第一个元素的新数组。<br/>
如果任一数组的长度为0，则忽略该数组。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3], [7, 9, 8]) -> [1, 7]	
([1], [2]) -> [1, 2]	
([1, 7], []) -> [1]	
([], [2, 8]) -> [2]	
([], []) -> []	
([3], [1, 4, 1, 9]) -> [3, 1]
([1, 4, 1, 9], []) -> [1]
	 */
	public static int[] show8(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==2&&arr[i+1]==3){
				arr[i+1]=0;
			}
		}
		return arr;
	}
	/*
	 ## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
改变指定索引的元素

## 题目的描述  英文翻译
[description]
给定一个int数组长度3，如果数组中有一个2，紧接着3，将3元素设置为0.返回更改的数组。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3]) -> [1, 2, 0]	
([2, 3, 5]) -> [2, 0, 5]	
([1, 2, 1]) -> [1, 2, 1]	
([3, 2, 1]) -> [3, 2, 1]	
([2, 2, 3]) -> [2, 2, 0]	
([2, 3, 3]) -> [2, 0, 3]	
	 */
	public static boolean show7(int[] arr){
		if(arr[0]==6){
			return true;
		}else if(arr[arr.length-1]==6){
			return true;
		}else{
			return false;
		}
	}
	/*
	 * 
	 *## 题目的描述  英文翻译
[description]
给定一个int数组，如果6显示为数组中的第一个或最后一个元素，则返回true。 数组长度为1或更长。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 6]) -> true	
([6, 1, 2, 3]) -> true
([13, 6, 1, 2, 3]) -> false
([13, 6, 1, 2, 6]) -> true
([3, 2, 1]) -> false
([3, 6, 1]) -> false
([3, 6]) -> true
([6]) -> true
([3]) -> false
([5, 6]) -> true
([5, 5]) -> false
([1, 2, 3, 4, 6]) -> true	
([1, 2, 3, 4]) -> false
	 */
	public static String show6(String str){
		char[] array = str.toCharArray();
		String newstr="";
		for (char c : array) {
			newstr+=c+""+c+"";
		}
		return newstr;
	}
	/*
	 ## 题目的描述
[description]
方法中包含有1个参数，是给定的<b>字符串</b>，<br/>
要求把输入参数的每个字符复制一次<br/>
例如，给定的字符串为"abc"，返回结果为"aabbcc"</br>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)
[test.suits]
("The") -> "TThhee"
("AAbb") -> "AAAAbbbb"
("Hi-There") -> "HHii--TThheerree"
("Word!") -> "WWoorrdd!!"	
("!!") -> "!!!!"
("") -> ""
("a") -> "aa"
(".") -> ".."
("aa") -> "aaaa"
	 */
	public static String show5(String str){
		String substring = str.substring(2);
		if(str.charAt(0)=='a'&&str.charAt(1)!='b'){
			return "a"+substring.substring(1);
		}else if(str.charAt(0)=='a'&&str.charAt(1)=='b'){
			return "a"+"b"+substring.substring(1);
		}else{
			return substring;
		}
	}
	/*
	## 题目的描述  英文翻译
[description]
给定一个字符串，返回一个没有前2个字符的版本。 如果第一个字符是'a'，则保留第一个字符<br/>
如果第二个字符是'b'。 则保留第二个字符，字符串可以是任意长度。 <br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
("Hello") -> "llo"
("java") -> "va"
("away") -> "aay"
("axy") -> "ay"	
("abc") -> "abc"
("xby") -> "by"	
("ab") -> "ab"
("ax") -> "a"
("axb") -> "ab"
("aaa") -> "aa"
("xbc") -> "bc"	
("bbb") -> "bb"	
("bazz") -> "zz"	
("ba") -> ""
("abxyz") -> "abxyz"
("hi") -> ""	
("his") -> "s"
("xz") -> ""	
("zzz") -> "z"
	 */
	public static int show4(String str){
		String regex = "co.e";
		int count=0;
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(str);
		while(matcher.find()){
			String group = matcher.group();
			System.out.println(group);
			count++;
		}
		return count;	
	}
	/*
	 ## 题目的描述
[description]
检查接受字符串里面code出现的次数，<br/>
返回code出现的次数<br/>
注意:由于程序员干活不细心,code的第三个字符d,可能打错了.
所以,cobe, come, cope co*e 这样的字符都要计算在内.

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)
[test.suits]
("aaacodebbb") -> 1
("codexxcode") -> 2
("cozexxcope") -> 2
("cozfxxcope") -> 1
("xxcozeyycop") -> 1
("cozcop") -> 0
("abcxyz") -> 0
("code") -> 1
("ode") -> 0
("c") -> 0
("") -> 0
("AAcodeBBcoleCCccoreDD") -> 3
("AAcodeBBcoleCCccorfDD") -> 2
("coAcodeBcoleccoreDD") -> 3
	 */
	public static String show3(String s1,String s2){
		if(s1.charAt(s1.length()-1)==s2.charAt(0)){
			return s1+s2.substring(1);
		}else{
			return s1+s2;
		}
	}
	/*
	## 题目的描述  英文翻译
[description]
给定两个字符串，将它们附加在一起（称为“并置”），并返回结果。<br/> 
但是，如果连接创建了一个双字符，则省略其中一个字符，因此“abc”和“cat”将生成“abcat”<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
("abc", "cat") -> "abcat"
("dog", "cat") -> "dogcat"	
("abc", "") -> "abc"
("", "cat") -> "cat"
("pig", "g") -> "pig"
("pig", "doggy") -> "pigdoggy"	
	 */
	
	public static boolean show2(int[] arr1,int[] arr2){
		if(arr1[0]==arr2[0]){
			return true;
		}else if(arr1[arr1.length-1]==arr2[arr2.length-1]){
			return true;
		}else{
			return false;
		}
		
	}
	
	/*
	## 项目标题  翻译的好玩一点.给学生看的文件夹名称
[title]
相同的元素
## 题目的描述  英文翻译
[description]
给定2个int数组a和b，如果它们具有相同的第一个元素或<br/>
它们具有相同的最后一个元素，则返回true。 两个数组的长度均为1或更大。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2, 3], [7, 3]) -> true
([1, 2, 3], [7, 3, 2]) -> false	
([1, 2, 3], [1, 3]) -> true	
([1, 2, 3], [1]) -> true
([1, 2, 3], [2]) -> false
	 */
	public static String show1(String s1,String s2){
		if(s1.length()>s2.length()){
			return s2+s1+s2;
		}else{
			return s1+s2+s1;
		}
	}
	/*
	## 题目的描述  英文翻译
[description]
给定2个字符串，a和b，返回一个形式为short + long + short的字符串，<br/>
外部有较短的字符串，内部有较长的字符串。 字符串的长度不会相同，<br/>
但它们可能为空（长度为0）。<br/>



## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
("Hello", "hi") -> "hiHellohi"
("hi", "Hello") -> "hiHellohi"
("aaa", "b") -> "baaab"
("b", "aaa") -> "baaab"
("aaa", "") -> "aaa"
("", "bb") -> "bb"
("aaa", "1234") -> "aaa1234aaa"
("aaa", "bb") -> "bbaaabb"
("a", "bb") -> "abba"
("bb", "a") -> "abba"
("xyz", "ab") -> "abxyzab"
	 */
	public static boolean catDog(String str){
		int cat=0;
		int dog=0;
		String reg1 = "cat";
		String reg2 = "dog";
		
		Pattern compile = Pattern.compile(reg1);
		Matcher matcher = compile.matcher(str);
		while(matcher.find()){
			cat++;
		}
		Pattern compile2 = Pattern.compile(reg2);
		Matcher matcher2 = compile2.matcher(str);
		while(matcher2.find()){
			dog++;
		}
		System.out.println(cat+":"+dog);
		if(cat==dog){
			return true;
		}else{
			return false;
		}
	}
	/*
	## 题目的描述
[description]
检查接受字符串里面有多少个cat和dog出现的次数是否相同，<br/>
如果cat和dog出现的次数相同就返回true<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)
[test.suits]
("catdog") -> true
("catcat") -> false
("1cat1cadodog") -> true
("catxxdogxxxdog") -> false
("catxdogxdogxcat") -> true
("catxdogxdogxca") -> false
("dogdogcat") -> false
("dogogcat") -> true
("dog") -> false
("cat") -> false
("ca") -> true
("c") -> true
("") -> true
	 */
	public static boolean bobThere(String str){
		boolean b= false;
		String regex="b.b";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(str);
		while(matcher.find()){
			String group = matcher.group();
			b = true;
		}
		return b;
	}
	/*
	## 题目的描述
[description]
给你一个字符串，如果包含bob就返回true<br/>
注意如果bob中的字符o,可以是任何字符<br/>
例如:bob返回true, bpb返回true<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)
[test.suits]
("abcbob") -> true
("b9b") -> true
("bac") -> false
("bbb") -> true
("abcdefb") -> false
("123abcbcdbabxyz") -> true
("b12") -> false
("b1b") -> true
("b12b1b") -> true
("bbc") -> false
("bbb") -> true
("bb") -> false
("b") -> false
	 */
	
	
	public static int[] biggerTwo(int[] arr1,int[] arr2){
		int sum1=0;
		int sum2=0;
		for (int i : arr1) {
			sum1+=i;
		}
		for (int i : arr2) {
			sum2+=i;
		}
		if(sum1==sum2){
			return arr1;
		}
		return sum1>sum2?arr1:arr2;
	}
	/*
	## 题目的描述  英文翻译
[description]
有两个整型数组，每个长度2.考虑每个数组中的值的总和。 <br/>
返回具有最大和的数组。 如果两数组的和相等，返回第一个数组。<br/>

## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
[test.suits]
([1, 2], [3, 4]) -> [3, 4]
([3, 4], [1, 2]) -> [3, 4]	
([1, 1], [1, 2]) -> [1, 2]	
([2, 1], [1, 1]) -> [2, 1]	
([2, 2], [1, 3]) -> [2, 2]	
([1, 3], [2, 2]) -> [1, 3]	
([6, 7], [3, 1]) -> [6, 7]	
	 */
}
