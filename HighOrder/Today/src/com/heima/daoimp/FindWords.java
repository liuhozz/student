package com.heima.daoimp;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.heima.dao.Find;
import com.heima.enty.Words;
import com.heima.util.JDBCUtil02;

public class FindWords implements Find {

	@Override
	public List<Words> findwords(String words) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtil02.getDaraSource());
		String sql="select * from words where words like ?";
		return runner.query(sql, new BeanListHandler<Words>(Words.class), words+"%");
	}

}
