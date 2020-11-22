package org.example.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.springcloud.entity.OrderForm;
import org.example.springcloud.entity.OrderInfo;

import java.util.List;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud.mapper
 * @Author: Boss_king
 * @CreateTime: 2020-10-31 22:15
 * @Description: 数据实体映射类
 */
@Mapper
public interface OrderFormMapper {
    List<OrderForm> selectList();
    List<OrderInfo> selectOrderInfoById(@Param("orderFormNumber") String orderFormNumber);
}
