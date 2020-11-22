package org.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud
 * @Author: Boss_king
 * @CreateTime: 2020-11-22 14:34
 * @Description: eureka主启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMainApplication.class,args);
    }
}
