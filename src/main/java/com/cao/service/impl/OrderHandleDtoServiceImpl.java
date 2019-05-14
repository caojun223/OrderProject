package com.cao.service.impl;

import com.cao.dto.OrderHandleDto;
import com.cao.mapper.OrderHandleDtoMapper;
import com.cao.service.OrderHandleDtoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderHandleDtoServiceImpl implements OrderHandleDtoService {

    @Resource
    private OrderHandleDtoMapper orderHandleDtoMapper;

    @Override
    public List<OrderHandleDto> selectFromTwoTable() {
        return orderHandleDtoMapper.selectFromTwoTable();
    }

    @Override
    public Object selectFromThreeTable(Integer orderId123) {
        return orderHandleDtoMapper.selectFromThreeTable(orderId123);
    }

    @Override
    public List<OrderHandleDto> selectOrderByDeliveryId(Integer goods_id) {
        return orderHandleDtoMapper.selectOrderByDeliveryId(goods_id);
    }
}
