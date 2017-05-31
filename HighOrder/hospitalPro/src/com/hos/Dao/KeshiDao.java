package com.hos.Dao;

import java.util.List;
import com.hos.beans.Keshi;

public interface KeshiDao {
	public List<Keshi> findKeshi();
	public Keshi findById(int Ks_id);
	public Boolean saveKS(Keshi ks,String a,String b,String c,int d,String e,String f);
	public Boolean deleteKS(int id) ;
	public Boolean updateKS(int id,String ksIntroduce) ;
	
	
}
