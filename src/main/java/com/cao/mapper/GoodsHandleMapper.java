package com.cao.mapper;

import com.cao.pojo.GoodsHandle;
import com.cao.pojo.GoodsHandleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GoodsHandleMapper {
    int countByExample(GoodsHandleExample example);

    int deleteByExample(GoodsHandleExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(GoodsHandle record);

    int insertSelective(GoodsHandle record);

    List<GoodsHandle> selectByExample(GoodsHandleExample example);

    GoodsHandle selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") GoodsHandle record, @Param("example") GoodsHandleExample example);

    int updateByExample(@Param("record") GoodsHandle record, @Param("example") GoodsHandleExample example);

    int updateByPrimaryKeySelective(GoodsHandle record);

    int updateByPrimaryKey(GoodsHandle record);
}