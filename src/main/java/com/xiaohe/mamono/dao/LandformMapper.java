package com.xiaohe.mamono.dao;

import com.xiaohe.mamono.entity.Landform;

public interface LandformMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Landform record);

    int insertSelective(Landform record);

    Landform selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Landform record);

    int updateByPrimaryKey(Landform record);
}