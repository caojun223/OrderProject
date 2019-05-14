package com.cao.controller;

import com.cao.dto.GoodsDeliveryDto;
import com.cao.service.GoodsDeliveryDtoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodsDeliveryDtoController {

    @Resource
    private GoodsDeliveryDtoService goodsDeliveryDtoService;

    @RequestMapping("/selectFromGoodsId")
    @ResponseBody
    public List<GoodsDeliveryDto> selectFromGoodsId(@RequestParam Integer goods_id){
        System.out.println(123);
        return goodsDeliveryDtoService.selectFromGoodsId(goods_id);
    }
}
