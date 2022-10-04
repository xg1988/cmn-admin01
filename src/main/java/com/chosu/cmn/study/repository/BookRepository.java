package com.chosu.cmn.study.repository;

import com.chosu.cmn.study.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
