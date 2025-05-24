package com.example.portfolioapi.controller;

import com.example.portfolioapi.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.portfolioapi.model.Project;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}
