package com.heima.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class Coding
 */
public class Coding implements Filter {

    public Coding() {
    }
	public void destroy() {
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		req.setCharacterEncoding("utf-8");
		
		chain.doFilter(req, response);
	}

}
