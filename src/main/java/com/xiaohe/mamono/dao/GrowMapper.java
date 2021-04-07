package com.xiaohe.mamono.dao;

import com.xiaohe.mamono.entity.Grow;
import com.xiaohe.mamono.entity.GrowExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GrowMapper {
    long countByExample(GrowExample example);

    int deleteByExample(GrowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grow record);

    int insertSelective(Grow record);

    List<Grow> selectByExample(GrowExample example);

    Grow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grow record, @Param("example") GrowExample example);

    int updateByExample(@Param("record") Grow record, @Param("example") GrowExample example);

    int updateByPrimaryKeySelective(Grow record);

    int updateByPrimaryKey(Grow record);
}