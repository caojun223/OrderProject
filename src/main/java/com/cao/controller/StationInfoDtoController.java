package com.cao.controller;

import com.cao.dto.StationInfoDto;
import com.cao.service.StationInfoDtoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StationInfoDtoController {

    @Resource
    private StationInfoDtoService stationInfoDtoService;

    @RequestMapping("/selectStationInfoDto")
    @ResponseBody
    public List<StationInfoDto> selectStationInfoDto() {
        System.out.println(123);
        return stationInfoDtoService.selectStationInfoDto();
    }
}
