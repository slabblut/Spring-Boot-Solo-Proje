package com.sila.Bebka_Spring;

import com.sila.Bebka_Spring.service.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BebkaSpringApplication implements CommandLineRunner {

	private final MessageService messageService;

	public BebkaSpringApplication(MessageService messageService) {
		this.messageService = messageService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BebkaSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		messageService.sendMessage("Merhaba, Spring Boot çalışıyor!");
	}
}
