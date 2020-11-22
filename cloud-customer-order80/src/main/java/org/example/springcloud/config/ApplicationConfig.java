package org.example.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: springcloud2020
 * @BelongsPackage: org.example.springcloud.config
 * @Author: Boss_king
 * @CreateTime: 2020-11-01 10:18
 * @Description: 配置类
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
