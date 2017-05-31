package com.itheima.test3_系统题补充1;

public class dateFashion_class {

	/**
	 ## 题目的描述  英文翻译
	[description]
	如果你和你的约会对象时尚值其中有一个大于等于8你们就能得到桌子(返回值是2),<br/>
	但如果你们其中一个的时尚值小于等于二那你们是肯定不能进去的(返回值是0),<br/>
	其他时尚值的话就不确定(返回值是1)<br/>
	
	## 测试用例 (每行显示一条测试用例，格式为(参数1,参数2) -> 期望结果)  -> 换成 ->
	[test.suits]
	(5, 10) -> 2	
	(5, 2) -> 0	
	(5, 5) -> 1	
	(3, 3) -> 1
	(10, 2) -> 0
	(2, 9) -> 0	
	(9, 9) -> 2	
	(10, 5) -> 2	
	(2, 2) -> 0
	(3, 7) -> 1	
	(2, 7) -> 0	
	(6, 2) -> 0	
	 */
	public static void main(String[] args) {
		
		System.out.println(dateFashion(10, 5));
		System.out.println(dateFashion(2, 2));
		System.out.println(dateFashion(3, 7));
		System.out.println(dateFashion(2, 7));
		System.out.println(dateFashion(6, 2));
	}	
	
	public static int dateFashion(int a,int b){
		if(a>=8||b>=8){
			return 2;
		}else if(a<=2 || b<=2){
			return 0;
		}else{
			return 1;
		}
	}
}
