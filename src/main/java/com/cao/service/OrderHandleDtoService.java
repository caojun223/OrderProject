package com.cao.service;

import com.cao.dto.OrderHandleDto;

import java.util.List;

public interface OrderHandleDtoService {

    public List<OrderHandleDto> selectFromTwoTable();

    public Object selectFromThreeTable(Integer orderId123);

    public List<OrderHandleDto> selectOrderByDeliveryId(Integer goods_id);
}
