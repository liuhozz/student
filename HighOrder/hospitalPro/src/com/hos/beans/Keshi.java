/**
 * 
 */
package com.hos.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Administrator
 * 
 */
@Entity
public class Keshi {

	/**
	 * 
	 */
	private int Ks_id;           //���ұ��
	private String Ks_name;      //��������
	private String Ks_introduce; //���ҽ���
	private String Ks_prefect;   //��ɫ����
	private int iV_id;           //ͼƬ��Ƶ���
	private String  News;
	private String  Newstitle;
	
	

	@Id
	@GeneratedValue
	

	public String getNewstitle() {
		return Newstitle;
	}

	public void setNewstitle(String newstitle) {
		Newstitle = newstitle;
	}

	public String getKs_name() {
		return Ks_name;
	}

	public String getNews() {
		return News;
	}

	public void setNews(String news) {
		News = news;
	}

	public void setKs_name(String ksName) {
		Ks_name = ksName;
	}

	public String getKs_introduce() {
		return Ks_introduce;
	}

	public void setKs_introduce(String ksIntroduce) {
		Ks_introduce = ksIntroduce;
	}

	public String getKs_prefect() {
		return Ks_prefect;
	}

	public void setKs_prefect(String ksPrefect) {
		Ks_prefect = ksPrefect;
	}

	public int getiV_id() {
		return iV_id;
	}

	public void setiV_id(int iVId) {
		iV_id = iVId;
	}

	public Keshi() {
		// TODO Auto-generated constructor stub
	}

	public void setKs_id(int ks_id) {
		Ks_id = ks_id;
	}

	public int getKs_id() {
		return Ks_id;
	}

}
