package com.ebooklibrary.ebooklibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebooklibrary.ebooklibrary.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
