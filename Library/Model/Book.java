package com.company.example.Library.Model;

import com.company.example.Library.Helper.Generate;

public class Book {

    private String id;
    private String name;
    private String authorId;

    public Book(String name){
        this.name = name;
        generateId();

    }
    public Book(){}

    public String getId() {
        return id;
    }

    public void generateId() {
        this.id = Generate.generateId();
        this.authorId = Generate.generateId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorId() {
        return authorId;
    }


}
