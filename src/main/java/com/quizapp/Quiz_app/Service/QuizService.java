package com.quizapp.Quiz_app.Service;

import com.quizapp.Quiz_app.Entity.Question;
import com.quizapp.Quiz_app.Entity.Quiz;
import com.quizapp.Quiz_app.Repository.QuestionRepository;
import com.quizapp.Quiz_app.Repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;

    public QuizService(QuizRepository quizRepository, QuestionRepository questionRepository) {
        this.quizRepository = quizRepository;
        this.questionRepository = questionRepository;
    }

    // Create Quiz
    public Quiz createQuiz(String title, String description, List<Long> questionIds) {
        List<Question> questions = questionRepository.findAllById(questionIds);

        Quiz quiz = new Quiz(title, description, questions);
        return quizRepository.save(quiz);
    }

    // Get quiz by id
    public Quiz getQuiz(int id) {
        return quizRepository.findById((long) id).orElse(null);
    }

    // Get all quizzes
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    // Delete quiz
    public void deleteQuiz(int id) {
        quizRepository.deleteById((long) id);
    }
}
