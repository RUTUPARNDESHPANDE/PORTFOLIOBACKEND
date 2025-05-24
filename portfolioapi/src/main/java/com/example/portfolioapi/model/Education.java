package com.example.portfolioapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Education")
public class Education {

    @Id
    private String id;
    private String institution;
    private String degree;
    private String startYear;
    private String endYear;

    // Constructors
    public Education() {}

    public Education(String institution, String degree, String startYear, String endYear) {
        this.institution = institution;
        this.degree = degree;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getInstitution() { return institution; }
    public void setInstitution(String institution) { this.institution = institution; }

    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }

    public String getStartYear() { return startYear; }
    public void setStartYear(String startYear) { this.startYear = startYear; }

    public String getEndYear() { return endYear; }
    public void setEndYear(String endYear) { this.endYear = endYear; }
}
