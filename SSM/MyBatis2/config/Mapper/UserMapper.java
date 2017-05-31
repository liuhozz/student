package Mapper;

import java.util.List;

import com.heima.mybatis.pojo.Order;
import com.heima.mybatis.pojo.User;

public interface UserMapper {

	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	User getUserById(Integer id);
	
	/**
	 * 模糊查询用户
	 * @param name
	 * @return
	 */
	List<User> getUserByName(String name);
	
	/**
	 * 插入用户
	 * @param user
	 */
	void insertUser(User user);
	
	/**
	 * 使用if标签和where标签
	 * @param user
	 * @return
	 */
	List<User> getUserByWhere(User user);
	
	/**
	 * 测试使用foreach标签
	 * @param user
	 * @return
	 */
	List<User> getUserByIn(User user);
	
	
	/**
	 * 测试一对多 用户订单关联
	 * @return
	 */
	List<User> getUserOrder();
	
	/**
	 * 测试一对一 订单用户
	 * @return
	 */
	List<Order> getOrderUser();
}
