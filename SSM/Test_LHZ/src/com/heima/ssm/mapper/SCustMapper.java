package com.heima.ssm.mapper;

import com.heima.ssm.pojo.SCust;
import com.heima.ssm.pojo.SCustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SCustMapper {
    int countByExample(SCustExample example);

    int deleteByExample(SCustExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(SCust record);

    int insertSelective(SCust record);

    List<SCust> selectByExample(SCustExample example);

    SCust selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") SCust record, @Param("example") SCustExample example);

    int updateByExample(@Param("record") SCust record, @Param("example") SCustExample example);

    int updateByPrimaryKeySelective(SCust record);

    int updateByPrimaryKey(SCust record);
    
    List<SCust> list();
}