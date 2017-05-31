package com.hos.DaoImp;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.hos.Dao.ImgVedioDao;
import com.hos.beans.Img_Vedio;

/**
 * @author Administrator
 * 
 */
public class ImgVedioDaoImp extends HibernateDaoSupport implements ImgVedioDao {

	/**
	 * 
	 */
	public ImgVedioDaoImp() {
		// TODO Auto-generated constructor stub
	}
	/*public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ImgVedioDao bt=(ImgVedioDao) context.getBean("imgVedioDao");
		bt.deleteIV(13);
	}*/
	@SuppressWarnings("unchecked")
	public List<Img_Vedio> findImgVedio() {
		List<Img_Vedio> list = this.getHibernateTemplate().find(
				"from Img_Vedio");
		return list;
	}

	public Img_Vedio findById(int id) {
		Img_Vedio IV = (Img_Vedio) this.getHibernateTemplate().get(
				Img_Vedio.class, id);
		return IV;

	}

	public Boolean saveIV(Img_Vedio iv, String a, String b, String c, String d,
			String e) {
		iv.setiV_type(a);
		iv.setVd_author(b);
		iv.setiV_name(c);
		iv.setiV_path(d);
		iv.setiV_date(e);
		this.getHibernateTemplate().save(iv);
		return true;
	}

	public Boolean deleteIV(int id) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().load(Img_Vedio.class, id));
		return true;

	}
	

}
