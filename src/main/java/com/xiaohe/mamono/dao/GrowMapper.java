package com.xiaohe.mamono.dao;

import com.xiaohe.mamono.entity.Grow;

public interface GrowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Grow record);

    int insertSelective(Grow record);

    Grow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grow record);

    int updateByPrimaryKey(Grow record);
}