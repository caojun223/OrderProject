package com.cao.service.impl;

import com.cao.mapper.StationInfoMapper;
import com.cao.pojo.StationInfo;
import com.cao.pojo.StationInfoExample;
import com.cao.service.StationInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StationInfoServiceImpl implements StationInfoService {

    @Resource
    private StationInfoMapper stationInfoMapper;

    @Override
    public int countByExample(StationInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(StationInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer stationId) {
        return 0;
    }

    @Override
    public int insert(StationInfo record) {
        return 0;
    }

    @Override
    public int insertSelective(StationInfo record) {
        return stationInfoMapper.insertSelective(record);
    }

    @Override
    public List<StationInfo> selectByExample(StationInfoExample example) {
        return stationInfoMapper.selectByExample(example);
    }

    @Override
    public StationInfo selectByPrimaryKey(Integer stationId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(StationInfo record, StationInfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(StationInfo record, StationInfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(StationInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(StationInfo record) {
        return 0;
    }
}
