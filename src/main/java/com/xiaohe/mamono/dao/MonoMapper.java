package com.xiaohe.mamono.dao;

import com.xiaohe.mamono.entity.Mono;

public interface MonoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mono record);

    int insertSelective(Mono record);

    Mono selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mono record);

    int updateByPrimaryKey(Mono record);
}