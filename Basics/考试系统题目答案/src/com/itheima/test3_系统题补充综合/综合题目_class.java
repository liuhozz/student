package com.itheima.test3_ϵͳ�ⲹ���ۺ�;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class �ۺ���Ŀ_class {

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
	 * ## ��Ŀ������
[description]
����һ�ַ�������ȡ�����ַ�����ͷ�ͽ�β��ͬ�������Ҳ����ص��������ء�<br/>
���磺sameEnds("abXab") is "ab"


## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)
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
	 ## ��Ŀ������  Ӣ�ķ���
[description]
����һ���Ǹ��������Ͳ��������������10��������10С1��2�ķ�Χ�ڣ�<br/>
��������0��2����������Χ�ڣ��򷵻�true�����򷵻�false��<br/>


## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 ## ��Ŀ������  Ӣ�ķ���
[description]
����һ���Ǹ��������������20��������20С1����2�򷵻�true�����磬38��39�򷵻�true��40�򷵻�false��<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	
## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
û��ǰ2���ַ���

## ��Ŀ������  Ӣ�ķ���
[description]
����һ���ַ���������һ��û��ǰ2���ַ��İ汾�� �����һ���ַ���'a'��������һ���ַ�<br/>
����ڶ����ַ���'b'�� �����ڶ����ַ����ַ������������ⳤ�ȡ� <br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
 ## ��Ŀ������  Ӣ�ķ���
[description]
�������������������������Ͳ�����ʾ��ʾ���ӵĵ�������һ���ǲ���������noDoubles.<br/>
��������������ӵ������ܺͣ�(���ӵĵ�����Χ��1��6),���noDoublesΪtrueʱ��<br/>
����������ӵ�ֵ��ͬ�����������ӵĵ����ܺͼ�1������������Ӷ���ʾΪ6ʱ��<br/>
������һ�����ӵ����û���1�ٽ������<br/>
 
## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 ## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
���ҵ�1

## ��Ŀ������  Ӣ�ķ���
[description]
���ǻ�˵���������н�����3��1��һ�������ҵġ�1.��������������������ǰ2�������2��λ�ð���һ�����ҵ�1������true��<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 ## ��Ŀ������  Ӣ�ķ���
[description]
�����������Ͳ������������ǵĺ͡����������������һ����13��19��������֮�䣬<br/>
���������ĺ���19֮�䣬�򷵻�19.<br/>



## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	## ��Ŀ������  Ӣ�ķ���
[description]
�������ھ���һ���в���ǹ��ľۻᣬ���ؾۻ������intֵ��ʾ��0 =����1 =�ã���2 =�ܺã�<br/>
����ǹ��Ͳ����������5�����򷵻غã�1��������ǹ��Ͳ��������5���ϣ�����һ����������<br/>
��һ�������������������򷵻غܺã�2�����������ǵ�������һ��С��5�򷵻ػ���0����<br/>


## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 ## ��Ŀ������  Ӣ�ķ���
[description]
���������Ǹ�����a��b��������ǵĺ͵�����λ����a��λ����ͬ������a��b�ĺ͡�<br/>
����͵�λ������a������λ������ֻ�践��a��<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
��1��ʼ��Ԫ��

## ��Ŀ������  Ӣ�ķ���
[description]
���������ⳤ�ȵ��������飬 �����ж��ٸ�������1��Ϊ���ǵĵ�һ��Ԫ�ء�<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	## ��Ŀ������  Ӣ�ķ���
[description]
�����尢���е�����һ�������ʱ�䶼���������棬ǰ���������¶ȵñ�����60��90��������֮�䡣<br/>
����������죬�������͵��¶ȿ��Ըߴ�100��������������һ��int���͵��¶Ⱥ�boolean���͵�isSummer�Ĳ�����<br/>
��������ǿ������򷵻�true����֮��Ϊfalse��<br/>



## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
		//%10�õ���λ
		// /10�õ�ʮλ
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
	 ## ��Ŀ������  Ӣ�ķ���
[description]
��������int������Χ��10��99֮�䣬�����һ�����ֶ����������������У�<br/>
�򷵻�true�����磬��23���͡�12���ж���2���򷵻�ֵΪtrue��<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 * ## ��Ŀ������
[description]
����һ�ַ�������ȡ�����ַ�����ͷ�ͽ�β��ͬ�������Ҳ����ص��������ء�<br/>
���磺sameEnds("abXab") is "ab"


## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)
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
	 * ## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
��������תһλ
## ��Ŀ������  Ӣ�ķ���
[description]
����һ��ints����Ϊ3�����飬����һ������Ԫ�ء�rotate left�������飬����{1,2,3}�õ�{2,3,1}��<br/>
## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 * ## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
���鷴ת
## ��Ŀ������  Ӣ�ķ���
[description]
����һ��int���鳤��Ϊ3������һ���µ����飬Ԫ�ص�˳���෴������{1,2,3}���{3,2,1}��<br/>
## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 * ## ��Ŀ������
[description]
����һ���ַ�������������, <br/>
��ȡ�ַ�����ǰnλ, ƴ����ǰn-1λ, ��ƴ��n-2λ,��n-3�Դ�����...<br/>
n�ķ�ΧӦ����0���ַ�������֮��.

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)
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
	 * ## ��Ŀ������
[description]
����һ���ַ�������������, <br/>
���ַ��������n���ַ��ظ�n��,���س���.<br/>
n�ķ�ΧӦ����0���ַ�������֮��.

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)
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
 * ## ��Ŀ������  Ӣ�ķ���
[description]
�������һ�Ų�Ʊ����ʾintֵa��b��c����Χ��0��1��2��������ǵ�ֵ����2ʱ��<br/>
�򷵻�10���������Ϊ2������������ͬ�򷵻�5������ֻҪb��c����ͬ��a�򷵻�1���������������0.<br/>
 
## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 * ## ��Ŀ������  Ӣ�ķ���
[description]
����һ���Ǹ����������3����5�ı������򷵻�true���������3��5��ͬ�ı����򷵻�false��<br/>


## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 * ## ��Ŀ������  Ӣ�ķ���
[description]
����һ���Ǹ��������Ͳ��������������10��������10С1��2�ķ�Χ�ڣ�<br/>
��������0��2����������Χ�ڣ��򷵻�true�����򷵻�false��<br/>


## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 * ## ��Ŀ������
[description]
����һ���ַ������ڸ����ַ����Ŀ�ʼ�ͽ���ʱѰ��һ��������󣩵��ַ�����<br/>
���仰˵��������ַ���һ�������ַ������������ַ����Ľ�β���������ص��������磬�ַ�����abxyzba�����ӡ�AB���Ľ�����


## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)
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
	 * ## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
����Ϊ3��������

## ��Ŀ������  Ӣ�ķ���
[description]
�����������ȵ�int���飬����һ�������鳤��3�����а��������м��Ԫ�ء� ���鳤������Ϊ3��<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 * ## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
ȡ��������м�Ԫ��
## ��Ŀ������  Ӣ�ķ���
[description]
����2��int���飬a��b��ÿ������Ϊ3������һ�������м�Ԫ�ص������鳤��2��<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 * ## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
��������Ԫ��
## ��Ŀ������  Ӣ�ķ���
[description]
����һ��ints����Ϊ3�����飬���������������еĵ�һ�������һ��Ԫ�أ�<br/>
������������Ԫ������Ϊ��ֵ�� ���ظ��ĵ����顣<br/>
## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
�����м��Ԫ��

## ��Ŀ������  Ӣ�ķ���
[description]
����һ��ż�����ȵ�int���飬����һ������ԭʼ�����м�����Ԫ�ص������鳤��2�� ԭʼ���鳤��Ϊ2�������<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 ## ��Ŀ������  Ӣ�ķ���
[description]
����һ��int���飬����һ�����ȼӱ��������飬�����һ��Ԫ����ԭʼ������ͬ��<br/>
��������Ԫ�ض�Ϊ0.ԭʼ���鳤��Ϊ1����� ע�⣺Ĭ������£�һ���µ�int�����������0��<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 ## ��Ŀ������  Ӣ�ķ���
[description]
����2��int����a��b������һ���µ����鳤��2��������Ԫ�ش�a�������b��Ԫ�ء�<br/>
���п������κγ��ȣ�����0��������2������֮�佫����2������������Ԫ�ء�<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	## ��Ŀ������  Ӣ�ķ���
[description]
����һ���ַ����������bad���������ַ����е�����0��1�����򷵻�true��<br/>
���硰badxxx����xbadxx���������ǡ�xxbadxx���� �ַ����������κγ��ȣ�<br/>
����0.ע�⣺ʹ��.equals�������Ƚ�2���ַ�����<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
## ��Ŀ������  Ӣ�ķ���
[description]
�����κγ��ȵ�int���飬��������ǰ2��Ԫ�ص������顣 �������С�ڳ���2����ʹ���κδ��ڵ�Ԫ�ء�<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	## ��Ŀ������  Ӣ�ķ���
[description]
����2��int���飬�κγ��ȵ�a��b������һ������ÿ������ĵ�һ��Ԫ�ص������顣<br/>
�����һ����ĳ���Ϊ0������Ը����顣<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 ## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
�ı�ָ��������Ԫ��

## ��Ŀ������  Ӣ�ķ���
[description]
����һ��int���鳤��3�������������һ��2��������3����3Ԫ������Ϊ0.���ظ��ĵ����顣<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 *## ��Ŀ������  Ӣ�ķ���
[description]
����һ��int���飬���6��ʾΪ�����еĵ�һ�������һ��Ԫ�أ��򷵻�true�� ���鳤��Ϊ1�������<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 ## ��Ŀ������
[description]
�����а�����1���������Ǹ�����<b>�ַ���</b>��<br/>
Ҫ������������ÿ���ַ�����һ��<br/>
���磬�������ַ���Ϊ"abc"�����ؽ��Ϊ"aabbcc"</br>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)
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
	## ��Ŀ������  Ӣ�ķ���
[description]
����һ���ַ���������һ��û��ǰ2���ַ��İ汾�� �����һ���ַ���'a'��������һ���ַ�<br/>
����ڶ����ַ���'b'�� �����ڶ����ַ����ַ������������ⳤ�ȡ� <br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	 ## ��Ŀ������
[description]
�������ַ�������code���ֵĴ�����<br/>
����code���ֵĴ���<br/>
ע��:���ڳ���Ա�ɻϸ��,code�ĵ������ַ�d,���ܴ����.
����,cobe, come, cope co*e �������ַ���Ҫ��������.

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)
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
	## ��Ŀ������  Ӣ�ķ���
[description]
���������ַ����������Ǹ�����һ�𣨳�Ϊ�����á����������ؽ����<br/> 
���ǣ�������Ӵ�����һ��˫�ַ�����ʡ������һ���ַ�����ˡ�abc���͡�cat�������ɡ�abcat��<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	## ��Ŀ����  ����ĺ���һ��.��ѧ�������ļ�������
[title]
��ͬ��Ԫ��
## ��Ŀ������  Ӣ�ķ���
[description]
����2��int����a��b��������Ǿ�����ͬ�ĵ�һ��Ԫ�ػ�<br/>
���Ǿ�����ͬ�����һ��Ԫ�أ��򷵻�true�� ��������ĳ��Ⱦ�Ϊ1�����<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	## ��Ŀ������  Ӣ�ķ���
[description]
����2���ַ�����a��b������һ����ʽΪshort + long + short���ַ�����<br/>
�ⲿ�н϶̵��ַ������ڲ��нϳ����ַ����� �ַ����ĳ��Ȳ�����ͬ��<br/>
�����ǿ���Ϊ�գ�����Ϊ0����<br/>



## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
	## ��Ŀ������
[description]
�������ַ��������ж��ٸ�cat��dog���ֵĴ����Ƿ���ͬ��<br/>
���cat��dog���ֵĴ�����ͬ�ͷ���true<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)
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
	## ��Ŀ������
[description]
����һ���ַ������������bob�ͷ���true<br/>
ע�����bob�е��ַ�o,�������κ��ַ�<br/>
����:bob����true, bpb����true<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)
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
	## ��Ŀ������  Ӣ�ķ���
[description]
�������������飬ÿ������2.����ÿ�������е�ֵ���ܺ͡� <br/>
���ؾ������͵����顣 ���������ĺ���ȣ����ص�һ�����顣<br/>

## �������� (ÿ����ʾһ��������������ʽΪ(����1,����2) -> �������)  -> ���� ->
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
