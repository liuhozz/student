package com.heima.store.service;

import java.sql.SQLException;
import java.util.List;

import com.heima.store.enty.PageModel;
import com.heima.store.enty.Product;

public interface ProductService {
//JOptionPane.showMessageDialog(null, list);
	List<Product> findnews() throws SQLException;
	List<Product> findhots() throws SQLException;
	
	PageModel findpage(String cid, int currnum) throws SQLException;
	Product pro_info(String pid) throws SQLException;
	PageModel findAll(int currnum) throws SQLException;
		
}
