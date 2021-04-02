package com.xiaohe.mamono.dao;

import com.xiaohe.mamono.entity.Race;
import com.xiaohe.mamono.entity.RaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RaceMapper {
    long countByExample(RaceExample example);

    int deleteByExample(RaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Race record);

    int insertSelective(Race record);

    List<Race> selectByExample(RaceExample example);

    Race selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Race record, @Param("example") RaceExample example);

    int updateByExample(@Param("record") Race record, @Param("example") RaceExample example);

    int updateByPrimaryKeySelective(Race record);

    int updateByPrimaryKey(Race record);
}