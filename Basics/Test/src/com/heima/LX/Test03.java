package com.heima.LX;


public class Test03 {

	/**
	 * ����һ���ַ��������ظ��ַ������������ָ��������ַ�������
	 * 
	 * ���ж��ǲ����ظ� �ǵĻ� count++ Ȼ���ڶ���һ���±��� ��count�Ƚ� ���ǲ��Ǳ��±�����?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hoooplaoodsfseoodoooooddhdjdoooooo";
		// a
		int b = 0;
		//int arr[] = new int[s.length()];
		for (int i = 0; i < s.length() ; i++) {
			// s.charAt(i);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					if (s.charAt(i) == s.charAt(j)) {

						count++;
					} 
					
				} else {
					count = 0;
				}
				if(b<count)
					b=count;
			}
			// System.out.println(count);
			//arr[i] = count;
			//System.out.print(arr[i]);
			
			
		}
		System.out.print("|"+b);
		//Arrays.sort(arr);

	}
}
