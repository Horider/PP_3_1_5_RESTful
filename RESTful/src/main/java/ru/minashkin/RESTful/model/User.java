package ru.minashkin.RESTful.model;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String name;
    private String lastName;
    private Byte age;

    public User() {
    }
}