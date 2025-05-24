package com.example.portfolioapi.repository;

import com.example.portfolioapi.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
