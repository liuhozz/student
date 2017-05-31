/**
 * 
 */
package com.hos.actions;

import java.util.List;

import javax.swing.JOptionPane;

import com.hos.beans.Specialist_Expert;
import com.hos.serviceDao.ServiceSE;
import com.hos.serviceImp.ServiceSEimp;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author DJP
 * 
 */
public class Specialist_ExpertAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String a; // ר������
	private String b; // ר���Ա�
	private int c; // ר������
	private String d; // ר�ҵ绰
	private String e; // ר�ҽ���
	private String f; // ְ��
	ServiceSE s = new ServiceSEimp();
	Specialist_Expert SE = new Specialist_Expert();
	List<Specialist_Expert> listSE;
	private int s_id;
	private int SEid;
	private String intro;
	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int sId) {
		s_id = sId;
	}
	public List<Specialist_Expert> getListSE() {
		return listSE;
	}

	public void setListSE(List<Specialist_Expert> listSE) {
		this.listSE = listSE;
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

	public int getC() {
		return c;
	}

	public void setC(int c) {
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

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}
	public int getSEid() {
		return SEid;
	}

	public void setSEid(int sEid) {
		SEid = sEid;
	}
	public Specialist_ExpertAction() {
		// TODO Auto-generated constructor stub
	}
	//¼��ר����Ϣ
	@Override
	public String execute() throws Exception {
		
		Boolean bool = s.saveSE(SE, new String(a.getBytes("iso8859-1"), "GBK"), new String(b.getBytes("iso8859-1"), "GBK"), c, new String(d.getBytes("iso8859-1"), "GBK"), new String(e.getBytes("iso8859-1"), "GBK"), new String(f.getBytes("iso8859-1"), "GBK"));
		if (bool) {
			return "success";
		} else {
			return "error";
		}
	}
	//����ר����Ϣ
	public String findSE() {
		listSE =s.findSpecialist_Expert();
		JOptionPane.showMessageDialog(null, listSE.get(2).getsE_name());
		return "success";

	}
   //ɾ��ר����Ϣ
	public String deleteSE() {

		Boolean bool = s.deleteSE(s_id);
		if (bool) {
			return "success";
		} else {
			return "error";
		}

	}
	 //��̬��ʾר�ҽ��ܹ���
	public String introduceSE() {

		SE = s.findById(SEid);
		//JOptionPane.showMessageDialog(null, SE.getsE_intro());
		intro =SE.getsE_intro();
		return "success";
		

	}


}
