package com.heima.store.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.store.base.BaseServlet;
import com.heima.store.enty.Category;
import com.heima.store.service.CategoryService;
import com.heima.store.service.serviceimp.CategoryServiceImp;
import com.heima.store.utils.JedisUtils;
import com.heima.store.utils.JsonUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Servlet implementation class CategoryServlet
 */
public class CategoryServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    
    public String findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	JedisPoolConfig config=new JedisPoolConfig();
    	config.setMaxTotal(50);
    	config.setMaxIdle(10);
    	
    	Jedis jedis=JedisUtils.getJedis();
    	try {
    		
    		String jsonstr = jedis.get("categoryStr");
    		if(jsonstr == null || "".equals(jsonstr)){
    		
    		CategoryService service=new CategoryServiceImp();
			 List<Category> list = service.findAll();
			 
			 jsonstr = JsonUtil.list2json(list);
			 jedis.set("categoryStr", jsonstr);
    		}
    		
			 response.setContentType("application/json;charset=utf-8");
				response.getWriter().print(jsonstr);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JedisUtils.closeJedis(jedis);
			
		}
    	return  null;
    }
}
