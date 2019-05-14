package com.cao.mapper;

import com.cao.dto.GoodsDeliveryDto;

import java.util.List;

public interface GoodsDeliveryDtoMapper {

    List<GoodsDeliveryDto> selectFromGoodsId(Integer goodsId);
}
