package com.heima.store.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.heima.store.enty.User;

public class PriviledgeFilter implements Filter {
	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) req;
		User user = (User)request.getSession().getAttribute("user");
		if(user != null){
			chain.doFilter(request, resp);
		}else{
			
			request.setAttribute("msg", "请登录后再访问");
			request.getRequestDispatcher("info.jsp").forward(request, resp);
		}
	}

    public PriviledgeFilter() {
    }

	public void destroy() {
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
