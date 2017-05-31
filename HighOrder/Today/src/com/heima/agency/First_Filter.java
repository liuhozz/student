package com.heima.agency;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class First_Filter implements Filter {

	public First_Filter() {
	}

	public void destroy() {
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// chain.doFilter(request, response);
		final HttpServletRequest req = (HttpServletRequest) request;
		InvocationHandler h = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {//method是从jsp传过来的request对象的方法    
				//还是servlet的request的方法
				// TODO Auto-generated method stub
				Object obj = null;
				if ("getParameter".equalsIgnoreCase(method.getName())) {
					if ("get".equalsIgnoreCase(req.getMethod())) {
						String name = (String) method.invoke(req,args);  
						String vname=new String(name.getBytes("iso-8859-1"),"utf-8");
						return vname;									
					}else{
						req.setCharacterEncoding("utf-8");
						obj=method.invoke(req, args);
					}
				}else{
					obj=method.invoke(req, args);
				}

				return obj;
			}
			
		};
		HttpServletRequest myreq = (HttpServletRequest) Proxy.newProxyInstance(First_Filter.class.getClassLoader(),
				request.getClass().getInterfaces(), h);
		chain.doFilter(myreq, response);

	}

}
