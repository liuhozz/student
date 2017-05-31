package com.hos.Dao;

import java.util.List;


import com.hos.beans.Img_Vedio;

public interface ImgVedioDao {

	public List<Img_Vedio> findImgVedio(); //定义查找图像视频表方法
	public Img_Vedio findById(int id);
	public Boolean saveIV(Img_Vedio iv,String a,String b,String c,String d,String e);
	public Boolean deleteIV(int id) ;
}
