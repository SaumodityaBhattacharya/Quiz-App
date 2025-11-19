package com.quizapp.Quiz_app.controller;
import com.quizapp.Quiz_app.Entity.Quiz;
import com.quizapp.Quiz_app.Service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    // Create Quiz
    @PostMapping
    public Quiz createQuiz(@RequestBody Map<String, Object> request) {
        String title = (String) request.get("title");
        String description = (String) request.get("description");
        List<Integer> intIds = (List<Integer>) request.get("questionIds");

        List<Long> questionIds = intIds.stream()
                .map(Integer::longValue)
                .toList();
        return quizService.createQuiz(title, description, questionIds);
    }
    // Get quiz by ID
    @GetMapping("/{id}")
    public Quiz getQuiz(@PathVariable int id) {
        return quizService.getQuiz(id);
    }

    // Get all quizzes
    @GetMapping
    public List<Quiz> getAll() {
        return quizService.getAllQuizzes();
    }

    // Delete quiz
    @DeleteMapping("/{id}")
    public void deleteQuiz(@PathVariable int id) {
        quizService.deleteQuiz(id);
    }
}
