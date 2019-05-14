package com.cao.mapper;

import com.cao.pojo.OrderHandle;
import com.cao.pojo.OrderHandleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrderHandleMapper {
    int countByExample(OrderHandleExample example);

    int deleteByExample(OrderHandleExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderHandle record);

    int insertSelective(OrderHandle record);

    List<OrderHandle> selectByExample(OrderHandleExample example);

    List<OrderHandle> selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") OrderHandle record, @Param("example") OrderHandleExample example);

    int updateByExample(@Param("record") OrderHandle record, @Param("example") OrderHandleExample example);

    int updateByPrimaryKeySelective(OrderHandle record);

    int updateByPrimaryKey(OrderHandle record);
}