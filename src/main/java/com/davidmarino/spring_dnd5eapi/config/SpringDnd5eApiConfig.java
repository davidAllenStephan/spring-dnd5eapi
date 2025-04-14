package com.davidmarino.spring_dnd5eapi.config;

import org.springframework.context.annotation.Import;

@Import(value = {
    SpringDnd5eApiOpenFeignConfig.class,
    SpringDnd5eApiCacheConfig.class
})
public class SpringDnd5eApiConfig {
}
