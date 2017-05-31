package cn.itcast.erp.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.itcast.erp.biz.IGoodsBiz;
import cn.itcast.erp.entity.Goods;
import cn.itcast.erp.exception.ErpException;

/**
 * 商品Action
 * 
 * @author Administrator
 *
 */
public class GoodsAction extends BaseAction<Goods> {

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	private File file;// 上传文件
	private String fileFileName;// 文件名
	private String fileContentType;// 文件类型
	private IGoodsBiz goodsBiz;

	public void setGoodsBiz(IGoodsBiz goodsBiz) {
		this.goodsBiz = goodsBiz;
		super.setBaseBiz(this.goodsBiz);
	}

	/**
	 * 导出excel文件
	 */
	public void export() {
		String filename = "商品.xls";
		HttpServletResponse response = ServletActionContext.getResponse();

		try {
			response.setHeader("Content-Disposition",
					"attachment;filename=" + new String(filename.getBytes(), "ISO-8859-1"));// 中文名称进行转码
			goodsBiz.export(response.getOutputStream(), getT());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 导入数据
	 */
	public void doImport() {
		// 文件类型判断
		if (!"application/vnd.ms-excel".equals(fileContentType)) {

			ajaxReturn(false, "上传的文件必须为excel文件");
			return;
		}
		try {
			goodsBiz.doImport(new FileInputStream(file));
			ajaxReturn(true, "上传的文件成功");
		} catch (ErpException e) {
			ajaxReturn(false, e.getMessage());
		} catch (IOException e1) {
			ajaxReturn(false, "上传的文件失败");
			e1.printStackTrace();
		}
	}
}
