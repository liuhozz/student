package cn.itcast.erp.action;
import java.util.List;

import org.apache.shiro.authz.UnauthorizedException;

import com.alibaba.fastjson.JSON;

import cn.itcast.erp.biz.IReturnordersBiz;
import cn.itcast.erp.entity.Emp;
import cn.itcast.erp.entity.Returnorderdetail;
import cn.itcast.erp.entity.Returnorders;
import cn.itcast.erp.exception.ErpException;

/**
 * 退货订单Action 
 * @author Administrator
 *
 */
public class ReturnordersAction extends BaseAction<Returnorders> {

	private IReturnordersBiz returnordersBiz;

	public void setReturnordersBiz(IReturnordersBiz returnordersBiz) {
		this.returnordersBiz = returnordersBiz;
		super.setBaseBiz(this.returnordersBiz);
	}
	
	//接收订单明细的json格式的字符,数组形式的json字符串,里面的元素应该是每个订单明细
		private String json;
		public String getJson() {
			return json;
		}
		public void setJson(String json) {
			this.json = json;
		}
		
		/**
		 * 添加订单
		 */
		public void addReturn(){
			
			Emp loginUser = getLoginUser();
			if(null == loginUser){
				//用户没有登陆，session已失效
				ajaxReturn(false, "亲！您还没有登陆");
				return;
			}
			try {
				//System.out.println(json);
				Returnorders returnOrders = getT();
				//订单创建者
				returnOrders.setCreater(loginUser.getUuid());
				List<Returnorderdetail> returnDetailList = JSON.parseArray(json,Returnorderdetail.class);
				//订单明细
				returnOrders.setReturnorderdetail(returnDetailList);
				//System.out.println(detailList.size());
				returnordersBiz.addReturn(returnOrders);
				ajaxReturn(true, "添加订单成功");
			} catch (Exception e) {
				ajaxReturn(false, "添加订单失败");
				e.printStackTrace();
			}
		}
		
	
	
		/**
		 * 我的订单
		 */
		public void myListByPage(){
			if(null == getT1()){
				//构建查询条件
				setT1(new Returnorders());
			}
			Emp loginUser = getLoginUser();
			//登陆用户的编号查询
			getT1().setCreater(loginUser.getUuid());
			
			super.listByPage();
		}
	
	
	/**
	 * 退货订单审核
	 */
	public void returnOrdersCheck(){
		//获取当前登陆用户
		Emp loginUser = getLoginUser();
		if(null == loginUser){
			ajaxReturn(false, "亲！您还没有登陆");
			return;
		}
		try {
			//调用审核业务
			returnordersBiz.doreturnOrdersCheck(getId(), loginUser.getUuid());
			ajaxReturn(true, "退货审核成功");
		} catch(UnauthorizedException u){
			ajaxReturn(false, "抱歉,你暂时权限不足!");
		} catch (ErpException e){
			ajaxReturn(false, e.getMessage());
		} catch (Exception e) {
			ajaxReturn(false, "退货审核失败");
			e.printStackTrace();
		}
	}
	
	

}