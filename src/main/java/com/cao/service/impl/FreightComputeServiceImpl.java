package com.cao.service.impl;

import com.cao.mapper.FreightComputeMapper;
import com.cao.pojo.FreightCompute;
import com.cao.pojo.FreightComputeExample;
import com.cao.service.FreightComputeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FreightComputeServiceImpl implements FreightComputeService {

    @Resource
    private FreightComputeMapper freightComputeMapper;

    @Override
    public int countByExample(FreightComputeExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(FreightComputeExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer freightId) {
        return 0;
    }

    @Override
    public int insert(FreightCompute record) {
        return 0;
    }

    @Override
    public int insertSelective(FreightCompute record) {
        return 0;
    }

    @Override
    public List<FreightCompute> selectByExample(FreightComputeExample example) {
        return freightComputeMapper.selectByExample(example);
    }

    @Override
    public FreightCompute selectByPrimaryKey(Integer freightId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(FreightCompute record, FreightComputeExample example) {
        return 0;
    }

    @Override
    public int updateByExample(FreightCompute record, FreightComputeExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(FreightCompute record) {
        return freightComputeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FreightCompute record) {
        return 0;
    }
}
