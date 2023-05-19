package com.sid.inventoryservice;

import com.sid.inventoryservice.entity.Product;
import com.sid.inventoryservice.reo.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
@Bean
	CommandLineRunner start(ProductRepo productRepo){
		return args -> {
			productRepo.saveAll(List.of(
					Product.builder().name("1").price(24.9).quantity(10).build(),
					Product.builder().name("2").price(29.5).quantity(10).build(),
					Product.builder().name("3").price(27.4).quantity(10).build()

			));
		};
}
}
