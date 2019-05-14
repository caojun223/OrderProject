package com.cao.service;

import com.cao.pojo.FreightCompute;
import com.cao.pojo.FreightComputeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FreightComputeService {
    int countByExample(FreightComputeExample example);

    int deleteByExample(FreightComputeExample example);

    int deleteByPrimaryKey(Integer freightId);

    int insert(FreightCompute record);

    int insertSelective(FreightCompute record);

    List<FreightCompute> selectByExample(FreightComputeExample example);

    FreightCompute selectByPrimaryKey(Integer freightId);

    int updateByExampleSelective(@Param("record") FreightCompute record, @Param("example") FreightComputeExample example);

    int updateByExample(@Param("record") FreightCompute record, @Param("example") FreightComputeExample example);

    int updateByPrimaryKeySelective(FreightCompute record);

    int updateByPrimaryKey(FreightCompute record);
}
