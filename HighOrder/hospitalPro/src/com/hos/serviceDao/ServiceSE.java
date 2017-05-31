package com.hos.serviceDao;

import java.util.List;

import com.hos.beans.Specialist_Expert;

public interface ServiceSE {
	public List<Specialist_Expert> findSpecialist_Expert();
	public Specialist_Expert findById(int id);
	public Boolean deleteSE(int id) ;
	public Boolean saveSE(Specialist_Expert SE,String a,String b,int c,String d,String g,String h);
}
