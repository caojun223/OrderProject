package com.cao.service.impl;

import com.cao.dto.GoodsHandleDto;
import com.cao.mapper.GoodsHandleDtoMapper;
import com.cao.service.GoodsHandleDtoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsHandleDtoServiceImpl implements GoodsHandleDtoService {

    @Resource
    private GoodsHandleDtoMapper goodsHandleDtoMapper;

    @Override
    public List<GoodsHandleDto> selectAllGoodsHandle() {
        return goodsHandleDtoMapper.selectAllGoodsHandle();
    }

    @Override
    public List<GoodsHandleDto> selectAllGoodsHandleByGoodsId(Integer goods_id) {
        return goodsHandleDtoMapper.selectAllGoodsHandleByGoodsId(goods_id);
    }

    @Override
    public List<GoodsHandleDto> selectReceiptInfo() {
        return goodsHandleDtoMapper.selectReceiptInfo();
    }
}
