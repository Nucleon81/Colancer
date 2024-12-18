package com.Project.Colancer.Reepository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Project.Colancer.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}

