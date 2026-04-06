package com.example.Rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Rental.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity,Long> {
    
}
