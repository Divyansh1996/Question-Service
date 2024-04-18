package com.question.Question.Service.controller;

import com.question.Question.Service.model.Question;
import com.question.Question.Service.service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping
    public Question postData(@RequestBody Question question){
        service.postData(question);
        return question;
    }

    @GetMapping("/{questionId}")
    public Question getDataById(@PathVariable int questionId){
        return service.getData(questionId);
    }

    @GetMapping("/getAllData")
    public List<Question> getAllData(){
        return service.getAllData();
    }

}
