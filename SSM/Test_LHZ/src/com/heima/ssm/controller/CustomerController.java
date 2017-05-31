package com.heima.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.heima.ssm.pojo.SCust;
import com.heima.ssm.pojo.SUser;
import com.heima.ssm.service.CustService;
import com.heima.ssm.service.LoginService;

@Controller
public class CustomerController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private CustService custService;
	
	@RequestMapping("login")
	public String login(SUser user,HttpServletRequest request,Model model){
		
		SUser loginUser = loginService.login(user);
		request.getSession().setAttribute("loginUser", loginUser);
		if(loginUser != null){
			return "index";
		}
		model.addAttribute("msg", "登陆失败");
		return "login";
	}
	
	@RequestMapping("custList")
	public String getList(Model model){
		List<SCust> list = custService.getList();
		model.addAttribute("list", list);
		return "center";
	}
	
	@RequestMapping("del")
	public String del(Integer id){
		custService.delCust(id);
		return "redirect:custList.action";
	}
	
}
