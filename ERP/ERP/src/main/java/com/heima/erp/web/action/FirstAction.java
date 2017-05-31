package com.heima.erp.web.action;
import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("111111111111111112222");
		return SUCCESS;
	}
	
	public String test(){
		System.out.println("dddddd");
		return null;
	}
}
