package cn.itcast.erp.action;
import cn.itcast.erp.biz.IReturnorderdetailBiz;
import cn.itcast.erp.entity.Returnorderdetail;
import cn.itcast.erp.exception.ErpException;

/**
 * 退货订单明细Action 
 * @author Administrator
 *
 */
public class ReturnorderdetailAction extends BaseAction<Returnorderdetail> {

	private IReturnorderdetailBiz returnorderdetailBiz;
	private Long storeuuid;

	public Long getStoreuuid() {
		return storeuuid;
	}

	public void setStoreuuid(Long storeuuid) {
		this.storeuuid = storeuuid;
	}

	public void setReturnorderdetailBiz(IReturnorderdetailBiz returnorderdetailBiz) {
		this.returnorderdetailBiz = returnorderdetailBiz;
		super.setBaseBiz(this.returnorderdetailBiz);
	}

	/**
	 * 退货入库的action
	 */
	public void doreturnInStore(){
		try {
			returnorderdetailBiz.doInStore(getLoginUser().getUuid(), getId(), storeuuid);
			ajaxReturn(true, "入库成功");
		} catch (ErpException ee) {
			ajaxReturn(false, ee.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ajaxReturn(false, "入库失败");
			e.printStackTrace();
		}
	}
	
	/**
	 * 退货出库的action
	 */
	public void doreturnOutStore(){
		try {
			returnorderdetailBiz.doOutStore(getId(), storeuuid, getLoginUser().getUuid());
			ajaxReturn(true, "出库成功");
		} catch (ErpException ee) {
			ajaxReturn(false, ee.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ajaxReturn(false, "出库失败");
			e.printStackTrace();
		}
	}
}
