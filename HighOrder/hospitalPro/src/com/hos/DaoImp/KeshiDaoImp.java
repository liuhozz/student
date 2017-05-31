/**
 * 
 */
package com.hos.DaoImp;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hos.Dao.KeshiDao;
import com.hos.beans.Keshi;

/**
 * @author Administrator
 *
 */
public class KeshiDaoImp extends HibernateDaoSupport implements KeshiDao {

	/**
	 * 
	 */
	public KeshiDaoImp() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.hos.Dao.KeshiDao#findKeshi()
	 */
	@SuppressWarnings("unchecked")
	public List<Keshi> findKeshi() {
		// TODO Auto-generated method stub
		List<Keshi> list = this.getHibernateTemplate().find(
		"from com.hos.beans.Keshi");
            return list;
	}

	public Boolean deleteKS(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().load(Keshi.class, id));
		return true;
	}

	public Keshi findById(int Ks_id) {
		// TODO Auto-generated method stub
		Keshi ks = (Keshi) this.getHibernateTemplate().get(
				Keshi.class, Ks_id);
		return ks;
	}

	public Boolean saveKS(Keshi ks, String a, String b, String c ,int d,String e,String f) {
		ks.setKs_name(a);
		ks.setKs_introduce(b);
		ks.setKs_prefect(c);
		ks.setiV_id(d);
		ks.setNews(e);
		ks.setNewstitle(f);
		this.getHibernateTemplate().save(ks);
		return true;
	}

	public Boolean updateKS(int id,String ksIntroduce) {
		// TODO Auto-generated method stub
		Keshi ks=this.getHibernateTemplate().load(Keshi.class, id);
		ks.setKs_introduce(ksIntroduce);	
		this.getHibernateTemplate().update(ks);
		return true;
	}

}
