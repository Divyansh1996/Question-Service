package com.question.Question.Service.service;

import com.question.Question.Service.model.Question;

import java.util.List;

public interface Service {

    public Question postData(Question question);
    public Question getData(int questionId);
    public List<Question> getAllData();
}
