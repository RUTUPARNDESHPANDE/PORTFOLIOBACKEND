package com.example.portfolioapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "About")
public class About {

    @Id
    private String id;

    private String name;
    private int age;
    private String address;
    private String email;
    private long contactNo;
    private String description;

    // Constructors
    public About() {}

    public About(String name, String description, int age, String address, String email, long contactNo) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.address = address;
        this.email = email;
        this.contactNo = contactNo;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public long getContactNo() { return contactNo; }
    public void setContactNo(long contactNo) { this.contactNo = contactNo; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
