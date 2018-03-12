package com.personal.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: Jacknolfskin
 * @Date: 2018/2/23 14:44
 * @Path: com.personal.config
 */
@SpringBootApplication
@ImportResource(value = { "classpath:consumers.xml" })
public class DubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
	}
}
