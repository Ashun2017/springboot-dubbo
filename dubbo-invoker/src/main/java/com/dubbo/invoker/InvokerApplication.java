package com.dubbo.invoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring-dubbo-invoker.xml"})
public class InvokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvokerApplication.class, args);
        System.out.println("customer is started");
	}
}
