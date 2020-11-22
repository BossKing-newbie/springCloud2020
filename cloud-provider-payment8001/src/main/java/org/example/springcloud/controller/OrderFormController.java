package org.example.springcloud.controller;

import org.example.springcloud.common.AjaxResult;
import org.example.springcloud.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud.controller
 * @Author: Boss_king
 * @CreateTime: 2020-10-31 22:16
 * @Description: 控制层实现类
 */
@RestController
@RequestMapping("/orderForm")
public class OrderFormController {

    @Autowired
    private OrderFormService orderFormService;


    @GetMapping("/selectOrderFormList")
    public AjaxResult selectOrderFormList(){
        return AjaxResult.success(orderFormService.selectList());
    }

    @GetMapping("/getOrderInfo/{orderFormNumber}")
    public AjaxResult selectOrderInfoById(@PathVariable String orderFormNumber){
        return AjaxResult.success(orderFormService.selectOrderInfoById(orderFormNumber));
    }
}
