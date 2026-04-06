package com.example.Authentication.authentication;
 

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Authentication.user.User;
import com.example.Authentication.user.UserRepository;

@Service

public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public String register(String username, String password)
    {
        if(userRepository.findByUsername(username).isPresent())
        {
            throw new RuntimeException("Username already exists");
        }

        String hashedPassword=passwordEncoder.encode(password);
        User user=new User();
        user.setUsername(username);
        user.setPassword(hashedPassword);
        userRepository.save(user);
        return "User Registered Successfully";

    }
    public String login(String username, String password)
    {
        User user=userRepository.findByUsername(username)
        .orElseThrow(()->new RuntimeException("User not found"));

        boolean isMatch=passwordEncoder.matches(password, user.getPassword());

        if(!isMatch)
        {
            throw new RuntimeException("Invalid Credentials");
        }

        return jwtUtil.generateToken(username);
    }



    


    

}