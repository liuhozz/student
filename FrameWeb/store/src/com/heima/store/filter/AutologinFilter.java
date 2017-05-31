package com.heima.store.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.heima.store.utils.CookUtils;

/**
 * Servlet Filter implementation class Autologin
 */
public class AutologinFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		Cookie jsession = CookUtils.getCookieByName("JSESSIONID", req.getCookies());
		Cookie user = CookUtils.getCookieByName("user", req.getCookies());
		if(jsession != null){
			jsession.setValue(user.getValue());
		}else{
		}
		chain.doFilter(req, response);
	}

    public AutologinFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
