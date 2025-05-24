package com.example.portfolioapi.controller;

import com.example.portfolioapi.model.Education;
import com.example.portfolioapi.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/education")
@CrossOrigin(origins = "*")
public class EducationController {

    @Autowired
    private EducationRepository educationRepository;

    @GetMapping
    public List<Education> getAllEducation() {
        return educationRepository.findAll();
    }
}
