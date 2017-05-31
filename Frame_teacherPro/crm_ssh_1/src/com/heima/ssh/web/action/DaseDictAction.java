package com.heima.ssh.web.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.heima.ssh.enty.DaseDict;
import com.heima.ssh.service.DaseDictService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

public class DaseDictAction extends ActionSupport implements ModelDriven<DaseDict> {

	private DaseDict daseDict=new DaseDict();
	@Override
	public DaseDict getModel() {
		// TODO Auto-generated method stub
		return daseDict;
	}

	private DaseDictService daseDictService;
	
	public void setDaseDictService(DaseDictService daseDictService) {
		this.daseDictService = daseDictService;
	}

	/*private String dict_type_code;
	
	public void setDict_type_code(String dict_type_code) {
		this.dict_type_code = dict_type_code;
	}*/

	public String findDict() throws IOException{
		List<DaseDict> list = daseDictService.findDictBytype_code(daseDict.getDict_type_code());
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.setExcludes(new String[]{"dict_sort","dict_enable","dict_memo","dict_type_name"});
		JSONArray array = JSONArray.fromObject(list,jsonConfig);
		ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
		ServletActionContext.getResponse().getWriter().println(array.toString());
		
		return NONE;
	}
	
	
}
