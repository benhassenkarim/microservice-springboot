package com.sid.clientservice;

import com.sid.clientservice.entities.Client;
import com.sid.clientservice.repo.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}
@Bean
	CommandLineRunner start(ClientRepository clientRepository){
		return args -> {
			clientRepository.saveAll(List.of(
					Client.builder().name("karim").email("karim@gmail.com").build(),
					Client.builder().name("tarek").email("tarek@gmail.com").build(),
					Client.builder().name("maha").email("maha@gmail.com").build()

			));
			clientRepository.findAll().forEach(System.out::println);
		};
}
}
