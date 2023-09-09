package com.ebooklibrary.ebooklibrary.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.ebooklibrary.ebooklibrary.model.User;

public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    void testCreate() {
        User user = new User();
        user.setName("Teste");
        user.setEmail("test@teste.com");
        User userCreated = userService.create(user);
        assertEquals(userCreated.getName(), user.getName());
        assertEquals(userCreated.getEmail(), userCreated.getEmail());
        assertNotNull(userCreated.getId());
    }

    @Test
    void testDelete() {
       
    }

    @Test
    void testGetById() {

    }

    @Test
    void testIndex() {

    }

    @Test
    void testUpdate() {

    }
}
