package com.cao.controller;

import com.cao.dto.GoodsHandleDto;
import com.cao.pojo.GoodsHandle;
import com.cao.pojo.GoodsHandleExample;
import com.cao.service.GoodsHandleDtoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodsHandleDtoController {

    @Resource
    private GoodsHandleDtoService goodsHandleDtoService;

    @RequestMapping("/selectAllGoodsHandle")
    @ResponseBody
    public List<GoodsHandleDto> selectAllGoodsHandle() {
        System.out.println(123);
        return goodsHandleDtoService.selectAllGoodsHandle();
    }

    @RequestMapping("/selectAllGoodsHandleByGoodsId")
    @ResponseBody
    public List<GoodsHandleDto> selectAllGoodsHandleByGoodsId(@RequestParam Integer goods_id) {
        System.out.println(123);
        return goodsHandleDtoService.selectAllGoodsHandleByGoodsId(goods_id);
    }

    @RequestMapping("/selectReceiptInfo")
    @ResponseBody
    public List<GoodsHandleDto> selectReceiptInfo() {
        System.out.println(123);
        return goodsHandleDtoService.selectReceiptInfo();
    }
}
