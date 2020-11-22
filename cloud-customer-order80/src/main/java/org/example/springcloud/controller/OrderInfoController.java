package org.example.springcloud.controller;

import org.example.springcloud.common.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud.controller
 * @Author: Boss_king
 * @CreateTime: 2020-10-31 23:29
 * @Description: 控制层类
 */
@RestController
@RequestMapping("/orderInfo")
public class OrderInfoController {

    private static final String URL = "http://localhost:8001/orderForm";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/createOrder")
    public AjaxResult createOrder(){
        return AjaxResult.success("下单成功");
    }

    @GetMapping("/selectOrderInfo/{orderFormNumber}")
    public AjaxResult selectOrderInfo(@PathVariable String orderFormNumber){
        return restTemplate.getForObject(URL+"/getOrderInfo/"+orderFormNumber,AjaxResult.class);
    }
}
