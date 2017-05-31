package com.heima.store.service;

import java.sql.SQLException;
import java.util.List;

import com.heima.store.enty.Category;

public interface CategoryService {

	List<Category> findAll() throws SQLException;
}
