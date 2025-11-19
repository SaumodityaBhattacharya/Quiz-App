package com.quizapp.Quiz_app.Service;

import com.quizapp.Quiz_app.Entity.User;
import com.quizapp.Quiz_app.Repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public boolean login(String username, String rawPassword) {
        User user = userRepository.findByUsername(username);

        if (user == null) return false;
        return passwordEncoder.matches(rawPassword, user.getPassword());
    }
}
