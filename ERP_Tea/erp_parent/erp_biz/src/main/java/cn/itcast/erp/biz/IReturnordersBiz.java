package cn.itcast.erp.biz;

import java.util.List;

import cn.itcast.erp.entity.Returnorders;

public interface IReturnordersBiz extends IBaseBiz<Returnorders>{
	
	//获取分页后的退货订单列表
	List<Returnorders> getListByPage(Returnorders t1,Returnorders t2,Object param,int firstResult, int maxResults);
	//添加退货订单
	void addReturn(Returnorders returnorders);
	//审核
	void doreturnOrdersCheck(Long uuid, Long empUuid);
}