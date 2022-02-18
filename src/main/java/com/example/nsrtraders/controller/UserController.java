package com.example.nsrtraders.controller;

import com.example.nsrtraders.entity.User;
import com.example.nsrtraders.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/persons")
    private Iterable<User> getAllPersons() {
        return userService.findAll();
    }

    @GetMapping("/persons/{id}")
    private User getPerson(@PathVariable("id") int id) {
        return userService.getPersonById(id);
    }

    @DeleteMapping("/persons/{id}")
    private void deletePerson(@PathVariable("id") int id) {
        userService.delete(id);
    }

    @PostMapping("/persons")
    private int savePerson(@RequestBody User user) {
        userService.saveOrUpdate(user);
        return user.getId();
    }
}
