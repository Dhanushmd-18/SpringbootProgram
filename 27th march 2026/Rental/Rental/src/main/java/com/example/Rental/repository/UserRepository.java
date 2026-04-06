package com.example.Rental.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Rental.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByname(String name);
    boolean existsByname(String name);
    
}
