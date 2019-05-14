package com.cao.controller;

import com.cao.pojo.FreightCompute;
import com.cao.pojo.FreightComputeExample;
import com.cao.service.FreightComputeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class FreightComputeController {

    @Resource
    private FreightComputeService freightComputeService;

    @RequestMapping("/selectFreightCompute")
    @ResponseBody
    public List<FreightCompute> selectFreightCompute(){
        System.out.println(123);
        FreightComputeExample example=new FreightComputeExample();
        return freightComputeService.selectByExample(example);
    }

    @RequestMapping("/updateFreightCompute")
    @ResponseBody
    public int updateFreightCompute(@RequestBody FreightCompute record){
        System.out.println(123);
        return freightComputeService.updateByPrimaryKeySelective(record);
    }
}
