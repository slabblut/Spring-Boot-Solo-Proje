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
public class BebkaSpringApplication implements CommandLineRunner {

	private final StudentRepository studentRepository;
	private final BookRepository bookRepository;

	public BebkaSpringApplication(StudentRepository studentRepository, BookRepository bookRepository) {
		this.studentRepository = studentRepository;
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BebkaSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			Student student1 = new Student("sıla", 23);
			Student student2 = new Student("hilal", 25);

			Book book1 = new Book("java", "helin");
			Book book2 = new Book("yeşilfasulye", "sultan");

			student1.getBooks().add(book1);
			student2.getBooks().add(book2);

			book1.setStudent(student1);
			book2.setStudent(student2);

			studentRepository.save(student1);
			studentRepository.save(student2);

		}

	}

