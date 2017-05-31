package com.heima.store.dao;

import java.sql.SQLException;
import java.util.List;

import com.heima.store.enty.Product;

public interface ProductDao {

	List<Product> findnews() throws SQLException;
	List<Product> findhots() throws SQLException;
	
	List<Product> findproBycid(String cid, int startIndex, int pageSize) throws SQLException;
	
	Product pro_info(String pid)throws SQLException;
	
	int findcount(String cid) throws SQLException;
	
	List<Product> findAll( int startIndex, int pageSize) throws SQLException;
	
	int findcount(int currnum)throws SQLException;
}
