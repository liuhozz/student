package com.heima.dao;

import java.sql.SQLException;
import java.util.List;

import com.heima.enty.Words;

public interface Find {
	
	List<Words> findwords(String words) throws SQLException;

}
