package com.ticker.ticket_bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.ticker.ticket_bus.models"})
@EnableJpaRepositories(basePackages = {"com.ticker.ticket_bus.repositories"})
public class TicketBusApplication {
	public static void main(String[] args) {
		SpringApplication.run(TicketBusApplication.class, args);
	}

}