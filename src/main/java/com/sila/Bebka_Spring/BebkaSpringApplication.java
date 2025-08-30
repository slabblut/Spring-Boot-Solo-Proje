package com.sila.Bebka_Spring;

import com.sila.Bebka_Spring.model.Book;
import com.sila.Bebka_Spring.model.Student;
import com.sila.Bebka_Spring.repository.BookRepository;
import com.sila.Bebka_Spring.repository.StudentRepository;
import com.sila.Bebka_Spring.service.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BebkaSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(BebkaSpringApplication.class, args);
	}
}

