package org.example.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.example.springcloud.entity.OrderForm;
import org.example.springcloud.entity.OrderInfo;

import java.util.List;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud.service
 * @Author: Boss_king
 * @CreateTime: 2020-10-31 22:16
 * @Description: 业务类接口
 */
public interface OrderFormService {
    List<OrderForm> selectList();
    List<OrderInfo> selectOrderInfoById(String orderFormNumber);
}
