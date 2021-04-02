package com.xiaohe.mamono.dao;

import com.xiaohe.mamono.entity.Mono;
import com.xiaohe.mamono.entity.MonoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MonoMapper {
    long countByExample(MonoExample example);

    int deleteByExample(MonoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mono record);

    int insertSelective(Mono record);

    List<Mono> selectByExample(MonoExample example);

    Mono selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mono record, @Param("example") MonoExample example);

    int updateByExample(@Param("record") Mono record, @Param("example") MonoExample example);

    int updateByPrimaryKeySelective(Mono record);

    int updateByPrimaryKey(Mono record);
}