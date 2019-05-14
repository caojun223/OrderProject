package com.cao.service;

import com.cao.pojo.ShipInfo;
import com.cao.pojo.ShipInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShipInfoService {
    int countByExample(ShipInfoExample example);

    int deleteByExample(ShipInfoExample example);

    int deleteByPrimaryKey(Integer shipId);

    int insert(ShipInfo record);

    int insertSelective(ShipInfo record);

    List<ShipInfo> selectByExample(ShipInfoExample example);

    ShipInfo selectByPrimaryKey(Integer shipId);

    int updateByExampleSelective(@Param("record") ShipInfo record, @Param("example") ShipInfoExample example);

    int updateByExample(@Param("record") ShipInfo record, @Param("example") ShipInfoExample example);

    int updateByPrimaryKeySelective(ShipInfo record);

    int updateByPrimaryKey(ShipInfo record);
}
