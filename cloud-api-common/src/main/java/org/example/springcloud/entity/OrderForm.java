package org.example.springcloud.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud.entity
 * @Author: Boss_king
 * @CreateTime: 2020-10-31 22:10
 * @Description: 订单实体类
 * `order_form_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
 *   `order_form_products_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品id',
 *   `order_form_user_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
 *   `order_form_time` datetime NOT NULL COMMENT '下单时间，格式YYYY-MM-DD HH:MM:SS',
 *   `order_form_start_address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发货地址',
 *   `order_form_end_address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货地址',
 *   `order_form_weight` double(255,0) NOT NULL COMMENT '重量',
 *   `order_form_money` double(255,0) NOT NULL COMMENT '价格，若预约则为起步价，若订单已进行则为交付价格',
 *   `order_form_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
 *   `order_form_way`
 */
@Data
public class OrderForm implements Serializable {

    private String orderFormNumber;
    private String orderFormUserId;
    private String orderFormTime;
    private String orderFormStartAddress;
    private String orderFormEndAddress;
    private String orderFormWeight;
    private String orderFormMoney;
    private String orderFormStatus;
    private String orderFormWay;
}
