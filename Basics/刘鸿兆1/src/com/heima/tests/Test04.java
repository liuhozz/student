package com.heima.tests;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test04 {

	/**
	 * 需求：键盘录入一段字符串,要求使用map集合统计出字符串中字母和数字出现的次数,如果有其他字符则当做*号来统计,最后按指定方式输出(不要求排序)
	 * 例如录入字符串:aaaabbbcccddd1112233^^^ 输出的格式为:
	 * *(3),1(3),2(2),3(2),a(4),b(3),c(3),d(3) (注意:括号前面是字符,里面是次数)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); 				//sc.next()遇到空格的时候不会录入到字符串里面
		Pattern p = Pattern.compile("[a-zA-Z0-9]");
		Matcher m = p.matcher(input);
		int count = 0;

		HashMap<Character, Integer> hm = new HashMap<>();
		System.out.println(input.length());

		for (int i = 0; i < input.length(); i++) {
			if (m.find())

				if (!hm.containsKey(input.charAt(input.indexOf(m.group())))) {
					//System.out.println("11111111111"+m.group());
					hm.put(input.charAt(input.indexOf(m.group())), 1);
				} else {
					//System.out.println("22222222222"+m.group());
					hm.put(input.charAt(input.indexOf(m.group())),
							hm.get(input.charAt(input.indexOf(m.group()))) + 1);
				}
			else {
				//System.out.println("333333333333");
				count++;
			}
		}

		// System.out.println("*("+count+")");
		String s = "";
		Set<Character> khm = hm.keySet();
		for (Character character : khm) {
			s += character + "(" + hm.get(character) + ")" + ",";
		}
		s = s.substring(0, s.length() - 1);
		System.out.println("*(" + count + ")" + "," + s);

	}

}
