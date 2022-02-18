package com.example.nsrtraders.service;

import com.example.nsrtraders.entity.User;
import com.example.nsrtraders.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User getPersonById(int id) {
        return userRepository.findById(id).get();
    }

    public void saveOrUpdate(User person) {
        userRepository.save(person);
    }

    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
