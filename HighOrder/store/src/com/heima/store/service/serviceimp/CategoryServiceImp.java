package com.heima.store.service.serviceimp;

import java.sql.SQLException;
import java.util.List;

import com.heima.store.dao.daoimp.CategoryDaoImp;
import com.heima.store.enty.Category;
import com.heima.store.service.CategoryService;

public class CategoryServiceImp implements CategoryService {

	@Override
	public List<Category> findAll() throws SQLException {
		
		return new CategoryDaoImp().findAll();
	}

}
