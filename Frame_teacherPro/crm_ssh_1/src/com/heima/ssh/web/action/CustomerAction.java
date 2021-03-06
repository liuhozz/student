package com.heima.ssh.web.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.heima.ssh.enty.Customer;
import com.heima.ssh.enty.PageModel;
import com.heima.ssh.service.CustomerService;
import com.heima.ssh.utils.UUIDUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	
	private Customer customer=new Customer(); 
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}

	private Integer currPage = 1;
	
	public void setCurrPage(Integer currPage) {
		if(currPage == null)
			currPage = 1;
		this.currPage = currPage;
	}
	
	private Integer pageSize = 3;

	public void setPageSize(Integer pageSize) {
		if(pageSize == null)
			pageSize = 3;
		this.pageSize = pageSize;
	}

	private CustomerService customerService;
	/**
	 * @param customerService the customerService to set
	 */
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	/**
	 * 在Struts中文件上传首先需要三个属性
	 * inputname+filename
	 * inputname
	 * inputname+ContentType
	 * @return
	 */
	
	private String uploadFileName;
	private File upload;
	private String uploadContentType;
	
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String save() throws IOException{
		//文件上传
		if(upload != null){
			String extensions = uploadFileName.substring(uploadFileName.lastIndexOf("."));
			String fileName=UUIDUtils.getId()+extensions;
			String path="F:/upload";
			File make = new File(path);
			if(!make.exists()){
				make.mkdirs();
			}
			File newmake = new File(path+"/"+fileName);
			FileUtils.copyFile(upload, newmake);
			
		}
		
		customerService.save(customer);
		return "successSave";
	}
	
	public String findAll(){
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
		System.out.println(currPage + "			" + pageSize);
		PageModel pageModel=customerService.findByPage(detachedCriteria,currPage,pageSize);
		ActionContext.getContext().getValueStack().push(pageModel);
		return "successfind";
	}
	
	public String saveUI(){
		return SUCCESS;
	}
}
