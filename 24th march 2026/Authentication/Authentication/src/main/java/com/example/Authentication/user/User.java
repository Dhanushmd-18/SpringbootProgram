package com.example.Authentication.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)   // ❗ remove unique from password
    private String password;

    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}