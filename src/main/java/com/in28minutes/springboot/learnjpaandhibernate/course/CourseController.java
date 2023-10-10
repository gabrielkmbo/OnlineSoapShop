package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("/courses")
    public List<Course> getAll()
    {
        return service.findAll();
    }

    @PostMapping("/courses")

    public Course createCourse(@RequestBody CourseDTO course)
    {
        Course course1 = course.toCourse();
        return service.createCourse(course1);
    }
}
