package com.example.Rental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="login_record")
public class LoginEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
    private String userId;
    private String password;

}
