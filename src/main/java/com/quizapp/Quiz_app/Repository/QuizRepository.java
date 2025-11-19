package com.quizapp.Quiz_app.Repository;
import com.quizapp.Quiz_app.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
public interface QuizRepository extends JpaRepository<Quiz, Long> {}
