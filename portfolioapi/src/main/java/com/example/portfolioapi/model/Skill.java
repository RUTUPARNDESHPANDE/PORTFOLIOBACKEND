package com.example.portfolioapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Skills")
public class Skill {

    @Id
    private String id;
    private String name;
    private int level;

    public Skill() {}

    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getLevel() { return level; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLevel(int level) { this.level = level; }
}
