package org.example.springcloud.service.impl;

import org.example.springcloud.entity.OrderForm;
import org.example.springcloud.entity.OrderInfo;
import org.example.springcloud.mapper.OrderFormMapper;
import org.example.springcloud.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud.service.impl
 * @Author: Boss_king
 * @CreateTime: 2020-10-31 22:16
 * @Description: 业务实现类
 */
@Service
public class OrderFormServiceImpl implements OrderFormService {

    @Resource
    private OrderFormMapper orderFormMapper;

    @Override
    public List<OrderForm> selectList() {
        return orderFormMapper.selectList();
    }

    @Override
    public List<OrderInfo> selectOrderInfoById(String orderFormNumber) {
        return orderFormMapper.selectOrderInfoById(orderFormNumber);
    }
}
