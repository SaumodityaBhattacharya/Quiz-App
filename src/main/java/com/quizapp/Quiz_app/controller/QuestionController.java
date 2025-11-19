package com.quizapp.Quiz_app.controller;

import com.quizapp.Quiz_app.Entity.Question;
import com.quizapp.Quiz_app.Service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getAll() {
        return questionService.getAllQuestions();
    }

    @PostMapping
    public Question add(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        questionService.deleteQuestion(id);
    }
}
