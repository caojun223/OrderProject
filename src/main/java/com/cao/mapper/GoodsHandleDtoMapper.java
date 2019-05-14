package com.cao.mapper;

import com.cao.dto.GoodsHandleDto;

import java.util.List;

public interface GoodsHandleDtoMapper {

    List<GoodsHandleDto> selectAllGoodsHandle();

    List<GoodsHandleDto> selectAllGoodsHandleByGoodsId(Integer goods_id);

    List<GoodsHandleDto> selectReceiptInfo();
}
