package com.cao.service.impl;

import com.cao.dto.GoodsDeliveryDto;
import com.cao.mapper.GoodsDeliveryDtoMapper;
import com.cao.service.GoodsDeliveryDtoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsDeliveryDtoServiceImpl implements GoodsDeliveryDtoService {

    @Resource
    private GoodsDeliveryDtoMapper goodsDeliveryDtoMapper;

    @Override
    public List<GoodsDeliveryDto> selectFromGoodsId(Integer goodsId) {
        return goodsDeliveryDtoMapper.selectFromGoodsId(goodsId);
    }
}
