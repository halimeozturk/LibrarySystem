package com.company.example.Library.Model;

import com.company.example.Library.Helper.Generate;

public class User {
    private String id;
    private String name;

    public User(String name) {
        this.name = name;
        generateId();
    }

    public User(){}
    public String getId() {
        return id;
    }

    public void generateId() {
        this.id = Generate.generateId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
