package com.paulomendes.bookstoremanager.repository;

import com.paulomendes.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
