package com.ebooklibrary.ebooklibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebooklibrary.ebooklibrary.model.EBook;

public interface EBookRepository extends JpaRepository<EBook, Long> {

}
