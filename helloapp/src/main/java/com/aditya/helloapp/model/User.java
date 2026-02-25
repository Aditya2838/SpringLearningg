package com.aditya.helloapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // avoid "user" (reserved in H2)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer age;
    private String name;

    public User() {}

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
