package com.davidmarino.spring_dnd5eapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi")
public class SpringDnd5eapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDnd5eapiApplication.class, args);
	}
}
