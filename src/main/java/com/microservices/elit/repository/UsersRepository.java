package com.microservices.elit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.elit.model.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
