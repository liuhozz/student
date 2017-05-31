
package com.heima.store.service.serviceimp;

import java.sql.SQLException;
import java.util.List;

import com.heima.store.dao.ProductDao;
import com.heima.store.dao.daoimp.ProductDaoImp;
import com.heima.store.enty.PageModel;
import com.heima.store.enty.Product;
import com.heima.store.service.ProductService;

public class ProductServiceImp implements ProductService {

	@Override
	public Product pro_info(String pid) throws SQLException {
		// TODO Auto-generated method stub
		ProductDao dao=new ProductDaoImp();
		
		return dao.pro_info(pid);
	}

	@Override
	public List<Product> findnews() throws SQLException {
		// TODO Auto-generated method stub
		ProductDao dao=new ProductDaoImp();
		
		return dao.findnews();
	}

	@Override
	public PageModel findpage(String cid, int currnum) throws SQLException {
		// TODO Auto-generated method stub
		ProductDao dao=new ProductDaoImp();
		int totalRecords=dao.findcount(cid);
		PageModel page=new PageModel(currnum, totalRecords, 12);
		List<Product> list = dao.findproBycid(cid, page.getStartIndex(), page.getPageSize());
		
		page.setList(list);
		return page;
	}

	@Override
	public List<Product> findhots() throws SQLException {
		// TODO Auto-generated method stub
		ProductDao dao=new ProductDaoImp();
		
		return dao.findhots();
	}

}
