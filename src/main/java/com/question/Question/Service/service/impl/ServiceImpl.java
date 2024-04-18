package com.question.Question.Service.service.impl;

import com.question.Question.Service.model.Question;
import com.question.Question.Service.repository.DatabaseConnectivity;
import com.question.Question.Service.service.Service;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    private DatabaseConnectivity repository;

    public ServiceImpl(DatabaseConnectivity repository) {
        this.repository = repository;
    }

    @Override
    public Question postData(Question question) {
        repository.save(question);
        return question;
    }

    @Override
    public Question getData(int questionId) {
        Question question = repository.findById(questionId).orElseThrow(()->new RuntimeException("Data not found for questionId = "+questionId));
        return question;
    }

    @Override
    public List<Question> getAllData() {
        return repository.findAll();
    }
}
