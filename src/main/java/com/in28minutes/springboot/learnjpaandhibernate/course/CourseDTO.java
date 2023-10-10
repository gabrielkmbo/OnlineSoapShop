package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseDTO {

    @JsonProperty
    private long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String author;

    public CourseDTO(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Course toCourse()
    {
        return new Course(this.id, this.name, this.author);
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
