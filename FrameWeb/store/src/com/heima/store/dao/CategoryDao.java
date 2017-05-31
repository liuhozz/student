package com.heima.store.dao;

import java.sql.SQLException;
import java.util.List;

import com.heima.store.enty.Category;

public interface CategoryDao {

	List<Category> findAll() throws SQLException;
}
