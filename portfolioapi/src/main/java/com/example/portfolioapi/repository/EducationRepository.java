package com.example.portfolioapi.repository;

import com.example.portfolioapi.model.Education;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EducationRepository extends MongoRepository<Education, String> {
}
