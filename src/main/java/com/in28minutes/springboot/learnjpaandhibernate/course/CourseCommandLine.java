package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseCommandLine {

    private CourseJpaRepository repository;
    public void run(String[] args)
    {
        repository.save(new Course(1, "Learn AWS", "Gabriel Bo"));
        repository.save(new Course(1, "Learn Java", "Grace Gu"));
        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(2l));
        System.out.println(repository.findByName("Gabriel Bo"));
    }
}
