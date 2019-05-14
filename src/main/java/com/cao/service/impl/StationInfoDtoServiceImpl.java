package com.cao.service.impl;

import com.cao.dto.StationInfoDto;
import com.cao.mapper.StationInfoDtoMapper;
import com.cao.service.StationInfoDtoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StationInfoDtoServiceImpl implements StationInfoDtoService {

    @Resource
    private StationInfoDtoMapper stationInfoDtoMapper;

    @Override
    public List<StationInfoDto> selectStationInfoDto() {
        return stationInfoDtoMapper.selectStationInfoDto();
    }
}
