package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    CourseJpaRepository repository;

    public Optional<Course> findOneCourse (Long id) {
        return repository.findById(id);
    }

    public List<Course> findAll()
    {
        return repository.findAll();
    }

    public void deleteById(long id)
    {
        repository.deleteById(id);
    }

    public List<Course> findName(String name)
    {
        return repository.findByName(name);
    }

    public Course createCourse(Course course)
    {
        return repository.save(course);
    }
}
