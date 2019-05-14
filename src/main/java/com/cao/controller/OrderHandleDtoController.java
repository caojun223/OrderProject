package com.cao.controller;

import com.cao.dto.OrderHandleDto;
import com.cao.pojo.OrderHandle;
import com.cao.service.OrderHandleDtoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderHandleDtoController {

    @Resource
    private OrderHandleDtoService orderHandleDtoService;

    @RequestMapping("/selectFromTwoTable")
    @ResponseBody
    public Object selectFromTwoTable() {
        System.out.println(123);
        return orderHandleDtoService.selectFromTwoTable();
    }

    @RequestMapping("/selectFromThreeTable")
    @ResponseBody
    public Object selectFromThreeTable(@RequestParam Integer orderId123) {
        System.out.println(123);
        return orderHandleDtoService.selectFromThreeTable(orderId123);
    }


}
