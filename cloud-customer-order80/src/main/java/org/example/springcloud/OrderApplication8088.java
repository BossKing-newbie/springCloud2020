package org.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud
 * @Author: Boss_king
 * @CreateTime: 2020-10-31 23:18
 * @Description: 主启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApplication8088 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication8088.class,args);
    }
}
