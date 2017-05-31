package Mapper;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.heima.mybatis.pojo.User;

public class UserMapperTest {

	@Test
	public void testGetUserById() throws Exception {
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = factoryBuilder.build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User user = userMapper.getUserById(1);
		
		System.out.println(user);
		
	}

}
