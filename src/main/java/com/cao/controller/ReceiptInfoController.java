package com.cao.controller;

import com.cao.pojo.ReceiptInfo;
import com.cao.pojo.ReceiptInfoExample;
import com.cao.service.ReceiptInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ReceiptInfoController {

    @Resource
    private ReceiptInfoService receiptInfoService;

    @RequestMapping("/selectAllReceipt")
    @ResponseBody
    public List<ReceiptInfo> selectAllReceipt() {
        System.out.println(123);
        ReceiptInfoExample example = new ReceiptInfoExample();
        return receiptInfoService.selectByExample(example);
    }

    @RequestMapping("/insertStationInfoReceipt")
    @ResponseBody
    public int insertStationInfoReceipt(@RequestBody ReceiptInfo record1) {
        System.out.println(123);
        return receiptInfoService.insertSelective(record1);
//        return 1;
    }

}
