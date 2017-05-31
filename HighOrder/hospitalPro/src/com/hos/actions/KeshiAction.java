/**
 * 
 */
package com.hos.actions;
import java.util.List;

import javax.swing.JOptionPane;

import com.hos.beans.Keshi;
import com.hos.serviceDao.ServiceKs;
import com.hos.serviceImp.ServiceKsimp;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 *
 */
public class KeshiAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private List<Keshi> list;
    private int Ks_id;
	private String Ks_name;  //科室名字
	private String Ks_introduce; //科室介绍
	private String  Ks_prefect;  //特色科室
	private int iV_id;
	private int id;
	ServiceKs s=new ServiceKsimp();
	Keshi ks=new Keshi();
	private String introduce;
	private int KSid;
	private String News;
	private String Newstitle;
	public String getNewstitle() {
		return Newstitle;
	}
	public void setNewstitle(String newstitle) {
		Newstitle = newstitle;
	}
	public String getNews() {
		return News;
	}
	public void setNews(String news) {
		News = news;
	}
	public int getKSid() {
		return KSid;
	}
	public void setKSid(int kSid) {
		KSid = kSid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getKs_name() {
		return Ks_name;
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
	public int getKs_id() {
		return Ks_id;
	}
	public void setKs_id(int ksId) {
		Ks_id = ksId;
	}
	public void setList(List<Keshi> list) {
		this.list = list;
	}
	public List<Keshi> getList() {
		return list;
	}
	public KeshiAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	//录入
	   public String execute() throws Exception{
      Boolean bool = s.saveKS(ks, new String(Ks_name.getBytes("iso8859-1"), "GBK"),  new String(Ks_introduce.getBytes("iso8859-1"), "GBK"), new String(Ks_prefect.getBytes("iso8859-1"), "GBK"),iV_id, new String(News.getBytes("iso8859-1"), "GBK"), new String(Newstitle.getBytes("iso8859-1"), "GBK"));
		if (bool) {
			return "success";
		} else {
			return "error";
		}
	
	  }
	
	//删除
	 public String deleteks(){
		  Boolean bool = s.deleteKS(Ks_id);
		  if (bool) {
				return "success";
			} else {
				return "error";
			}
		  
		  
	  }
	 //查找
	  public String findks(){
		  list = s.findKeshi();
		  return "success";
		  
		  
	  }
	  //通过id查找
	   public String byksid(){
		    
		      Keshi ks = s.findById(Ks_id);
		      
			  Ks_introduce =ks.getKs_introduce();
			  return "success";
	   }
	 //修改
		 public String updateks(){
			 JOptionPane.showMessageDialog(null, Ks_introduce);
			  Boolean bool = s.updateKS(id, Ks_introduce);
			  if (bool) {
					return "success";
				} else {
					return "error";
				}
			  
			  
		  }
		 //动态显示科室介绍功能
		 public String showIntro() {
				
				ks=s.findById(KSid);	
				introduce=ks.getKs_introduce();
				News=ks.getNews();
				return SUCCESS;
			}

}
