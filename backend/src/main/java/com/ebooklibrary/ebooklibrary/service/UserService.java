package com.ebooklibrary.ebooklibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebooklibrary.ebooklibrary.model.User;
import com.ebooklibrary.ebooklibrary.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> index() {
        return userRepository.findAll();
    }

    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User update(Long id, User user) {
        User userToUpdate = userRepository.findById(id).get();
        userToUpdate.setName(user.getName());
        userToUpdate.setEmail(user.getEmail());
        return userRepository.save(userToUpdate);
    }

    public void delete(Long id) throws Exception {
        if (userRepository.findById(id).isEmpty()) {
            throw new Exception("User not found");
        }
        userRepository.deleteById(id);
    }
}
