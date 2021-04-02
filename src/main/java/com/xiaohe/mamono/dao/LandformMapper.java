package com.xiaohe.mamono.dao;

import com.xiaohe.mamono.entity.Landform;
import com.xiaohe.mamono.entity.LandformExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LandformMapper {
    long countByExample(LandformExample example);

    int deleteByExample(LandformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Landform record);

    int insertSelective(Landform record);

    List<Landform> selectByExample(LandformExample example);

    Landform selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Landform record, @Param("example") LandformExample example);

    int updateByExample(@Param("record") Landform record, @Param("example") LandformExample example);

    int updateByPrimaryKeySelective(Landform record);

    int updateByPrimaryKey(Landform record);
}