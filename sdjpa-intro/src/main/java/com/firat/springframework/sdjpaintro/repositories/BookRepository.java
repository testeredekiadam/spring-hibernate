package com.firat.springframework.sdjpaintro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firat.springframework.sdjpaintro.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
