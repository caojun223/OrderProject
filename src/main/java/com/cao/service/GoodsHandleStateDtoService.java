package com.cao.service;

import com.cao.dto.GoodsHandleStateDto;

import java.util.Date;


public interface GoodsHandleStateDtoService {

    //根据ID查询当前状态
    String selectGoodsStateById(Integer goods_id);

    //根据ID修改当前状态
    int updateGoodsStateById(GoodsHandleStateDto goodsHandleStateDto);

    //修改时间
    int updateShipDate(Integer goods_id);

    //根据ID查询收货状态
    String selectReceiptStateById(Integer goods_id);

    //根据ID修改收货状态
    int updateReceiptStateById(GoodsHandleStateDto goodsHandleStateDto);

    //根据ID修改收货时间
    int updateReceiptDate(Integer goods_id);
}
