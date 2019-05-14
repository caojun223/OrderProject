package com.cao.service.impl;

import com.cao.dto.GoodsHandleStateDto;
import com.cao.mapper.GoodsHandleStateDtoMapper;
import com.cao.service.GoodsHandleStateDtoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class GoodsHandleStateDtoServiceImpl implements GoodsHandleStateDtoService {

    @Resource
    private GoodsHandleStateDtoMapper goodsHandleStateDtoMapper;

    //根据ID查询当前状态
    @Override
    public String selectGoodsStateById(Integer goods_id) {
        return goodsHandleStateDtoMapper.selectGoodsStateById(goods_id);
    }

    //根据ID修改当前状态
    @Override
    public int updateGoodsStateById(GoodsHandleStateDto goodsHandleStateDto) {
        return goodsHandleStateDtoMapper.updateGoodsStateById(goodsHandleStateDto);
    }

    //修改时间
    @Override
    public int updateShipDate(Integer goods_id) {
        return goodsHandleStateDtoMapper.updateShipDate(new Date(),goods_id);
    }

    //根据ID查询收货状态
    @Override
    public String selectReceiptStateById(Integer goods_id) {
        return goodsHandleStateDtoMapper.selectReceiptStateById(goods_id);
    }

    //根据ID修改收货状态
    @Override
    public int updateReceiptStateById(GoodsHandleStateDto goodsHandleStateDto) {
        return goodsHandleStateDtoMapper.updateReceiptStateById(goodsHandleStateDto);
    }

    //根据ID修改收货时间
    @Override
    public int updateReceiptDate(Integer goods_id) {
        return goodsHandleStateDtoMapper.updateReceiptDate(new Date(),goods_id);
    }

}
