package com.example.portfolioapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Project")
public class Project {

    @Id
    private String id;
    private String title;
    private String description;
    private String technologies;
    private String link;

    public Project() {}

    public Project(String title, String description, String technologies, String link) {
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.link = link;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getTechnologies() { return technologies; }
    public void setTechnologies(String technologies) { this.technologies = technologies; }

    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }
}
