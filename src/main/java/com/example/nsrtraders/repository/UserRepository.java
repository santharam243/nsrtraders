package com.example.nsrtraders.repository;

import com.example.nsrtraders.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
