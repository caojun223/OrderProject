package com.cao.service;

import com.cao.dto.GoodsHandleDto;

import java.util.List;

public interface GoodsHandleDtoService {

    List<GoodsHandleDto> selectAllGoodsHandle();

    List<GoodsHandleDto> selectAllGoodsHandleByGoodsId(Integer goods_id);

    List<GoodsHandleDto> selectReceiptInfo();
}
