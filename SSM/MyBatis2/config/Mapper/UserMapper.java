package Mapper;

import java.util.List;

import com.heima.mybatis.pojo.Order;
import com.heima.mybatis.pojo.User;

public interface UserMapper {

	/**
	 * ����id��ѯ�û�
	 * @param id
	 * @return
	 */
	User getUserById(Integer id);
	
	/**
	 * ģ����ѯ�û�
	 * @param name
	 * @return
	 */
	List<User> getUserByName(String name);
	
	/**
	 * �����û�
	 * @param user
	 */
	void insertUser(User user);
	
	/**
	 * ʹ��if��ǩ��where��ǩ
	 * @param user
	 * @return
	 */
	List<User> getUserByWhere(User user);
	
	/**
	 * ����ʹ��foreach��ǩ
	 * @param user
	 * @return
	 */
	List<User> getUserByIn(User user);
	
	
	/**
	 * ����һ�Զ� �û���������
	 * @return
	 */
	List<User> getUserOrder();
	
	/**
	 * ����һ��һ �����û�
	 * @return
	 */
	List<Order> getOrderUser();
}
