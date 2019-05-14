package com.cao.service.impl;

import com.cao.mapper.ShipInfoMapper;
import com.cao.pojo.ShipInfo;
import com.cao.pojo.ShipInfoExample;
import com.cao.service.ShipInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShipInfoServiceImpl implements ShipInfoService {

    @Resource
    private ShipInfoMapper shipInfoMapper;

    @Override
    public int countByExample(ShipInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ShipInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer shipId) {
        return 0;
    }

    @Override
    public int insert(ShipInfo record) {
        return 0;
    }

    @Override
    public int insertSelective(ShipInfo record) {
        return shipInfoMapper.insertSelective(record);
    }

    @Override
    public List<ShipInfo> selectByExample(ShipInfoExample example) {
        return shipInfoMapper.selectByExample(example);
    }

    @Override
    public ShipInfo selectByPrimaryKey(Integer shipId) {
        return shipInfoMapper.selectByPrimaryKey(shipId);
    }

    @Override
    public int updateByExampleSelective(ShipInfo record, ShipInfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(ShipInfo record, ShipInfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(ShipInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ShipInfo record) {
        return 0;
    }
}
