package com.cao.controller;

import com.cao.dto.GoodsHandleStateDto;
import com.cao.service.GoodsHandleStateDtoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

@Controller
public class GoodsHandleStateDtoController {

    @Resource
    private GoodsHandleStateDtoService goodsHandleStateDtoService;

    //修改运输状态
    @RequestMapping("/updateGoodsStateById")
    @ResponseBody
    public Object updateGoodsStateById(@RequestParam Integer goods_id) {
        System.out.println(goods_id);
        String goodsState = goodsHandleStateDtoService.selectGoodsStateById(goods_id);
        if (goodsState.equals("未发货")) {
            goodsHandleStateDtoService.updateGoodsStateById(new GoodsHandleStateDto(goods_id, "运输中"));
            goodsHandleStateDtoService.updateShipDate(goods_id);
        } else if (goodsState.equals("运输中")) {
            goodsHandleStateDtoService.updateGoodsStateById(new GoodsHandleStateDto(goods_id, "已到站"));
        }
        return 1;
    }

    //修改收货状态
    @RequestMapping("/updateReceiptStateById")
    @ResponseBody
    public Object updateReceiptStateById(@RequestParam Integer goods_id) {

        System.out.println(123);
        String goodsState = goodsHandleStateDtoService.selectGoodsStateById(goods_id);
        if (goodsState.equals("已到站")) {
            goodsHandleStateDtoService.updateGoodsStateById(new GoodsHandleStateDto(goods_id, "已签收"));
            goodsHandleStateDtoService.updateReceiptDate(goods_id);
        }
        return 1;
    }

}
