package cn.itcast.erp.biz.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import cn.itcast.erp.biz.IGoodsBiz;
import cn.itcast.erp.dao.IGoodsDao;
import cn.itcast.erp.dao.IGoodstypeDao;
import cn.itcast.erp.entity.Goods;
import cn.itcast.erp.entity.Goodstype;
import cn.itcast.erp.exception.ErpException;

/**
 * 商品业务逻辑类
 * 
 * @author Administrator
 *
 */
public class GoodsBiz extends BaseBiz<Goods> implements IGoodsBiz {

	private IGoodsDao goodsDao;
	private IGoodstypeDao goodstypeDao;

	public void setGoodstypeDao(IGoodstypeDao goodstypeDao){
		this.goodstypeDao = goodstypeDao;
	}

	public void setGoodsDao(IGoodsDao goodsDao) {
		this.goodsDao = goodsDao;
		super.setBaseDao(this.goodsDao);
	}

	/**
	 * 导出数据
	 */
	@Override
	public void export(OutputStream os, Goods t1) {
		// 根据查询条件获取商品表
		List<Goods> goodsList = super.getList(t1, null, null);
		// 创建excel工作簿
		HSSFWorkbook wk = new HSSFWorkbook();
		HSSFSheet sheet = wk.createSheet("商品");
		// 写入表头
		HSSFRow row = sheet.createRow(0);
		// 定义好每一列的标题
		String[] headerNames = { "名称", "产地", "厂家", "计量单位", "进货价格", "销售价格", "商品类型" };
		// 指定每一列的宽度
		int[] columnWidths = { 4000, 4000, 8000, 4000, 4000, 4000, 4000, 4000 };
		// 创建一个单元格
		HSSFCell cell = null;
		for (int i = 0; i < headerNames.length; i++) {
			cell = row.createCell(i);
			// 这是单元格里面的值,根据下标设置
			cell.setCellValue(headerNames[i]);
			// 设置单元格的宽度
			sheet.setColumnWidth(i, columnWidths[i]);
		}
		// 写入内容
		int i = 1;
		for (Goods goods : goodsList) {
			row = sheet.createRow(i);
			// 必须按照hderarNames 的顺序来
			row.createCell(0).setCellValue(goods.getName());// 名称
			row.createCell(1).setCellValue(goods.getOrigin());// 产地
			row.createCell(2).setCellValue(goods.getProducer());// 厂家
			row.createCell(3).setCellValue(goods.getUnit());// 计量单位
			row.createCell(4).setCellValue(goods.getInprice());// 进货价格
			row.createCell(5).setCellValue(goods.getOutprice());// 销售价格
			row.createCell(6).setCellValue(goods.getGoodstype().getName());// 商品类型
			i++;
		}
		try {
			// 写入到输出中
			wk.write(os);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭工作薄
				wk.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 导入数据
	 */
	@Override
	public void doImport(InputStream is) throws IOException {
		HSSFWorkbook wb = null;
		try {
			wb = new HSSFWorkbook(is);
			HSSFSheet sheet = wb.getSheetAt(0);
			String type = "";
			if ("商品".equals(sheet.getSheetName())) {
				type = "商品";
			} else {
				throw new ErpException("名字不对,请重新提交");
			}
			// 读取数据
			// 最后一行的行号
			int lastRow = sheet.getLastRowNum();
			Goods goods = null;
			for (int i = 1; i < lastRow; i++) {
				goods = new Goods();
				goods.setName(sheet.getRow(i).getCell(0).getStringCellValue());// 商品名称
				// 判断是否已经存在,通过名称来判断
				List<Goods> list = goodsDao.getList(null, goods, null);
				if (list.size() > 0) {
					goods = list.get(0);
				}
				List<Goodstype> goodstypelist = goodstypeDao.getList(null, null, null);
				Map<String, Goodstype> map = new HashMap<>();
				for (Goodstype goodstype2 : goodstypelist) {
					map.put(goodstype2.getName(), goodstype2);
				}

				goods.setOrigin(sheet.getRow(i).getCell(1).getStringCellValue());
				goods.setProducer(sheet.getRow(i).getCell(2).getStringCellValue());
				goods.setUnit(sheet.getRow(i).getCell(3).getStringCellValue());
				goods.setInprice(sheet.getRow(i).getCell(4).getNumericCellValue());
				goods.setOutprice(sheet.getRow(i).getCell(5).getNumericCellValue());
				String name = sheet.getRow(i).getCell(6).getStringCellValue();
				goods.setGoodstype(map.get(name));
				if(list.size()==0){
					goodsDao.add(goods);
				}
			}
		} finally {
			if (null != wb) {
				try {
					wb.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
