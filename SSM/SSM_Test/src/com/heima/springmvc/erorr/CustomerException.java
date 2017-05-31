package com.heima.springmvc.erorr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomerException implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// TODO Auto-generated method stub
		ModelAndView mod = new ModelAndView();
		if(ex instanceof MyException){
			mod.addObject("msg", ((MyException) ex).getMsg());
		}
		mod.setViewName("jsp/error.jsp");
		return mod;
	}

}