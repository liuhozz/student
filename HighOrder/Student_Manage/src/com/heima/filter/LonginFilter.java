package com.heima.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.heima.util.IslongingCookie;

/**
 * Servlet Filter implementation class LonginFilter
 */
public class LonginFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		Cookie cookie = IslongingCookie.iscookie(req.getCookies(), "username");
		if(cookie!=null){
			
		}
		
		
		chain.doFilter(request, response);
	}
	
	
	
	
	public LonginFilter() {
	}
	
	public void destroy() {
	}
	
	
	public void init(FilterConfig fConfig) throws ServletException {
	}
}
