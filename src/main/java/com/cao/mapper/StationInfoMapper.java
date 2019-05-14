package com.cao.mapper;

import com.cao.pojo.StationInfo;
import com.cao.pojo.StationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationInfoMapper {
    int countByExample(StationInfoExample example);

    int deleteByExample(StationInfoExample example);

    int deleteByPrimaryKey(Integer stationId);

    int insert(StationInfo record);

    int insertSelective(StationInfo record);

    List<StationInfo> selectByExample(StationInfoExample example);

    StationInfo selectByPrimaryKey(Integer stationId);

    int updateByExampleSelective(@Param("record") StationInfo record, @Param("example") StationInfoExample example);

    int updateByExample(@Param("record") StationInfo record, @Param("example") StationInfoExample example);

    int updateByPrimaryKeySelective(StationInfo record);

    int updateByPrimaryKey(StationInfo record);
}