package com.myshopping.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MyShoppingGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyShoppingGatewayApplication.class, args);
	}

}
