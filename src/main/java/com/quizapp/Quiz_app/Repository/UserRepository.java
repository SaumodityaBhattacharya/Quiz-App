package com.quizapp.Quiz_app.Repository;

import com.quizapp.Quiz_app.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
