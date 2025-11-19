package com.quizapp.Quiz_app.controller;

import com.quizapp.Quiz_app.Entity.User;
import com.quizapp.Quiz_app.Service.AuthService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> loginData) {
        boolean success = authService.login(
                loginData.get("username"),
                loginData.get("password")
        );

        return success ? "Login successful" : "Invalid credentials";
    }
}
