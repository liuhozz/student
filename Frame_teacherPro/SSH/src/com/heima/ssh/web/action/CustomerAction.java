package com.heima.ssh.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.heima.ssh.Service.CustomerService;
import com.heima.ssh.enty.Customer;
import com.heima.ssh.enty.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}

	private CustomerService customerService;
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public String saveUI(){
		List<User> list = customerService.findUser();
		ActionContext.getContext().getValueStack().set("list", list);
		return "successUI";
	}
	
	
	public String save(){
		customerService.save(customer);
		return "successSave";
	}
	
	public String del(){
		
		customerService.del(customer);
		return "successSave";
	}
	
	public String findAll(){
		
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
		
		if(customer.getCust_name() != null && !"".equals(customer.getCust_name())){
			detachedCriteria.add(Restrictions.like("cust_name", "%" + customer.getCust_name() + "%"));
		}
		
		if(customer.getCust_type() != null && !"".equals(customer.getCust_type())){
			detachedCriteria.add(Restrictions.like("cust_type", "%" + customer.getCust_type() + "%"));
		}
		
		List<Customer> list=customerService.findAll(detachedCriteria);
		
		ActionContext.getContext().getValueStack().set("list", list);
		
		return SUCCESS;
	}
	
	public String editUI(){
		Customer cust = customerService.findByid(customer.getCid());
		ActionContext.getContext().getValueStack().push(cust);
		List<User> list = customerService.findUser();
		ActionContext.getContext().getValueStack().set("list", list);
		return "sueditUI";
	}
	
	
	public String update(){
		
		customerService.update(customer);
		return "successSave";
	}
}
