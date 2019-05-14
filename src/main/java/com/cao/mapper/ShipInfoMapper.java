package com.cao.mapper;

import com.cao.pojo.ShipInfo;
import com.cao.pojo.ShipInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipInfoMapper {
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

    //根据ID查询发货信息
    ShipInfo selectShipInfoByPrimaryKey(Integer shipId);
}