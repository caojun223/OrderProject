package com.cao.controller;

import com.cao.pojo.*;
import com.cao.service.GoodsHandleService;
import com.cao.service.ReceiptInfoService;
import com.cao.service.ShipInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class GoodsHandleController {

    @Resource
    private GoodsHandleService goodsHandleService;

    @Resource
    private ShipInfoService shipInfoService;

    @Resource
    private ReceiptInfoService receiptInfoService;

    @RequestMapping("/insertGoodsHandleSelective")
    @ResponseBody
    public int insertGoodsHandleSelective(@RequestBody GoodsHandle goodsHandle) {
        System.out.println(123);
        Integer shipIdFromHtml = goodsHandle.getShipId();
        Integer receiptIdFromHtml = goodsHandle.getReceiptId();
        ShipInfo shipInfo = shipInfoService.selectByPrimaryKey(shipIdFromHtml);
        ReceiptInfo receiptInfo = receiptInfoService.selectByPrimaryKey(receiptIdFromHtml);
        String shipNumber = shipInfo.getShipNumber();
        String receiptNumber = receiptInfo.getReceiptNumber();
        String[] firstName = shipNumber.split("([^a-zA-Z])");
        String[] secondName = receiptNumber.split("[^a-zA-z]");
        String first = firstName[0];
        String second = secondName[0];
        String name = first + second;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH");
        String jj = sdf.format(now);
        String[] strings = jj.split("-");
        String s1 = strings[0];
        String s2 = strings[1];
        String s3 = strings[2];
        String s4 = strings[3];
        String deliveryId = name + s1 + s2 + s3 + s4;
        goodsHandle.setDeliveryId(deliveryId);
        System.out.println(goodsHandle);
        return goodsHandleService.insertSelective(goodsHandle);
    }
}
