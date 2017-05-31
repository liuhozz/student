package com.itheima.web.interceptor;

import org.apache.struts2.ServletActionContext;

import com.itheima.domain.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

@SuppressWarnings("serial")
public class Authorityinterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		User user = (User)ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user != null){
			return invocation.invoke();
		}else{
			ActionSupport actionSupport=(ActionSupport) invocation.getAction();
			actionSupport.addActionError("MDZZ登陆都没有登陆  还想进来我里面!!!!");
			return actionSupport.LOGIN;
		}
	}

}
