package com.davidmarino.spring_dnd5eapi.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients("com.davidmarino.springdnd5eapi.proxy")
@Configuration
public class SpringDnd5eApiOpenFeignConfig {
}
