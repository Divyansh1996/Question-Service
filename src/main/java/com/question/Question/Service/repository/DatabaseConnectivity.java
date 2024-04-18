package com.question.Question.Service.repository;

import com.question.Question.Service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseConnectivity extends JpaRepository<Question, Integer> {
}
