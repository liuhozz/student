package com.hos.Dao;

import java.util.List;


import com.hos.beans.Img_Vedio;

public interface ImgVedioDao {

	public List<Img_Vedio> findImgVedio(); //�������ͼ����Ƶ����
	public Img_Vedio findById(int id);
	public Boolean saveIV(Img_Vedio iv,String a,String b,String c,String d,String e);
	public Boolean deleteIV(int id) ;
}
