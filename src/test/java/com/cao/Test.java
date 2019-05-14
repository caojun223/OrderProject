package com.cao;


import com.cao.dto.GoodsDeliveryDto;
import com.cao.pojo.FreightCompute;
import com.cao.pojo.FreightComputeExample;
import com.cao.pojo.GoodsHandle;
import com.cao.pojo.OrderHandle;
import com.cao.service.FreightComputeService;
import com.cao.service.GoodsDeliveryDtoService;
import com.cao.service.GoodsHandleService;
import com.cao.service.OrderHandleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        show1();
        show3();
    }

    public static void show1() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
        String jj = sdf.format(now);
        System.out.println(jj);
        String[] strings = jj.split("-");
        String s1 = strings[0];
        String s2 = strings[1];
        String s3 = strings[2];
        String s4 = strings[3];
        String s5 = strings[4];
        String sss = s1 + s2 + s3 + s4 + s5;
        System.out.println(sss);
    }

    public static void show2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mvc.xml");
        GoodsDeliveryDtoService service = context.getBean(GoodsDeliveryDtoService.class);
        List<GoodsDeliveryDto> goodsDeliveryDtos = service.selectFromGoodsId(5);
        System.out.println(goodsDeliveryDtos);
    }

    public static void show3(){
        Timestamp timestamp = new Timestamp(new Date().getTime());
        System.out.println(timestamp);
    }
}
