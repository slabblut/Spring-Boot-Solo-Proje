package com.sila.Bebka_Spring.repository;

import com.sila.Bebka_Spring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}