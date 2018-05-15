package com.qqx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value={"classpath:dubbo-consumer.xml"})
public class ConsumerqqxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerqqxApplication.class, args);
	}
}
