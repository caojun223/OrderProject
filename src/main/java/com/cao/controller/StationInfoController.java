package com.cao.controller;

import com.cao.pojo.StationInfo;
import com.cao.pojo.StationInfoExample;
import com.cao.service.StationInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StationInfoController {

    @Resource
    private StationInfoService stationInfoService;

    @RequestMapping("/insertStationInfo")
    @ResponseBody
    public int selectStationInfo(@RequestBody StationInfo stationInfo) {
        System.out.println(123);
        return stationInfoService.insertSelective(stationInfo);
    }

}
