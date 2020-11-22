package org.example.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud
 * @Author: Boss_king
 * @CreateTime: 2020-10-31 17:53
 * @Description: 主启动类
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("org.example.springcloud.mapper")
public class paymentApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(paymentApplication8001.class,args);
    }
}
