package com.davidmarino;

import com.davidmarino.spring_dnd5eapi.config.SpringDnd5eApiConfig;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
@EnableAutoConfiguration
@Import(SpringDnd5eApiConfig.class)
public class TestConfig {
}
