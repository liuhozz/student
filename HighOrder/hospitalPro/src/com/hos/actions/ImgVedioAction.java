/**
 * 
 */
package com.hos.actions;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.hos.beans.Img_Vedio;
import com.hos.serviceDao.ServiceIV;
import com.hos.serviceImp.ServiceIVimp;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 * 
 */
public class ImgVedioAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ServiceIV s=new ServiceIVimp();;
	Img_Vedio iv = new Img_Vedio();
	private int id;
	private List<Img_Vedio> listiv;
	private Img_Vedio imv;
	private String a;  //���
	private String b;  //����
	private String c;  //����
	private String d;   //·��
	private String e;   //�ϴ�����
	private String path;

	public ImgVedioAction() {
		// TODO Auto-generated constructor stub
	}

	public List<Img_Vedio> getListiv() {
		return listiv;
	}

	public void setListiv(List<Img_Vedio> listiv) {
		this.listiv = listiv;
	}
	public void setImv(Img_Vedio imv) {
		this.imv = imv;
	}

	public Img_Vedio getImv() {
		return imv;
	}
	public ServiceIV getS() {
		return s;
	}

	public void setS(ServiceIV s) {
		this.s = s;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
 
	/**
	 *  //����ͼƬ��Ƶ��Ϣ
	 * ������ d--·��
	 */
	public String list() {
		//�����ϴ����ļ���/hospitalPro/WebRoot/ImgVedio/vedio
		File target=new File("E:/hwork/hospitalPro/WebRoot/ImgVedio/vedio");
		File source=new File(this.getD());
		copy(source, target);
		//this.setD(fileUpdate());
		try {
			s.saveIV(iv,new String(a.getBytes("iso8859-1"), "GBK"), new String(b.getBytes("iso8859-1"), "GBK"), new String(c.getBytes("iso8859-1"), "GBK"),  new String(d.getBytes("iso8859-1"), "GBK"), new String(e.getBytes("iso8859-1"), "GBK"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "savesuccess";

	}
	/**
	 * �ļ��ϴ�
	 * return -- �ļ�·��
	 */
	public String fileUpdate(){
		//�ļ��ϴ�
		String uploadpath="/hospitalPro/WebRoot/ImgVedio/vedio";
		DiskFileItemFactory diskFileItemFactory=new DiskFileItemFactory();
		ServletFileUpload  fileUpload=new ServletFileUpload(diskFileItemFactory);		
		try {
			HttpServletRequest request = null;
			List<FileItem> list;
			list = fileUpload.parseRequest(request);
			for (int i = 0; i <list.size(); i++) {
				FileItem item=list.get(i);
				if(item.isFormField()){
					String filepath=item.getName(); 				 
					File saveFile=new File(uploadpath, filepath);
					item.write(saveFile);
					return uploadpath+item.getName();
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uploadpath;
	}
	/**
	 * 
	 * @param source ����Դ
	 * @param target Ŀ������
	 */
	private static void copy(File source, File target){
		InputStream inputStream=null;//shuruliu
		OutputStream outputStream=null;//
		
		
		try {
			inputStream=new BufferedInputStream(new FileInputStream(source));//shiliehua
			outputStream=new BufferedOutputStream(new FileOutputStream(target));
			byte[] buffer=new byte[1024];
			int length=0;//
			while((length=inputStream.read(buffer))>0){
				outputStream.write(buffer,0,length);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(inputStream!=null){
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(outputStream!=null){
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
	public String byid() {

		return "input";
	}
	//ɾ��ͼƬ��Ƶ��Ϣ
	public String delete() {
		Boolean bool = s.deleteIV(id);
		if (bool) {
			return "success";
		} else {
			return "error";
		}
	}
	//��ѯͼƬ��Ƶ��Ϣ
	@Override
	public String execute() throws Exception {
		
			return SUCCESS;
		
	}

  

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}



}
