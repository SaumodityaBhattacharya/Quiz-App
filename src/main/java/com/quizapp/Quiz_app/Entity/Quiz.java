package com.quizapp.Quiz_app.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;

    @OneToMany
    private List<Question> questions;

    // Constructors
    public Quiz() {}

    public Quiz(String title, String description, List<Question> questions) {
        this.title = title;
        this.description = description;
        this.questions = questions;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
