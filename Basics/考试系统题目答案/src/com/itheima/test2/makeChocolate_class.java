package com.itheima.test2;

public class makeChocolate_class {

	/**
	�ɿ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeChocolate(4,4,15));
	}
	
	public static int makeChocolate(int xiao,int da,int len){//4,4,18
		/*int sum = xiao+da*5;
		if(len>=sum){
			if(da*5>=len){
				len = len%5;
			}else{
				len=len-(da*5);
			}
			for (int i = 0; i <=xiao; i++) {
				if(len<=0){
					return i;
				}else{
					len=len-1;
				}
			}
		}
		return -1;*/
		int sum = xiao+da*5;
		if(len>=sum){
			if(da*5>len){
				len = len%5;
			}else{
				len=len-(da*5);
			}
			for (int i = 0; i <= xiao; i++) {
				if(len<=0){
					return i;
				}else{
					len=len-1;
				}
			}
		}
		return -1;
	}
}
