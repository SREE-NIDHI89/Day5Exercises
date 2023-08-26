package com.Day5Exercises.Day5Exercise1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Day5Exercises.Day5Exercise1.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
