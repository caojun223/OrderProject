package com.cao.service;

import com.cao.dto.GoodsDeliveryDto;

import java.util.List;

public interface GoodsDeliveryDtoService {

    List<GoodsDeliveryDto> selectFromGoodsId(Integer goodsId);
}
