package com.order.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderserviceApplication {

	public static void main(String[] args) {

		System.out.println("microservice implementation");
		SpringApplication.run(OrderserviceApplication.class, args);
	}

}
