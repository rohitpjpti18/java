package com.piedpiper.pipedpiper.repository;

import com.piedpiper.pipedpiper.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}