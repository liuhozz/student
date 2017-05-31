package cn.itcast.erp.biz;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import cn.itcast.erp.entity.Goods;
/**
 * 商品业务逻辑层接口
 * @author Administrator
 *
 */
public interface IGoodsBiz extends IBaseBiz<Goods>{

	/**
	 * 导出数据
	 * @param os
	 */
	void export(OutputStream os, Goods t1);
	
	/**
	 * 数据导入
	 * @param is
	 */
	void doImport(InputStream is) throws IOException;
}

