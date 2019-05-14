package com.cao.service.impl;

import com.cao.mapper.OrderHandleMapper;
import com.cao.mapper.ReceiptInfoMapper;
import com.cao.mapper.ShipInfoMapper;
import com.cao.pojo.OrderHandle;
import com.cao.pojo.OrderHandleExample;
import com.cao.pojo.ReceiptInfo;
import com.cao.pojo.ShipInfo;
import com.cao.service.OrderHandleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderHandleServiceImpl implements OrderHandleService {

    @Resource
    private OrderHandleMapper orderHandleMapper;

    @Resource
    private ShipInfoMapper shipInfoMapper;

    @Resource
    private ReceiptInfoMapper receiptInfoMapper;

    @Override
    public int countByExample(OrderHandleExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(OrderHandleExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return 0;
    }

    @Override
    public int insert(OrderHandle record) {
        return 0;
    }

    @Override
    public int insertSelective(OrderHandle record) {
        return orderHandleMapper.insertSelective(record);
    }

    @Override
    public List<OrderHandle> selectByExample(OrderHandleExample example) {
        return null;
    }

    @Override
    public List<OrderHandle> selectByPrimaryKey(Integer orderId) {
        return orderHandleMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByExampleSelective(OrderHandle record, OrderHandleExample example) {
        return 0;
    }

    @Override
    public int updateByExample(OrderHandle record, OrderHandleExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(OrderHandle record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(OrderHandle record) {
        return 0;
    }
}
