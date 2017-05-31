package cn.itcast.erp.biz;
import org.apache.shiro.authz.annotation.RequiresPermissions;

import cn.itcast.erp.entity.Returnorderdetail;
/**
 * 退货订单明细业务逻辑层接口
 * @author Administrator
 *
 */
public interface IReturnorderdetailBiz extends IBaseBiz<Returnorderdetail>{

	/**
	 * 退货入库
	 * @param empUuid
	 * @param uuid
	 * @param storeUuid
	 */
	public void doInStore(Long empUuid, Long uuid, Long storeUuid);
	
	/**
	 * 退货出库
	 */
	@RequiresPermissions("销售订单出库")
	public void doOutStore(Long uuid,Long storeuuid, Long empuuid);
}

