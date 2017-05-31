package cn.itcast.erp.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.erp.biz.IDepBiz;
import cn.itcast.erp.entity.Dep;

public class DepAction extends ActionSupport {

	private Dep dep;

	private int page;

	private int rows;

	public void setDep(Dep dep) {
		this.dep = dep;
	}

	public Dep getDep() {
		return dep;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	private IDepBiz depBiz;

	public void setDepBiz(IDepBiz depBiz) {
		this.depBiz = depBiz;
	}

	public void findAll() {
		List<Dep> list = depBiz.findAll();
		String jsonString = JSONArray.toJSONString(list);
		
		ToResponse(jsonString);
	}

	public void findByCrata() {
			List<Dep> list = depBiz.findByCrata(dep, page, rows);
			Map<String, Object> map = new HashMap<>();
			map.put("total", depBiz.getCount(dep));
			map.put("rows", list);
			String jsonString = JSONArray.toJSONString(map);
			
			ToResponse(jsonString);
	}

	public void save() {
		Map<String, Object> map = new HashMap<>();
		try {
			depBiz.save(dep);
			map.put("success", true);
			map.put("message", "新增成功");
			String jsonString = JSONArray.toJSONString(map);
			
			ToResponse(jsonString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			map.put("success", false);
			map.put("message", "新增失败");
			String jsonString = JSONArray.toJSONString(map);
			
			ToResponse(jsonString);
			e.printStackTrace();
		}

	}
	
	public void delete(){
		Map<String, Object> map = new HashMap<>();
		try {
			depBiz.delete(dep.getUuid());
			map.put("success", true);
			map.put("message", "删除成功");
			String jsonString = JSONArray.toJSONString(map);
			
			ToResponse(jsonString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			map.put("success", false);
			map.put("message", "删除失败");
			String jsonString = JSONArray.toJSONString(map);
			
			ToResponse(jsonString);
			e.printStackTrace();
		}
		
		
	}
	
	public void update(){
		Map<String, Object> map = new HashMap<>();
		try {
			depBiz.update(dep);
			map.put("success", true);
			map.put("message", "修改成功");
			String jsonString = JSONArray.toJSONString(map);
			
			ToResponse(jsonString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			map.put("success", false);
			map.put("message", "修改失败");
			String jsonString = JSONArray.toJSONString(map);
			
			ToResponse(jsonString);
			e.printStackTrace();
		}
	}
	
	public void getDepById(){
		Dep dep2 = depBiz.getDep(dep.getUuid());
		if(dep2 != null) {
			String jsonString = JSONArray.toJSONString(dep2);
			Map<String , Object> map = JSONArray.parseObject(jsonString);
			Map<String , Object> map2 = new HashMap<String, Object>();
			for (String key : map.keySet()) {
				map2.put("dep."+key, map.get(key));
			}
			
			String jsonString2 = JSONArray.toJSONString(map2);
			ToResponse(jsonString2);
		}else{
			JOptionPane.showMessageDialog(null, "1111111111111111");
		}
	}
	
	private void ToResponse(String jsonData){
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write(jsonData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
