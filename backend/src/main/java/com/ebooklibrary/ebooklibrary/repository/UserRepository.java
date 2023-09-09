package com.ebooklibrary.ebooklibrary.repository;

import com.ebooklibrary.ebooklibrary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

