package org.example.springcloud.entity;

import lombok.Data;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud.entity
 * @Author: Boss_king
 * @CreateTime: 2020-11-01 10:07
 * @Description: 订单个人信息类
 * order_form_number	order_sender	order_sender_phone	order_recipient	order_recipient_phone
 */
@Data
public class OrderInfo {

    private String orderFormNumber;
    private String orderSender;
    private String orderSenderPhone;
    private String orderRecipient;
    private String orderRecipientPhone;
}
