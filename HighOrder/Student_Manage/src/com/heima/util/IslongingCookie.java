package com.heima.util;

import javax.servlet.http.Cookie;

public class IslongingCookie {
	
	
	
	public static Cookie iscookie(Cookie cookie[],String name){
		//cookie=cookie1;
		for (Cookie coo : cookie) {
			if(name==coo.getName()){
				return coo;
			}
		}
		
		
		
		return null;
	}

}
