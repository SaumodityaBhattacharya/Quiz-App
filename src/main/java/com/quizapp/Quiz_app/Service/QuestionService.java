package com.quizapp.Quiz_app.Service;
import com.quizapp.Quiz_app.Entity.Question;
import com.quizapp.Quiz_app.Repository.QuestionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    public void deleteQuestion(int id) {
        questionRepository.deleteById((long) id);
    }
}
