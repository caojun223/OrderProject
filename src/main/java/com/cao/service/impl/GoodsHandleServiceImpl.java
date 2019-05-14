package com.cao.service.impl;

import com.cao.mapper.GoodsHandleMapper;
import com.cao.pojo.GoodsHandle;
import com.cao.pojo.GoodsHandleExample;
import com.cao.service.GoodsHandleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsHandleServiceImpl implements GoodsHandleService {

    @Resource
    private GoodsHandleMapper goodsHandleMapper;

    @Override
    public int countByExample(GoodsHandleExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(GoodsHandleExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer goodsId) {
        return 0;
    }

    @Override
    public int insert(GoodsHandle record) {
        return 0;
    }

    @Override
    public int insertSelective(GoodsHandle record) {
        return goodsHandleMapper.insertSelective(record);
    }

    @Override
    public List<GoodsHandle> selectByExample(GoodsHandleExample example) {
        return goodsHandleMapper.selectByExample(example);
    }

    @Override
    public GoodsHandle selectByPrimaryKey(Integer goodsId) {
        return goodsHandleMapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public int updateByExampleSelective(GoodsHandle record, GoodsHandleExample example) {
        return 0;
    }

    @Override
    public int updateByExample(GoodsHandle record, GoodsHandleExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsHandle record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(GoodsHandle record) {
        return 0;
    }
}
