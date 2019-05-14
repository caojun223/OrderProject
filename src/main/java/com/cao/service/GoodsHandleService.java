package com.cao.service;

import com.cao.pojo.GoodsHandle;
import com.cao.pojo.GoodsHandleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsHandleService {
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
