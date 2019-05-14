package com.cao.controller;

import com.cao.pojo.ShipInfo;
import com.cao.pojo.ShipInfoExample;
import com.cao.service.ShipInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ShipInfoController {

    @Resource
    private ShipInfoService shipInfoService;

    @RequestMapping("/selectAllShip")
    @ResponseBody
    public List<ShipInfo> selectAllShip(){
        System.out.println(123);
        ShipInfoExample example=new ShipInfoExample();
        return shipInfoService.selectByExample(example);
    }

    @RequestMapping("/selectShipById")
    @ResponseBody
    public ShipInfo selectShipById(@RequestParam Integer shipId){
        System.out.println(123);
        return shipInfoService.selectByPrimaryKey(shipId);
    }

    @RequestMapping("/insertStationInfoShip")
    @ResponseBody
    public int insertStationInfoShip(@RequestBody ShipInfo record){
        System.out.println(123);
        return shipInfoService.insertSelective(record);
//        return 1;
    }

}
