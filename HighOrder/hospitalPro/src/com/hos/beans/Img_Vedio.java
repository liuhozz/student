/**
 * 
 */
package com.hos.beans;



/**
 * @author Administrator
 * 
 */
public class Img_Vedio {

	/**
	 * 
	 */
	private int iv_id;         //ͼƬ��Ƶ���
	private String iV_type;    //ͼƬ��Ƶ����
	private String Vd_author;  //��Ƶ����
	private String iV_name;    //ͼƬ��Ƶ����
	private String iV_path;    //ͼƬ��Ƶ·��
	private String iV_date;    //ͼƬ��Ƶ����


	public String getiV_type() {
		return iV_type;
	}

	public void setiV_type(String iVType) {
		iV_type = iVType;
	}

	public String getVd_author() {
		return Vd_author;
	}

	public void setVd_author(String vdAuthor) {
		Vd_author = vdAuthor;
	}

	public String getiV_name() {
		return iV_name;
	}

	public void setiV_name(String iVName) {
		iV_name = iVName;
	}

	public String getiV_path() {
		return iV_path;
	}

	public void setiV_path(String iVPath) {
		iV_path = iVPath;
	}

	public void setiV_date(String iV_date) {
		this.iV_date = iV_date;
	}

	public String getiV_date() {
		return iV_date;
	}

	public Img_Vedio() {
		// TODO Auto-generated constructor stub
	}

	public void setIv_id(int iv_id) {
		this.iv_id = iv_id;
	}

	public int getIv_id() {
		return iv_id;
	}

	

}
