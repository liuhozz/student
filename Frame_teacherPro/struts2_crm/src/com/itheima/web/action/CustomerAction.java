package com.itheima.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import com.itheima.service.impl.CustomerServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

import ognl.OgnlContext;
/**
 * 客户管理的Action
 * @author jt
 *
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

	// 模型驱动使用的对象
	private Customer customer = new Customer();
	@Override
	public Customer getModel() {
		return customer;
	}
	
	/**
	 *  查询客户列表的方法
	 * @return
	 */
	public String find(){
		// 调用业务层
		CustomerService customerService = new CustomerServiceImpl();
		List<Customer> list = customerService.find();
		// 页面跳转
		/*ServletActionContext.getRequest().setAttribute("list", list);*/
		ValueStack valueStack=ActionContext.getContext().getValueStack();
		valueStack.set("list", list);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		return "findSuccess";
	}
	
	/**
	 * 跳转到添加页面的方法
	 */
	public String saveUI(){
		return "saveUI";
	}
	
	/**
	 * 保存客户的方法
	 */
	public String save(){
		// 接收数据
		// 封装数据
		// 调用业务层
		CustomerService customerService = new CustomerServiceImpl();
		customerService.save(customer);
		// 页面跳转
		return "saveSuccess";
	}


	public String update(){
		CustomerService Service = new CustomerServiceImpl();
		Service.update(customer);
		return "saveSuccess";
	}
	
	public String findcustByid(){
		Long cust_id = customer.getCust_id();	//根据模型驱动过得传过来的ID
		CustomerService service=new CustomerServiceImpl();
		Customer customer2 = service.findcustByid(cust_id);	//service层调用
		ValueStack stack=ActionContext.getContext().getValueStack();//获取值栈
		stack.push(customer2);		//压栈
		return "edit";
	}

	public String del(){
		Long cust_id = customer.getCust_id();
		CustomerService service=new CustomerServiceImpl();
		service.delcustByid(cust_id);
		return "saveSuccess";
	}
}
