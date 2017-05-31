/**
 * 
 */
package com.hos.DaoImp;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.hos.Dao.Specialist_ExpertDao;
import com.hos.beans.Specialist_Expert;

/**
 * @author Administrator
 * 
 */
public class Specialist_ExpertDaoImp extends HibernateDaoSupport implements
		Specialist_ExpertDao {
	/**
	 * 
	 */
	public Specialist_ExpertDaoImp() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hos.Dao.Specialist_ExpertDao#findSpecialist_Expert()
	 */
	@SuppressWarnings("unchecked")
	public List<Specialist_Expert> findSpecialist_Expert() {
		// TODO Auto-generated method stub
		List<Specialist_Expert> list = this.getHibernateTemplate().find(
		"from com.hos.beans.Specialist_Expert");
            return list;
	}

	public Boolean deleteSE(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().load(Specialist_Expert.class, id));
		return true;
	}

	public Specialist_Expert findById(int id) {
		// TODO Auto-generated method stub
		Specialist_Expert sE = (Specialist_Expert) this.getHibernateTemplate().get(
				Specialist_Expert.class, id);
		return sE;
	}
	public Boolean saveSE(Specialist_Expert SE, String a, String b, int c, String d, String g, String h) {
		SE.setsE_name(a);
		SE.setsE_sex(b);
		SE.setsE_age(c);
		SE.setsE_tel(d);
		SE.setsE_intro(g);
		SE.setsE_pos(h);
		this.getHibernateTemplate().save(SE);
		return true;
	}

}
