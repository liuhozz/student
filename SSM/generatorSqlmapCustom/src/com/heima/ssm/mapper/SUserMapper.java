package com.heima.ssm.mapper;

import com.heima.ssm.pojo.SUser;
import com.heima.ssm.pojo.SUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SUserMapper {
    int countByExample(SUserExample example);

    int deleteByExample(SUserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(SUser record);

    int insertSelective(SUser record);

    List<SUser> selectByExample(SUserExample example);

    SUser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") SUser record, @Param("example") SUserExample example);

    int updateByExample(@Param("record") SUser record, @Param("example") SUserExample example);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);
}