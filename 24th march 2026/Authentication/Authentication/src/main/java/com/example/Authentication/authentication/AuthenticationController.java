package com.example.Authentication.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    
    public final AuthService authService;

    public AuthenticationController(AuthService authService) {
        this.authService = authService;
    }
    
    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest request)
    {
        String message=authService.register(request.getUsername(), request.getPassword());
        return new AuthResponse(null, message); 
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request)
    {
        String token=authService.login(request.getUsername(), request.getPassword());
        return new AuthResponse(token, "Login Successful"); 
    }
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello, you are authenticated";
    }
    
}
